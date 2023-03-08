/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cart;
import Model.ShopBook;
import View.CartView;
import View.Menu;
import View.ShopView;

/**
 *
 * @author DELL
 */
public class TestSoftware extends Menu<String>{
    public static ShopView svB = new ShopView();
    public static CartView cvB = new CartView();
    static String[] mc = {"Buy Book","Remove Book","Add new Book","Search Book","Print Bill"};
    
    public TestSoftware() {
        super("Function Shop",mc);
    }
    
    public static void main(String[] args) {
        new TestSoftware().run();
    }
    
    @Override
    public void execute(int n) {
        switch(n) {
            case 1: svB.run(); break;
            case 2: cvB.run(); break;
        }
    }
    
}
