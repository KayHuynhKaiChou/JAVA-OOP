/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Order{ //hóa đơn
    private Cart cart;
    private String customer, address, tele;

    public Order() {
    }
    
    
    public Order(Cart cart, String customer, String address, String tele) {
        this.cart = cart;
        this.customer = customer;
        this.address = address;
        this.tele = tele;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }
    
    public double getTotal(){
        /*double sum = 0;
        for (Product sp : cart.getBasket()) {
            sum += (sp.getPrice()*sp.getQuantity());
        }
        return sum;*/
        
        //cách 2:
        return cart.getBasket().stream().mapToDouble(p->p.getQuantity()*(p.getPrice()+p.shippingFee())).sum();
    }
    
    public double getShipFee(){
        double fee = 0;
        for(Product sp : cart.getBasket()){
            fee += (sp.shippingFee()*sp.getQuantity());
        }
        return fee;
    }

    @Override
    public String toString() {
        Date da = new Date(System.currentTimeMillis());
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
		
        String s = "Time pay: "+df.format(da)+ "\nCustomer: "+customer+"\nAddress: "+address+"\nTelephone: "+tele;
        s=s+"\n---->>>> Order Details <<<<----\n";
        for (int i = 0; i < getCart().getBasket().size(); i++) 
            s=s+(i+1)+". "+getCart().getBasket().get(i)+"\n";
        s=s+"--------------------------------------\n";
        s=s+"Total: "+getTotal()+"\nShipping: "+getShipFee();
        return s;
    }

}
