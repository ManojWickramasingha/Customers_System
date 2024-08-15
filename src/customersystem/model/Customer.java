/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customersystem.model;

/**
 *
 * @author ASUS
 */
public class Customer {
    private String id;
    private String name;
    private String address;
    private String contact;
    
    public Customer(String id,String name,String address,String contact)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setContact(String contact){
        this.contact = contact;
    }
    
    
    
     public String getId(){
        return this.id; 
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getContact(){
        return this.contact;
    }
    
   
}
