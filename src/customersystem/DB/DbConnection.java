/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customersystem.DB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DbConnection {
    private static DbConnection con;
    private  String SQL;
    private DbConnection(){
       

    }
    
 
    public void getConnect(String SQL){
         this.SQL =SQL;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/CustomerSystem", "root", "manoj");
            Statement stm= connection.createStatement();
            int res=stm.executeUpdate(SQL);
            if(res>0){
                System.out.println("Added Success");
            }            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ResultSet getRetiriveData(String SQL){
         ResultSet rst=null;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/CustomerSystem", "root", "manoj");
            Statement stm= connection.createStatement();
            rst = stm.executeQuery(SQL);
            
            return rst;
                       
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return rst;
    }
    
     public static DbConnection getInstance(){
         
            if(con==null){
              return con = new DbConnection();
            }
            return con;
     }
    
}
