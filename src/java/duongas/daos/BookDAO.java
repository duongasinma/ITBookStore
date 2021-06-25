/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongas.daos;

import duongas.dtos.BookDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utilities.MyConnection;

/**
 *
 * @author DUONGAS
 */
public class BookDAO implements Serializable {

    private List<BookDTO> listBook;

    public List<BookDTO> getListBook() {
        return listBook;
    }

    public void loadAllBook() throws SQLException, ClassNotFoundException {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            con = utilities.MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select id, title, img, description, price, createDate, author,category, quantity, status "
                        + "From Book where status = 'true' order by createDate DESC";
                stm = con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    String id = rs.getString("id");
                    String title = rs.getString("title");
                    String img = rs.getString("img");
                    String description = rs.getString("description");
                    String author = rs.getString("author");
                    String category = rs.getString("category");
                    String createDate = rs.getString("createDate");
                    double price = rs.getDouble("price");
                    int quantity = rs.getInt("quantity");
                    boolean status = rs.getBoolean("status");
                    BookDTO book = new BookDTO(id.trim(), title.trim(), img, description, author.trim(), category.trim(), createDate, price, quantity, status);
                    if (listBook == null) {
                        listBook = new ArrayList<>();
                    }
                    listBook.add(book);
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

    public BookDTO getBookDetail_byId(String ID) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = utilities.MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select id, title, img, description, price, createDate, author,category, quantity, status "
                        + "From Book Where id=? and status='true'";
                stm = con.prepareStatement(sql);
                stm.setString(1, ID);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String id = rs.getString("id").trim();
                    String title = rs.getString("title").trim();
                    String img = rs.getString("img");
                    String description = rs.getString("description");
                    String author = rs.getString("author");
                    String category = rs.getString("category");
                    String createDate = rs.getString("createDate");
                    double price = rs.getDouble("price");
                    int quantity = rs.getInt("quantity");
                    boolean status = rs.getBoolean("status");
                    BookDTO book = new BookDTO(id, title, img, description, author, category, createDate, price, quantity, status);
                    return book;
                }

            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
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

    public void SearchBook(String searchValue) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = utilities.MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select id, title, img, description, price, createDate, author,category, quantity, status "
                        + "From Book "
                        + "Where ( title like ? or category like ? ) and status='true'"
                        + " order by createDate DESC";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                stm.setString(2, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String title = rs.getString("title");
                    String img = rs.getString("img");
                    String description = rs.getString("description");
                    String author = rs.getString("author");
                    String category = rs.getString("category");
                    String createDate = rs.getString("createDate");
                    double price = rs.getDouble("price");
                    int quantity = rs.getInt("quantity");
                    boolean status = rs.getBoolean("status");
                    BookDTO book = new BookDTO(id, title, img, description, author, category, createDate, price, quantity, status);
                    if (listBook == null) {
                        listBook = new ArrayList<>();
                    }
                    listBook.add(book);
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

    public boolean checkBookID_Dub(String bookID) throws SQLException, ClassNotFoundException {
        boolean result = false;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select id From Book Where id=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, bookID);
                rs = stm.executeQuery();
                if (rs.next()) {
                    result = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        return result;
    }

    public boolean insertBook(BookDTO book) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        int row = 0;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "insert into book(id, title, img, description, price, author,category, createDate, quantity, status) values(?,?,?,?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, book.getId().trim());
                stm.setString(2, book.getTitle().trim());
                stm.setString(3, book.getImg());
                stm.setString(4, book.getDescription());
                stm.setDouble(5, book.getPrice());
                stm.setString(6, book.getAuthor());
                stm.setString(7, book.getCategory().trim());
                stm.setString(8, book.getCreateDate());
                stm.setInt(9, book.getQuantity());
                stm.setBoolean(10, true);
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
    public boolean updateBook(BookDTO book, String _id) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        int row = 0;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "update book set id=?, title=?, img=?, description=?, price=?, author=?, category=?, quantity=?"
                        + " where id=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, book.getId().trim());
                stm.setString(2, book.getTitle().trim());
                stm.setString(3, book.getImg());
                stm.setString(4, book.getDescription());
                stm.setDouble(5, book.getPrice());
                stm.setString(6, book.getAuthor());
                stm.setString(7, book.getCategory().trim());
                stm.setInt(8, book.getQuantity());
                stm.setString(9, _id);
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
    public boolean deleteBook( String _id) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        int row = 0;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "update book set status=?"
                        + " where id=?";
                stm = con.prepareStatement(sql);
                stm.setBoolean(1, false);
                stm.setString(2, _id);
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
    public boolean checkBookQuantity(BookDTO book) throws SQLException, ClassNotFoundException {
        boolean result = false;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "Select id From Book Where id=? and quantity>=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, book.getId());
                stm.setInt(2, book.getQuantity());
                rs = stm.executeQuery();
                if (rs.next()) {
                    result = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        return result;
    }
    public int getBookQuantity(String id) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = utilities.MyConnection.getMyConnection();
            if (con != null) {
                String sql = "select quantity from book where id=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, id);
                rs = stm.executeQuery();
                if (rs.next()) {
                    int quantity = rs.getInt("quantity");
                    return quantity;
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
        return 0;
    }
    public boolean updateBookQuantity(BookDTO book, int curQuantity) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = MyConnection.getMyConnection();
            if (con != null) {
                String sql = "update book set quantity=? "
                        + "where id=?";
                stm = con.prepareStatement(sql);
                stm.setInt(1,curQuantity-book.getQuantity());
                stm.setString(2, book.getId());
                int row = stm.executeUpdate();
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
