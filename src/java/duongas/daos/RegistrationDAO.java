/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.daos;

import duongas.dtos.RegistrationDTO;
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
public class RegistrationDAO implements Serializable{
    public RegistrationDTO checkLogin(String _username, String password) throws SQLException, ClassNotFoundException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            con= utilities.MyConnection.getMyConnection();
            if(con!=null){
                String sql= "Select username, lastname, isAdmin, phone, address "
                        + "From Registration "
                        + "Where username=? and password=?";
                stm= con.prepareStatement(sql);
                stm.setString(1, _username);
                stm.setString(2, password);
                rs= stm.executeQuery();
                if(rs.next()){
                    String username = rs.getString("username");
                    String name = rs.getString("lastname");
                    boolean role = rs.getBoolean("isAdmin");
                    String phone = rs.getString("phone");
                    String address = rs.getString("address");
                    RegistrationDTO dto= new RegistrationDTO(username, name, address, phone, role);
                    return dto;
                }
            }
        }
        finally{
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
    public boolean insertAccount(RegistrationDTO dto) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        int row = 0;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "insert into Registration(username, password, lastname, phone, address, isAdmin) values(?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getUsername());
                stm.setString(2, dto.getPassword());
                stm.setString(3, dto.getLastname());
                stm.setString(4, dto.getPhone());
                stm.setString(5, dto.getAddress());              
                stm.setBoolean(6, dto.isIsAdmin());
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
