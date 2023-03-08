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
public class VolumnProduct extends Product implements shopInfo{
    private double volumn;
    
    public VolumnProduct(){}

    public VolumnProduct(double volumn) {
        this.volumn = volumn;
    }

    public VolumnProduct(String id, String productName, String NSX, String HSD, double price, int quantity, double volumn) {
        super(id, productName, NSX, HSD, price, quantity);
        this.volumn = volumn;
    }

    public VolumnProduct(VolumnProduct vp){
        this(vp.getId(),vp.getProductName(),vp.getNSX(),vp.getHSD(),vp.getPrice(),vp.getQuantity(),vp.getVolumn());
    }

    public double getVolumn() {
        return volumn;
    }

    public void setVolumn(double volumn) {
        this.volumn = volumn;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Volumn: " + volumn + "ml";
    }

    @Override
    public double shippingFee() {
        return volumn*VALUE_VOLUME;
    }

    @Override
    public String getLine() {
        return super.getLine() + ","+volumn+"ml"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    public void parseV(String s) {
        String[] arr = s.split(",");
        this.setId(arr[0]);
        this.setProductName(arr[1]);
        this.setNSX(arr[2]);
        this.setHSD(arr[3]);
        this.setPrice(Double.parseDouble(arr[4]));
        this.setQuantity(Integer.parseInt(arr[5]));
        String vo = arr[6].replace("ml", "");
        this.volumn = Double.parseDouble(vo);
    }
    
    @Override
    public Vector toVector() {
        Vector vv = super.toVector();
        vv.add(volumn);
        vv.add(0);
        vv.add(Boolean.FALSE);
        return vv;
    }
       
}
