/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.Validation;
import java.util.ArrayList;
import java.util.Hashtable;
import Model.Fruit;
import Model.FruitList;
import Model.OrderList;
import View.Menu;
import Controller.Order_Managament;

/**
 *
 * @author Tran HaF
 */
public class Fruit_Management extends Menu<String> {
    static String[] menu = {"Create Fruit", "View Orders", "Shopping (for buyer)", "Exit"};
    static FruitList fruitList = new FruitList();
    static OrderList orderList = new OrderList();
    static Order_Managament order_Managament = new Order_Managament();

    public Fruit_Management() {
        super("FRUIT SHOP SYSTEM", menu);
    }
    
    @Override
    public void execute(int choice) throws Exception{
        switch (choice){
            case 1:
                creatFruit();
                break;
            case 2:
                order_Managament.viewOrder();
                break;
            case 3:
                order_Managament.shopping();
                break;
            case 4:
                System.out.println("___<3___ Thank you ___<3___");
                System.out.println("Exiting......");
                System.exit(0);
            default:
                throw new AssertionError();
        }
    }
     public void creatFruit(){
         while (true){
             int fruitID = 0;
             while(true){
                 fruitID = Validation.checkInt("Enter Fruit ID: ",1, Integer.MAX_VALUE);
                 
                 if (fruitID == 0){
                     System.out.println("Invalid input! Fruit ID cannot be 0. Please enter again.");
                 } else if (!checkIDExist(fruitID)){
                     break;
                 } else {
                     System.out.println("The Fruit ID is exist! Please enter again");
                 }
             }
            String fruitName = Validation.checkName("Enter Fruit Name: ");
            double price = Validation.checkDouble("Enter Price: ", 0.1, Double.MAX_VALUE);
            int quantity = Validation.checkInt("Enter Quantity: ", 1, Integer.MAX_VALUE);
            String origin = Validation.getString("Enter Origin: ");
            Fruit fruit = new Fruit(fruitID, fruitName, price, quantity, origin);
            fruitList.creatFruit(fruit);
            
             System.err.println("Add fruit successfully.");
             System.out.println("Do you want to continue?");
             if (!Validation.checkInputYN()){
                 return;
             }
         }
         
     }
     public boolean checkIDExist(int fruitID) {
        for (Fruit fruit : fruitList.getListFruit()) {
            if (fruit.getFruitID() == fruitID) {
                return true;
            }
        }
        return false;
    }
    public Fruit getFruitByItem(int item) {
        int countItem = 0;
        for (Fruit fruit : fruitList.getListFruit()) {
            if (fruit.getQuantity() != 0) {
                countItem++;
            }
            if (countItem == item) {
                System.out.println("You selected: " + fruit.getFruitName());
                return fruit;
            }
        }
        return null;
    }
}
