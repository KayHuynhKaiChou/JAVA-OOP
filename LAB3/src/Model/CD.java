/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class CD implements Serializable{
    private String id, title, collectionName;
    private int year;
    private double price;
    private char type;

    public CD() {
    }

    public CD(String id, String title, String collectionName, int year, double price, char type) {
        this.id = id;
        this.title = title;
        this.collectionName = collectionName;
        this.year = year;
        this.price = price;
        this.type = type;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(!title.isEmpty()) this.title = title;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        if(!collectionName.isEmpty()) this.collectionName = collectionName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year!=0) this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type == 'a' ? "audio":"video";
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ID: "+id +", Title: "+title+ ", Collection Name: " + collectionName
                +"\nType: "+getType()+", Price: "+price+ ", Year Published: "+year;
    }
    
    
}
