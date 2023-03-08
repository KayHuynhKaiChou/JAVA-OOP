/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.TestSoftware;
import Model.Book;
import Model.Cart;
import Model.ShopBook;

/**
 *
 * @author DELL
 */
public class ShopView extends Menu<Book>{
    private ShopBook ch = new ShopBook();
//    private Cart gh = new Cart();

    public ShopView() {
        title = "Shopping Online Book";
        mChon = ch.getShopSach();
    }

    public ShopBook getCh() {
        return ch;
    }

    public void setCh(ShopBook ch) {
        this.ch = ch;
    }
    
    
    @Override
    public void execute(int n) {
        if(n>mChon.size()) return;
        else ch.buyBook(mChon.get(n-1),TestSoftware.cvB.getGh());
    }
    
}
