/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

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
    
    /*public Product parse(String s){
        String[] arr = s.split(",");
        this.id = arr[0];
        this.productName = arr[1];
        this.NSX = arr[2];
        this.HSD = arr[3];
        this.price = Double.parseDouble(arr[4]);
        this.quantity = Integer.parseInt(arr[5]);
        return arr[6];
    }*/
}
