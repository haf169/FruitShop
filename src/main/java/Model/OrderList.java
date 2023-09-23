/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Tran HaF
 */
public class OrderList {
    ArrayList<Order> ListOrder;
    //------------------------------------------------------

    public OrderList() {
        ListOrder = new ArrayList<>();
    }

    public OrderList(ArrayList<Order> ListOrder) {
        this.ListOrder = ListOrder;
    }

    public ArrayList<Order> getListOrder() {
        return ListOrder;
    }

    public void creatOrder(Order order) {
        ListOrder.add(order);
    }

    public void displayOrder(ArrayList<Order> lOrder) {
        double total = 0;
        System.out.printf("%-13s|%-12s|%-10s|%-7s\n", "Product", "Quantity", "Price", "Amount");
        for (Order order : lOrder) {
            System.out.printf("%-13s|%-12d|%-9.1f$|%-7.1f$\n", order.getFruitName(), order.getQuantity(), order.getPrice(), order.amount());
            total += order.amount();
        }
        System.out.println("Total: " + total + "$");
    }
}
