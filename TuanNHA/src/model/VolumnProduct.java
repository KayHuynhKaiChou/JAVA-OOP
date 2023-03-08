package model;

import java.util.Vector;

public class VolumnProduct extends Product {
    private double volumn;

    public VolumnProduct() {
    }

    public VolumnProduct(double volumn, String proID, String proName, String unit, int price, int quantity) {
        super(proID, proName, unit, price, quantity);
        this.volumn = volumn;
    }

    public double getVolumn() {
        return volumn;
    }

    public void setVolumn(double volumn) {
        this.volumn = volumn;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Volume: " + volumn+"ml";
    }

    @Override
    public double shippingFee() {
        return volumn*5;
    }

    @Override
    public Vector toVector() {
        Vector vol = super.toVector(); 
        vol.add(volumn);
        return vol;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
