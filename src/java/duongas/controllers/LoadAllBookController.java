/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.controllers;

import duongas.daos.BookDAO;
import duongas.dtos.BookDTO;
import duongas.dtos.RegistrationDTO;
import java.io.IOException;
import java.sql.SQLException;
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
@WebServlet(name = "LoadAllBookController", urlPatterns = {"/LoadAllBookController"})
public class LoadAllBookController extends HttpServlet {

    private final String HOME_PAGE = "home.jsp";
    private final String ADMIN_PAGE = "adminPage.jsp";

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
        String url = HOME_PAGE;
        
        HttpServletRequest req = (HttpServletRequest) request;
        String uri = req.getRequestURI();
        System.out.println(uri);
        System.out.println(uri.lastIndexOf("/"));
        System.out.println(uri.substring(11));
        
        HttpSession session = request.getSession();
        RegistrationDTO reg = (RegistrationDTO) session.getAttribute("NAME");
        try {
            BookDAO dao = new BookDAO();
            dao.loadAllBook();
            List<BookDTO> result = dao.getListBook();
            request.setAttribute("BOOK", result);
            //the first run time reg=null
            if (reg != null) {
                if (reg.isIsAdmin()) {
                    url = ADMIN_PAGE;
                } else {
                    url = HOME_PAGE;
                }
            }
        } catch (SQLException ex) {
            log("LoadBookServlet_SQL: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            log("LoadBookServlet_ClassNotFound: " + ex.getMessage());
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
