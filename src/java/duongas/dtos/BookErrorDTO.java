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
public class BookErrorDTO implements Serializable{
    private String idErr, titleErr, imgErr, priceErr, authorErr, quantityErr, categoryErr;

    public BookErrorDTO() {
    }

    public BookErrorDTO(String idErr, String titleErr, String imgErr, String priceErr, String athorErr, String quantityErr, String categoryErr) {
        this.idErr = idErr;
        this.titleErr = titleErr;
        this.imgErr = imgErr;
        this.priceErr = priceErr;
        this.authorErr = athorErr;
        this.quantityErr = quantityErr;
        this.categoryErr = categoryErr;
    }
    

    public String getIdErr() {
        return idErr;
    }

    public void setIdErr(String idErr) {
        this.idErr = idErr;
    }

    public String getTitleErr() {
        return titleErr;
    }

    public void setTitleErr(String titleErr) {
        this.titleErr = titleErr;
    }

    public String getImgErr() {
        return imgErr;
    }

    public void setImgErr(String imgErr) {
        this.imgErr = imgErr;
    }

    public String getPriceErr() {
        return priceErr;
    }

    public void setPriceErr(String priceErr) {
        this.priceErr = priceErr;
    }

    public String getAuthorErr() {
        return authorErr;
    }

    public void setAuthorErr(String athorErr) {
        this.authorErr = athorErr;
    }

    public String getQuantityErr() {
        return quantityErr;
    }

    public void setQuantityErr(String QuantityErr) {
        this.quantityErr = QuantityErr;
    }

    public String getCategoryErr() {
        return categoryErr;
    }

    public void setCategoryErr(String categoryErr) {
        this.categoryErr = categoryErr;
    }
    
    
}
