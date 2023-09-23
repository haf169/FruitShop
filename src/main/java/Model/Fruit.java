/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author Tran HaF
 */
public class Fruit {
    private int fruitID;
    private String fruitName;
    private double price;
    private int quantity;
    private String origin;

    public Fruit(int fruitID, String fruitName, double price, int quantity, String origin) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruitID=" + fruitID + ", fruitName=" + fruitName + ", price=" + price + ", quantity=" + quantity + ", origin=" + origin + '}';
    }

    
}
