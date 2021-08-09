/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.dtos;

/**
 *
 * @author DUONGAS
 */
public class OrderDetailDTO {
    private int orderId;
    private String detailId, bookId, bookTitle, bookImg;
    private double price;
    private int quantity;

    public OrderDetailDTO(String detailId, int orderId, String bookId, double price, int quantity) {
        this.detailId = detailId;
        this.orderId = orderId;
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderDetailDTO(String detailId, int orderId, String bookId, String bookTitle, String bookImg, double price, int quantity) {
        this.detailId = detailId;
        this.orderId = orderId;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookImg = bookImg;
        this.price = price;
        this.quantity = quantity;
    }
    

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
