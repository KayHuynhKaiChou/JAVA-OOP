/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.TestSoftware;
import Model.Book;
import Model.Cart;
import Model.ShopBook;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CartView extends Menu<Book>{
    private ShopBook ch = new ShopBook();
    private Cart gh = new Cart();

    public CartView() {
        title = "Your Cart";
        mChon = gh.getBasket();
    }

    public ShopBook getCh() {
        return ch;
    }

    public Cart getGh() {
        return gh;
    }

    
    @Override
    public void execute(int n) {
        if(n>mChon.size()){
            System.out.println("erooooooooooooooooooooor");
            return;
        }
        else TestSoftware.svB.getCh().removeBook(mChon.get(n-1),TestSoftware.cvB.gh);
    }
    
}
