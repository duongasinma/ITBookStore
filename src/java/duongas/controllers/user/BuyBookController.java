/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.controllers.user;

import duongas.daos.BookDAO;
import duongas.daos.DiscountDAO;
import duongas.daos.OrderDAO;
import duongas.dtos.BookDTO;
import duongas.dtos.BookErrorDTO;
import duongas.dtos.CartObj;
import duongas.dtos.OrderDetailDTO;
import duongas.dtos.RegistrationDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DUONGAS
 */
@WebServlet(name = "BuyBookController", urlPatterns = {"/BuyBookController"})
public class BuyBookController extends HttpServlet {

    private final String cartPage = "cart.jsp";
    private final String loadAllBookController = "LoadAllBookController";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = cartPage;
        try {
            HttpSession session = request.getSession();
            RegistrationDTO res = (RegistrationDTO) session.getAttribute("NAME");
            CartObj cart = (CartObj) session.getAttribute("CART");
            String address = request.getParameter("txtAddress");
            String phone = request.getParameter("txtPhone");
            String total = request.getParameter("txtTotal");
            String code = request.getParameter("txtDiscount");

            ArrayList<String> bookOutOfStock = new ArrayList<>();
            BookDAO dao = new BookDAO();
            BookErrorDTO err = new BookErrorDTO();
            boolean check = true;
            Collection<BookDTO> colBook = cart.getItems().values();
            List<BookDTO> listBook = new ArrayList<>(colBook);

            for (BookDTO book : listBook) {
                if (!dao.checkBookQuantity(book)) {
                    check = false;
                    bookOutOfStock.add(book.getId());
                }
            }
            if (address.isEmpty()) {
                err.setTitleErr("Address is null");// adddressErr
                check = false;
            }
            if ((phone.length() > 12 || phone.length() < 5) || (phone.trim().isEmpty()) || !phone.matches("\\d+")) {
                err.setCategoryErr("The phone number must have 5-12 numbers");// phoneErr
                check = false;
            }
            if (check) {
                OrderDAO orderDao = new OrderDAO();
                int orderId = orderDao.getPreviousOrderId();
                if (orderId == 0) {
                    orderId = 1;
                } else {
                    orderId = orderId + 1;                  
                }
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                Date date = new Date();
                String orderDate = formatter.format(date);
                boolean result = orderDao.insertOrder(orderId, res.getUsername(), address, phone, orderDate, Double.parseDouble(total));
                if (result) {
                    int count = 1;
                    for (BookDTO book : cart.getItems().values()) {
                        String orderDetailId = orderId + "-" + count++;
                        String bookId = book.getId();
                        String bookTitle = book.getTitle();
                        String bookImg = book.getImg();
                        double price = book.getPrice();
                        int quantity = book.getQuantity();
                        OrderDetailDTO orderDetail = new OrderDetailDTO(orderDetailId, orderId, bookId, bookTitle, bookImg, price, quantity);
                        orderDao.insertOrderDetial(orderDetail);// co the insert them title and img
                        //update quantity
                        int currentQuantity = dao.getBookQuantity(book.getId());
                        dao.updateBookQuantity(book, currentQuantity);
                    }
                    if(!code.trim().isEmpty()){
                        DiscountDAO disDAO= new DiscountDAO();
                        disDAO.deleteDiscount(code);
                    }
                    url=loadAllBookController;
                    request.setAttribute("DONE", "successful");
                    session.removeAttribute("CART");
                }
            } else {
                request.setAttribute("ERROR", err);
                request.setAttribute("QUANTITY_ERROR", bookOutOfStock);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
