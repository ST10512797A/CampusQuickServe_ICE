/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campusquickserve_ice;

import javax.swing.JOptionPane;

public class QuickServeApp {

public static void man(String[] args) {

    //JOptionPane Input
    String name = JOptionPane.showInputDialog("Enter Customer Name:");
    String StudentNo = JOptionPane.showInputDialog("Enter Student Number:");
    String Item = JOptionPane.showInputDialog("Enter Item Ordered:");
    int quantity = Integer.parseInt(
            JOptionPane.showInputDialog("Enter Quantity")
    );
    double price = Double.parseDouble(
            JOptionPane.showInputDialog("Enter Price per Item")
    );
    
}
    
}
