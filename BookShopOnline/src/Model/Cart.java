/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Cart {
    private ArrayList<Book> Basket;

    public Cart() {
        Basket = new ArrayList<Book>();
    }

    public Cart(ArrayList<Book> Basket) {
        this.Basket = Basket;
    }

    public ArrayList<Book> getBasket() {
        return Basket;
    }

    public void setBasket(ArrayList<Book> Basket) {
        this.Basket = Basket;
    }
    
}
