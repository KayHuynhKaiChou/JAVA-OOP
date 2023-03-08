/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Vector;
import model.Product;




/**
 *
 * @author DELL
 */
public class WeightProduct extends Product{
    private double weight;
    
    public WeightProduct(){}

     public WeightProduct(double we, String proID, String proName, String unit, int price, int quantity) {
        super(proID, proName, unit, price, quantity);
        this.weight = we;
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
        return weight*2;
    }
    
    
/*
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
*/

    @Override
    public Vector toVector() {
        Vector wei = super.toVector();
        wei.add(weight);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return wei;
    }
}
