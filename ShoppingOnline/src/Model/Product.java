/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author DELL
 */
public class Product implements shopInfo{
    private String id, productName;
    private String NSX,HSD;
    private double price;
    private int quantity; 

    public Product() {
    }
    
    public Product(Product p){
        this(p.id,p.productName,p.NSX,p.HSD,p.price,p.quantity);
    }
    
    public Product(String id, String productName, String NSX, String HSD, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.NSX = NSX;
        this.HSD = HSD;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public double shippingFee(){
        return price*VALUE_FEE;
    }

    @Override
    public String toString() {
        return "ID: "+id+" ,Name: "+productName+" ,NSX: "+NSX+" ,HSD: "+HSD+"\n  Price: "+price+" ,Total Quantity: "+getQuantity();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return Objects.equals(this.id, other.id);
    }

    
    public String getLine(){
        return id+","+productName+","+NSX+","+HSD+","+price+","+quantity;
    }
    
    public Vector getTitle(){
        Vector v = new Vector();
        v.add("ID");
        v.add("Name");
        v.add("NSX");
        v.add("HSD");
        v.add("Price");
        v.add("Quantity");
        v.add("Buy");
        return v;
    }
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(id);
        v.add(productName);
        v.add(NSX);
        v.add(HSD);
        v.add(price);
        v.add(quantity);
        return v;
    }
}
