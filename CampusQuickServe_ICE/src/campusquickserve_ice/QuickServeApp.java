/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campusquickserve_ice;

import javax.swing.JOptionPane;

public class QuickServeApp {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter Customer Name:");
        String studentNo = JOptionPane.showInputDialog("Enter Student Number:");
        String item = JOptionPane.showInputDialog("Enter Item Ordered:");
        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Quantity:")
        );
        double price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter Price per Item:")
        );

        Order order = new Order(name, studentNo, item, quantity, price);

        String receipt = "====== Campus QuickServe Receipt ======\n"
                + "Customer Name: " + order.getCustomerName() + "\n"
                + "Student Number: " + order.getStudentNumber() + "\n"
                + "Item Ordered: " + order.getItemName() + "\n"
                + "Quantity: " + order.getQuantity() + "\n"
                + "Price per Item: R" + String.format("%.2f", order.getPricePerItem()) + "\n"
                + "---------------------------------------\n"
                + "Subtotal: R" + String.format("%.2f", order.calculateSubtotal()) + "\n"
                + "Discount Applied: R" + String.format("%.2f", order.calculateDiscount()) + "\n"
                + "VAT (15%): R" + String.format("%.2f", order.calculateVAT()) + "\n"
                + "---------------------------------------\n"
                + "Final Total: R" + String.format("%.2f", order.calculateFinalTotal()) + "\n"
                + "=======================================";

        JOptionPane.showMessageDialog(null, receipt);

        System.out.println(receipt);
    }
}
