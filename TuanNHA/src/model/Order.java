package model;

import java.util.ArrayList;

public class Order extends Basket{
    private Customer cust;
    private String shipAddr;

    public Order(Customer cust, String shipAddr, ArrayList<Product> cart) {
        super(cart);
        this.cust = cust;
        this.shipAddr = shipAddr;
    }

    public Order(Basket b,Customer cust, String shipAddr) {
        super(b.getCart());
        this.cust = cust;
        this.shipAddr = shipAddr;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public String getShipAddr() {
        return shipAddr;
    }

    public void setShipAddr(String shipAddr) {
        this.shipAddr = shipAddr;
    }

    public double getShippingFee(){
        double total=0;
        for(Product p:getCart()) total+=p.shippingFee()*p.getQuantity();
        return total;
    }
//---------------------------------------------------    
    @Override
    public String toString() {
        String s=cust.toString()+"\nORDER DETAILS\n----------------------\n";
        for(int i=1;i<=getCart().size();i++)
            s=s+i+". "+getCart().get(i-1)+"\n";
        s=s+"--------------------------\nTotal : "+getTotal();
        s=s+"\nShipping : "+getShippingFee();
        return s;
    }
    
    
    
}
