/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.daos;

import duongas.dtos.OrderDTO;
import duongas.dtos.OrderDetailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author DUONGAS
 */
public class OrderDAO {
    public String getPreviousOrderId() throws SQLException, NamingException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            conn = utilities.MyConnection.getMyConnection();
            if (conn != null) {
                String sql = "select orderId from Orders where orderId = (select MAX(orderId) from Orders ) ";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String id = rs.getString("orderId");
                    return id;
                }
            } //end if con is opened
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return null;
    }

    public boolean insertOrder(String id, String user, String address, String phone, String date, double total) throws SQLException, NamingException {
        Connection conn = null;
        PreparedStatement stm = null;
        int row = 0;
        try {
            //1.connect DB;
            conn = utilities.MyConnection.getMyConnection();
            if (conn != null) {
                //2. create sql String
                String sql = "insert into Orders(orderId, userId, total, orderAddress, orderPhone, orderDate) values(?,?,?,?,?,?)";
                //3 create stm and assgin
                stm = conn.prepareStatement(sql);
                stm.setString(1, id);
                stm.setString(2, user);
                stm.setDouble(3, total);
                stm.setString(4, address);
                stm.setString(5, phone);
                stm.setString(6, date);
                
                //4 excute query
                row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }

            } //end if con is opened
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return false;
    }
    public boolean insertOrderDetial(OrderDetailDTO dto) throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        int row=0;
        try {
            //1.connect DB;
            con = utilities.MyConnection.getMyConnection();
            if (con != null) {
                //2. create sql String
                String sql = "insert into OrderDetail(detailId, orderId, bookId, price, quantity, bookTitle, bookImg) values(?,?,?,?,?,?,?)";
                //3 create stm and assgin
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getDetailId());  
                stm.setString(2, dto.getOrderId());  
                stm.setString(3, dto.getBookId());
                stm.setDouble(4, dto.getPrice());
                stm.setInt(5, dto.getQuantity());
                stm.setString(6, dto.getBookTitle());
                stm.setString(7, dto.getBookImg());
                //4 excute query
                row= stm.executeUpdate();
                if(row>0) 
                    return true;
                
            } //end if con is opened
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
           
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return false;
    }
    private List<OrderDTO> listOrder = null;
    private List<OrderDetailDTO> listOrderDetail = null;

    public List<OrderDTO> getListOrder() {
        return listOrder;
    }

    public List<OrderDetailDTO> getListOrderDetail() {
        return listOrderDetail;
    }
    
    public void getListOrder(String username) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = utilities.MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select orderId, userId, orderAddress, orderPhone, orderDate, total from Orders where userId=? order by orderDate DESC";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("orderId");
                    String user = rs.getString("userId");
                    String add = rs.getString("orderAddress");
                    String phone = rs.getString("orderPhone");
                    String date = rs.getString("orderDate");
                    double total = rs.getDouble("total");
                    
                    OrderDTO order = new OrderDTO(id, user, add, phone, total, date) ;
                    if (listOrder == null) {
                        listOrder = new ArrayList<>();
                    }
                    listOrder.add(order);
                }

            }
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
    }
public void getListOrderDetail(String orderId) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = utilities.MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select detailId, orderId, bookId, price, quantity, bookTitle, bookImg From OrderDetail Where orderId=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, orderId);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String detailId = rs.getString("detailId");
                    String book = rs.getString("bookId");
                    String order = rs.getString("orderId");                   
                    double price = rs.getDouble("price");
                    int quantity = rs.getInt("quantity");
                    String title = rs.getString("bookTitle");
                    String img = rs.getString("bookImg");
                    OrderDetailDTO detail = new OrderDetailDTO(detailId, order, book, title, img, price, quantity);
                    if (listOrderDetail == null) {
                        listOrderDetail = new ArrayList<>();
                    }
                    listOrderDetail.add(detail);
                }
            }
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
    }
}
