package model;

import java.util.Objects;
import java.util.Vector;

public class Product implements Cloneable{
    private String proID, proName, unit;
    private int price, quantity;

    public Product() {
    }

    public Product(Product p){
        this(p.proID,p.proName,p.unit,p.price,p.quantity);
    }
    public Product(String proID, String proName, String unit, int price, int quantity) {
        this.proID = proID;
        this.proName = proName;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return proID + " - " + proName + " - " + unit + " - price: " + price + " - SL: " + quantity;
    }
    
    public double shippingFee(){
        return -1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.proID);
        hash = 61 * hash + Objects.hashCode(this.proName);
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
        return Objects.equals(this.proID, other.proID);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
    public Vector getTitle(){
        Vector v = new Vector();
        v.add("proID");
        v.add("proName");       
        v.add("proUnit");
        v.add("Price");
        v.add("Quantity");
        v.add("Volume(ml)/Mass(g)");
        //v.add("Mass");
        return v;
    }
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(proID);
        v.add(proName);
        v.add(unit);
        v.add(price);
        v.add(quantity);
        return v;
    }
}
