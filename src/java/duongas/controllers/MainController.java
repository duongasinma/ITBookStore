/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DUONGAS
 */
public class MainController extends HttpServlet {
    private final String LOAD_CONTROLLER="LoadAllBookController";
    private final String HOME_PAGE = "home.jsp";
    private final String LOGIN_CONTROLLER = "LoginController";
    private final String LOGIN_GG_CONTROLLER = "LoginGoogleController";
    private final String LOGOUT_CONTROLLER = "LogoutController";
    private final String SEARCH_CONTROLLER = "SearchController";
    private final String ADD_BOOK_CONTROLLER="AddBookController";
    private final String SHOW_UPDATE_BOOK_PAGE_CONTROLLER="ShowUpdatePage";
    private final String UPDATE_BOOK_CONTROLLER = "UpdateBookController";
    private final String DELETE_BOOK_CONTROLLER = "DeleteBookController";
    private final String ADD_BOOK_TO_CART_CONTROLLER = "AddBookToCartController";
    private final String UPDATE_CART_QUANTITY_CONTROLLER = "UpdateCartQuantityController";
    private final String DELETE_BOOK_FROM_CART_CONTROLLER = "DeleteBookFromCartController";
    private final String BUY_BOOK_CONTROLLER = "BuyBookController";
    private final String CREATE_DISCOUNT_CONTROLLER = "CreateDiscountController";
    private final String USE_DISCOUNT_CONTROLLER = "UseDiscountController";
    private final String SHOW_HISTORY_PAGE_CONTROLLER="ShowHistoryPageController";
    private final String SHOW_ORDER_DETAIL_CONTROLLER = "ShowOrderDetailController";
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
        String button = request.getParameter("btAction");
        String url = LOAD_CONTROLLER;
        
        HttpServletRequest req = (HttpServletRequest) request;
        String uri = req.getRequestURI();
        System.out.println(uri);
        System.out.println(uri.lastIndexOf("/"));
        
        try{
            if(button.equals("login")){
                url=LOGIN_CONTROLLER;
            }
            if(button.equals("loginGG")){
                url=LOGIN_GG_CONTROLLER;
            }
            if(button.equals("logout")){
                url=LOGOUT_CONTROLLER;
            }
            if(button.equals("search")){
                url=SEARCH_CONTROLLER;
            }
            if(button.equals("create")){
                url=ADD_BOOK_CONTROLLER;
            }
            if(button.equals("showUpdatePage")){
                url=SHOW_UPDATE_BOOK_PAGE_CONTROLLER;
            }
            if(button.equals("update")){
                url= UPDATE_BOOK_CONTROLLER;
            }
            if(button.equals("deleteBook")){
                url = DELETE_BOOK_CONTROLLER;
            }
            if(button.equals("addToCart")){
                url = ADD_BOOK_TO_CART_CONTROLLER;
            }
            if(button.equals("update cart quantity")){
                url = UPDATE_CART_QUANTITY_CONTROLLER;
            }
            if(button.equals("deleteCart")){
                url = DELETE_BOOK_FROM_CART_CONTROLLER;
            }
            if(button.equals("Buy")){
                url = BUY_BOOK_CONTROLLER;
            }
            if(button.equals("Create")){
                url = CREATE_DISCOUNT_CONTROLLER;
            }
            if(button.equals("exit")){
                url = LOAD_CONTROLLER;
            }
            if(button.equals("Use code")){
                url = USE_DISCOUNT_CONTROLLER;
            }
            if(button.equals("show history")){
                url=SHOW_HISTORY_PAGE_CONTROLLER;
            }
            if(button.equals("view detail")){
                url=SHOW_ORDER_DETAIL_CONTROLLER;
            }
        }
        finally {
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
