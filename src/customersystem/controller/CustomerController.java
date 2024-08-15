/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customersystem.controller;

import customersystem.DB.DbConnection;
import customersystem.model.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author ASUS
 */
public class CustomerController {
    
    
    public CustomerController(){
       
    }
    
    public void getCustomer(Customer customer){
        String id = customer.getId();
        String name = customer.getName();
        String address = customer.getAddress();
        String contact = customer.getContact();
       String SQL = "INSERT INTO customer " +
            "VALUES('"+id+"','"+name+"','"+address+"','"+contact+"');";
       
       
        
       DbConnection.getInstance().getConnect(SQL);
    }
    
    public String[] searchCustomer(String value){
        String[] arr = new String[4];
   String SQL = "SELECT * FROM customer WHERE Id=+'" + value + "'";
                
       ResultSet RST = DbConnection.getInstance().getRetiriveData(SQL);
       
        try {
            while(RST.next()){
            arr[0] =RST.getString("id");
            arr[1]=RST.getString("name"); 
            arr[2]=RST.getString("address");
            arr[3]=RST.getString("contact");
            
            }
            if(RST.equals(null)){
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
       return arr;
    }
    
    public void updateCustomer(String id,String name,String address,String contact){
        String SQL = "UPDATE customer SET Name =+'"+name+"', Address =+'"+address+"', Contact=+'"+contact+"' WHERE id=+'"+id+"'";
        
        DbConnection.getInstance().getConnect(SQL);
    }
    
    public void deleteCustomer(String id){
            String SQL = "DELETE FROM customer WHERE id=+'"+id+"'";
            
            DbConnection.getInstance().getConnect(SQL);
    }
    
    public ResultSet viewCustomer(){
        String SQL = "SELECT * FROM customer";
        return DbConnection.getInstance().getRetiriveData(SQL);
    }
}
