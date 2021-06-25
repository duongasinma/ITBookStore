/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.controllers.user;

import duongas.daos.BookDAO;
import duongas.dtos.BookDTO;
import duongas.dtos.CartObj;
import duongas.dtos.RegistrationDTO;
import java.io.IOException;
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
@WebServlet(name = "AddBookToCartController", urlPatterns = {"/AddBookToCartController"})
public class AddBookToCartController extends HttpServlet {

    private final String loadAllBookController = "LoadAllBookController";
    private final String loginPage = "login.jsp";

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
        String url=loginPage;
        try {
            HttpSession session = request.getSession();
            RegistrationDTO res = (RegistrationDTO) session.getAttribute("NAME");
            if(res != null){
                if(!res.isIsAdmin()){
                    CartObj cart = (CartObj) session.getAttribute("CART");
                    if(cart == null){
                        cart= new CartObj();
                    }
                    String id= request.getParameter("txtId").trim();
                    BookDAO dao = new BookDAO();
                    BookDTO book = dao.getBookDetail_byId(id);
                    cart.addBookToCart(book);
                    session.setAttribute("CART", cart);
                    url=loadAllBookController;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            response.sendRedirect(url);
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
