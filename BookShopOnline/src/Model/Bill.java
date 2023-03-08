package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author DELL
 */
public class Bill {
    private Cart gioHang;
    private String nameCustomer , address, tele;

    public Cart getGioHang() {
        return gioHang;
    }

    public void setGioHang(Cart gioHang) {
        this.gioHang = gioHang;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
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
    
    public double getTotalMoney(){
        double sum=0;
        for(Book bo : gioHang.getBasket()){
            sum+=bo.getPrice();
        }
        return sum;
    }
    
    public int getShippingFee(){
        int sumShip=0;
        double percent = 0;
        
        if(this.getTotalMoney()<200000) percent=0.1;
        else if(this.getTotalMoney()>=200000 && this.getTotalMoney()<500000) percent=0.15;
        else percent=0.2;
        
        for(Book bo : gioHang.getBasket()){
            sumShip+=bo.getPrice()*percent;
        }
        return sumShip;
    }

    @Override
    public String toString() {
        Date da = new Date(System.currentTimeMillis());
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
		
        String s = "Time pay: "+df.format(da)+ "\nCustomer: "+nameCustomer+"\nAddress: "+address+"\nTelephone: "+tele;
        s=s+"\n---->>>> Bill Pay Details <<<<----\n";
        for (int i = 0; i < getGioHang().getBasket().size(); i++) 
            s=s+(i+1)+". "+getGioHang().getBasket().get(i)+"\n";
        s=s+"--------------------------------------\n";
        s=s+"Total: "+getTotalMoney()+" đ\nShipping: "+Math.floor(getShippingFee())+" đ";
        s=s+"\nYou must pay: "+(getTotalMoney()+getShippingFee())+" đ";
        return s;
    }
    
    
}
