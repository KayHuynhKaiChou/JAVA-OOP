/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class JCD {  // Java connect Database
    private Connection conn;
    
    public JCD(){
        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=connectJAVA;"
                    + "username=sa;password=1832003;encrypt=true;trustServerCertificate=true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean addBook (Book sa){
        String sqlClause = "INSERT INTO Book VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlClause);
            ps.setString(1, sa.getBarcode());
            ps.setString(2, sa.getNameBook());
            ps.setString(3, sa.getAuthor());
            ps.setString(4, sa.getGenre());
            ps.setInt(5, sa.getNumberPage());
            ps.setInt(6, sa.getQuantity());
            ps.setFloat(7, Float.parseFloat(sa.getPrice()+""));
            ps.setString(8, sa.getPathimage());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Book> takeDataFromSQL(){
        ArrayList<Book> listBook = new ArrayList<>();
        String sql = "SELECT * FROM Book";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Book bo = new Book();
                bo.setBarcode(rs.getString("barcode"));
                bo.setNameBook(rs.getString("namebook"));
                bo.setAuthor(rs.getString("author"));
                bo.setGenre(rs.getString("genre"));
                bo.setNumberPage(rs.getInt("numberpage"));
                bo.setQuantity(rs.getInt("quantity"));
                bo.setPrice(Double.valueOf(rs.getFloat("price")+""));
                bo.setPathimage(rs.getString("pathimage"));
                
                listBook.add(bo);
            }
        } catch (Exception e){ 
            e.printStackTrace();
        }
        
        return listBook;
    }
    
    public void updateBook(Book sa){
        String sqlClause = "UPDATE Book SET barcode=?,namebook=?,author=?,genre=?,numberpage=?,quantity=?,price=?,pathimage=? WHERE barcode=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlClause);
            ps.setString(1, sa.getBarcode());
            ps.setString(2, sa.getNameBook());
            ps.setString(3, sa.getAuthor());
            ps.setString(4, sa.getGenre());
            ps.setInt(5, sa.getNumberPage());
            ps.setInt(6, sa.getQuantity());
            ps.setFloat(7, Float.parseFloat(sa.getPrice()+""));
            ps.setString(8, sa.getPathimage());
            ps.setString(9, sa.getBarcode());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
    public void deleteBook(Book sa){
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Book WHERE barcode=?");
            ps.setString(1, sa.getBarcode());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public static void main(String[] args) {
        new JCD();
    }
}
