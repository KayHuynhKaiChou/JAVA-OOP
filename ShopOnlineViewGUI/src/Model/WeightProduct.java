/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Vector;



/**
 *
 * @author DELL
 */
public class WeightProduct extends Product implements shopInfo{
    private double weight;
    
    public WeightProduct(){}

    public WeightProduct(double weight) {
        this.weight = weight;
    }

    public WeightProduct(String id, String productName,String NSX, String HSD, double price, int quantity, double weight) {
        super(id, productName, NSX, HSD, price, quantity);
        this.weight = weight;
    }

    public WeightProduct(WeightProduct wp){
        this(wp.getId(),wp.getProductName(),wp.getNSX(),wp.getHSD(),wp.getPrice(),wp.getQuantity(),wp.getWeight());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Weight: " + weight + "g";
    }

    @Override
    public double shippingFee() {
        return weight*WEIGHT_FEE;
    }

    @Override
    public String getLine() {
        return super.getLine() + ","+weight+"g"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void parseW(String s) {
        String[] arr = s.split(",");
        this.setId(arr[0]);
        this.setProductName(arr[1]);
        this.setNSX(arr[2]);
        this.setHSD(arr[3]);
        this.setPrice(Double.parseDouble(arr[4]));
        this.setQuantity(Integer.parseInt(arr[5]));
        String we = arr[6].replace("g", "");
        this.weight = Double.parseDouble(we);
    }
    
    @Override
    public Vector toVector() {
        Vector vw = super.toVector();
        vw.add(0);
        vw.add(weight);
        vw.add(Boolean.FALSE);
        return vw; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
