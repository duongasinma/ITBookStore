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
public class DiscountDTO implements Serializable{
    private String id, createDate, EndDate;
    private int percent;

    public DiscountDTO(String id, String createDate, String EndDate, int percent) {
        this.id = id;
        this.createDate = createDate;
        this.EndDate = EndDate;
        this.percent = percent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
    
}
