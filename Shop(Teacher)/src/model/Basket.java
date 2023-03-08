package model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Basket {
    private ArrayList<Product> cart;

    public Basket(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public Basket() {
        cart= new ArrayList<>();
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return ""+cart;
    }
//--------------------------------------    
    public void addItem(Product p){
        for(int i=0; i<cart.size();i++)
            if(cart.get(i).equals(p)){
                cart.get(i).setQuantity(cart.get(i).getQuantity()+1);
                return;
            }
        Product q=null;
        try {
            q = (Product)p.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Basket.class.getName()).log(Level.SEVERE, null, ex);
        }
        q.setQuantity(1);
        cart.add(q);
    }
//--------------------------------------
    public void removeItem(Product p){
        cart.remove(p);
    }
//--------------------------------------
    public double getTotal(){
        double total=0;
        for(Product p:cart) total+=p.getPrice()*p.getQuantity();
        return total;
    }
   
}
