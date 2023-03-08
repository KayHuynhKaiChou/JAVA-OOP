package model;

import java.util.ArrayList;
import java.util.Vector;
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
    public Vector<Vector> getData(){
        Vector<Vector> data = new Vector<Vector>();
        for(Product p: cart){
            if(p instanceof VolumnProduct) data.add(p.toVector());
            else if(p instanceof WeightProduct) data.add(p.toVector());
        }
        return data;
    }
    public void addItem(Product p,Shop sh){
        p.setQuantity(p.getQuantity()-1);
        for(int i=0; i<cart.size();i++){
            if(cart.get(i).equals(p)){
                cart.get(i).setQuantity(cart.get(i).getQuantity()+1);
                //sh.getProducts().get(i).setQuantity(sh.getProducts().get(i).getQuantity()-1);
                return;
            }
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
    public void removeItem(Product p , Shop sp){
        p.setQuantity(p.getQuantity()-1);
        
        for (int i =0; i<sp.getProducts().size(); i++) {
            if(sp.getProducts().get(i).equals(p)){
                sp.getProducts().get(i).setQuantity(sp.getProducts().get(i).getQuantity()+1);
                //return;
            }
        }
        if(p.getQuantity() == 0) {
            cart.remove(p);
        }
    }
//--------------------------------------
    public double getTotal(){
        double total=0;
        for(Product p:cart) total+=p.getPrice()*p.getQuantity();
        return total;
    }
   
}
