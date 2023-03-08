/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Cart;
import Model.Product;
import Model.ShopProduct;

/**
 *
 * @author DELL
 */
public class CartView extends MenuShop<Product>{ // show để bỏ bớt hàng
    private ShopProduct sp;
    private Cart cart ; 
    
    public CartView(Cart c,ShopProduct sp){ 
        this.sp = sp;
        cart=c;
        title = "Your cart";
        mChon = cart.getBasket();
        
    }

    public ShopProduct getSp() {
        return sp;
    }

    public Cart getCart() {
        return cart;
    }
    
    @Override
    public void execute(String str) {
        
        boolean check = false;
        for (int i=0; i<mChon.size();i++) {
            if(str.equals(mChon.get(i).getId())){ 
                cart.removeItem(mChon.get(i),this.sp);
                check = true;
            }
            //break;
        }
        if(check == false) System.out.println("ID not exist");
        
        // if(n>mChon.size()) return;
        //cart.addItem(mChon.get(n-1));
    }
    
    
}
