/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.controllers.admin;

import duongas.daos.BookDAO;
import duongas.dtos.BookDTO;
import duongas.dtos.BookErrorDTO;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DUONGAS
 */
@WebServlet(name = "AddBookController", urlPatterns = {"/AddBookController"})
public class AddBookController extends HttpServlet {

    private final static String ERROR = "createBook.jsp";
    private final static String SUCCESS = "LoadAllBookController";

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
        String url = ERROR;
        boolean bErr = false;
        try {
            String id = request.getParameter("txtId").trim();
            String title = request.getParameter("txtTitle").trim();
            String img = request.getParameter("txtImg");
            String quantityStr = request.getParameter("txtQuantity");
            String priceStr = request.getParameter("txtPrice");
            String author = request.getParameter("txtAuthor");
            String category = request.getParameter("txtCategory").trim();
            String description = request.getParameter("txtDescription");
            int quantity=0;
            double price=0;
            BookErrorDTO err = new BookErrorDTO();
            BookDAO dao = new BookDAO();
            if (!id.matches("[A-Za-z1-9_\\s]+") && id.length() > 10) {
                bErr = true;
                err.setIdErr("ID: Max length is 10 and not contains special characters");
            }
            if (id.isEmpty()) {
                bErr = true;
                err.setIdErr("The ID is empty");
            }
            if(dao.checkBookID_Dub(id)){
                bErr= true;
                err.setIdErr("The ID is duplicated");
            }
            if (title.isEmpty()) {
                bErr = true;
                err.setTitleErr("The title is empty");
            }
            if (img.isEmpty()) {
                bErr = true;
                err.setImgErr("The link of image is empty");
            }
            if (!quantityStr.isEmpty()) {
                try {
                    quantity = Integer.parseInt(quantityStr);
                    if (quantity < 1) {
                        bErr = true;
                        err.setQuantityErr("The quantity must be number more than 0");
                    }
                } catch (Exception e) {
                    bErr = true;
                    err.setQuantityErr("The quantity must be number more than 0");
                }
            } else {
                bErr = true;
                err.setQuantityErr("The quantity is empty");
            }
            if (priceStr.isEmpty()) {
                bErr = true;
                err.setPriceErr("The price is empty");
            } else {
                try {
                    price = Double.parseDouble(priceStr);
                    if (price <= 0) {
                        bErr = true;
                        err.setPriceErr("The price must be a number more than 0");
                    }
                } catch (Exception e) {
                    bErr = true;
                    err.setPriceErr("The price must be a number more than 0");
                }
            }
            if(author.isEmpty()){
                bErr = true;
                err.setAuthorErr("The author is empty");
            }
            if(category.isEmpty()){
                bErr = true;
                err.setCategoryErr("The category is empty");
            }
            if (bErr) {
                request.setAttribute("ERROR", err);
                url = ERROR;
            } else {
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                Date date = new Date();
                String strCurrentDate = formatter.format(date);
                BookDTO book = new BookDTO(id, title, img, description, author, category, strCurrentDate, price, quantity, true);
                dao.insertBook(book);
                url = SUCCESS;
            }

        } catch (Exception e) {
            log("AddBookServlet: "+ e.getMessage());
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
