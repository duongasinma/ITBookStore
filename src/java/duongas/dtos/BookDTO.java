/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.dtos;

import java.io.Serializable;

/**
 *
 * @author DUONGAS
 */
public class BookDTO implements Serializable{
    private String id, title, img, description, author, category, createDate;
    private double price;
    private int quantity;
    private boolean status;
    

    public BookDTO() {
    }

    public BookDTO(String id, String title, String img, String description, String author, String category, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.description = description;
        this.author = author;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public BookDTO(String id, String title, String img, String description, String author, String category, String createDate, double price, int quantity, boolean status) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.description = description;
        this.author = author;
        this.category = category;
        this.createDate=createDate;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titile) {
        this.title = titile;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public boolean isStatus() {
        return status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
