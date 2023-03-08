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
public class Cart { // giỏ hàng chứa products
    private ArrayList<Product> basket = new ArrayList<>();;
    
    // số lượng
    public Cart(){
    }
    
    public Cart(Cart c) {
        this(c.getBasket());
    }

    public Cart(ArrayList<Product> basket) {
        this.basket = basket;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }

    public void addItem(Product p, ShopProduct sp){// lấy hàng cho vào giỏ
        p.setQuantity(p.getQuantity()-1);
        // if quantity product is 0 , i will remove it out of shop
        if(p.getQuantity()==0){
           sp.getShop().removeIf(pro -> pro.equals(p));         
        }
    
        for (int i =0; i<basket.size(); i++) {
            if(basket.get(i).getId().equals(p.getId())){
                basket.get(i).setQuantity(basket.get(i).getQuantity()+1);
                return;
            }
        }
        
        if(p instanceof VolumnProduct){ 
            VolumnProduct q = new VolumnProduct((VolumnProduct) p);
            q.setQuantity(1);
            basket.add(q);
        }else{
            WeightProduct q = new WeightProduct((WeightProduct) p);
            q.setQuantity(1);
            basket.add(q);
        }
            
        //Product q = new Product(p);
        //q.setQuantity(1);
        //basket.add(q);
        
    }
    
    public void searchItem(){
        
    }
    
    public void removeItem(Product p, ShopProduct sp){
        // bỏ product ra khỏi giỏ khi đổi ý ko mua
        
        p.setQuantity(p.getQuantity()-1);
        
        for (int i =0; i<sp.getShop().size(); i++) {
            if(sp.getShop().get(i).getId().equals(p.getId())){
                sp.getShop().get(i).setQuantity(sp.getShop().get(i).getQuantity()+1);
                //return;
            }
        }
        if(p.getQuantity() == 0) {
            basket.remove(p);
        }
        
        //basket.remove(p);
    }
    
    
}
