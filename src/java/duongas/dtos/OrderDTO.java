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
public class OrderDTO implements Serializable{
    private String orderId, userId, address, phone, date;
    private double total ;

    public OrderDTO(String orderId, String userId, String address, String phone, double total, String date) {
        this.orderId = orderId;
        this.userId = userId;
        this.address = address;
        this.phone = phone;
        this.total = total;
        this.date = date;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
