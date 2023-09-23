/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Tran HaF
 */
public class Order {
    private int fruitID;
    private String fruitName;
    private int quantity;
    private double price;

    public Order(int fruitID, String fruitName, int quantity, double price) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getFruitID() {
        return fruitID;
    }

    public void setFruitID(int fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double amount() {
        return this.quantity * this.price;
    }

}
