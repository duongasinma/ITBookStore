/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.daos;

import duongas.dtos.DiscountDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilities.MyConnection;

/**
 *
 * @author DUONGAS
 */
public class DiscountDAO implements Serializable {

    public boolean insertDiscount(DiscountDTO discount) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        int row = 0;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "insert into Discount(disId, disPercent, disCreateDate, disEndDate) values(?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, discount.getId());
                stm.setInt(2, discount.getPercent());
                stm.setString(3, discount.getCreateDate());
                stm.setString(4, discount.getEndDate());
                row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public DiscountDTO getDiscount_byId(String ID) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = utilities.MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select disId, disPercent, disCreateDate, disEndDate From Discount "
                        + "where disId=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, ID);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String id = rs.getString("disId");
                    int percent = rs.getInt("disPercent");
                    String createDate = rs.getString("disCreateDate");
                    String endDate = rs.getString("disEndDate");
                    DiscountDTO dis = new DiscountDTO(id, createDate, endDate, percent);
                    return dis;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public boolean checkDiscountDate(DiscountDTO discount) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select DATEDIFF(day, (Select GETDATE()), ?) as date";
                stm = con.prepareStatement(sql);
                stm.setString(1, discount.getEndDate());
                rs = stm.executeQuery();
                if (rs.next()) {
                    if (rs.getInt("date") >= 0) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    public boolean deleteDiscount( String code) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        int row = 0;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "delete from Discount "
                        + " where disId=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, code);
                row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
}
