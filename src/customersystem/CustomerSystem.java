/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customersystem;

import customersystem.controller.CustomerController;
import customersystem.view.DashBoard;
import customersystem.view.add_customer_form;

/**
 *
 * @author ASUS
 */
public class CustomerSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerController controller = new CustomerController();
        DashBoard dashboard = new DashBoard(controller);
       
       
    }
    
}
