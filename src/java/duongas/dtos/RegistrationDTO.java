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
public class RegistrationDTO {
    private String username, password, lastname, address, phone;
    boolean isAdmin;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String lastname, boolean isAdmin) {
        this.lastname = lastname;
        this.isAdmin = isAdmin;
    }

    public RegistrationDTO(String username, String lastname, String address, String phone, boolean isAdmin) {
        this.username = username;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.isAdmin = isAdmin;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
    

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    

    
    
}
