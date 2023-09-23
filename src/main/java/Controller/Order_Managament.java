/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.Fruit_Management.fruitList;
import Model.Fruit;
import Model.Order;
import Model.OrderList;
import View.Validation;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Tran HaF
 */
public class Order_Managament {
    static Fruit_Management fruitManage = new Fruit_Management();
    static OrderList orderL = new OrderList();
    Hashtable<String, ArrayList<Order>> orders = new Hashtable<>();

    public void shopping() {
        //check list empty user can't buy
        if (fruitList.getListFruit().isEmpty()) {
            System.err.println("No have item.");
            return;
        }
        String name = null;

        while (true) {
            fruitList.displayFruit();
            int item = Validation.checkOrder("Enter item: ", 1, fruitList.getListFruit().size());
            Fruit fruit = fruitManage.getFruitByItem(item);
            int quantity = Validation.checkInt("Enter quantity: ", 1, fruit.getQuantity());
            fruit.setQuantity(fruit.getQuantity() - quantity);

            if (!Validation.checkOrder()) {
                return;
            }
            Order order = new Order(fruit.getFruitID(), fruit.getFruitName(), quantity, fruit.getPrice());
            orderL.creatOrder(order);

            orderL.displayOrder(orderL.getListOrder());
            if (name == null) {
                name = Validation.checkName("Enter name: ");
            }
            orders.putIfAbsent(name, new ArrayList<>());
            orders.get(name).add(order);
            System.out.println("Order successfully.");
            System.out.println("Do you want to continue?");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

    public void viewOrder() {
        if (orders.isEmpty()) {
            System.out.println("No orders");
            return;
        }
        for (String name : orders.keySet()) {
            System.out.println("Customer: " + name);
            ArrayList<Order> listOrder = orders.get(name);
            orderL.displayOrder(listOrder);
        }

    }
}
