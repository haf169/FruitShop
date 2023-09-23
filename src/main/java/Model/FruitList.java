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
public class FruitList {
    ArrayList<Fruit> ListFruit;
    //------------------------------------------------------

    public FruitList() {
        ListFruit = new ArrayList<>();
    }

    public FruitList(ArrayList<Fruit> ListFruit) {
        this.ListFruit = ListFruit;
    }

    public ArrayList<Fruit> getListFruit() {
        return ListFruit;
    }

    public void creatFruit(Fruit fruit) {
        ListFruit.add(fruit);
    }

    public void displayFruit() {
        int count = 0;
        for (Fruit fruit : ListFruit) {
            if (fruit.getQuantity() != 0) {
                count++;
                if (count == 1) {
                    System.out.printf("%-7s|%-12s|%-12s|%-7s\n", "Item", "Fruit name", "Origin", "Price");
                }
                System.out.printf("%-7d|%-12s|%-12s|%-7.1f$\n",count,fruit.getFruitName(),fruit.getOrigin(),fruit.getPrice());
            }
        }

    }
}
