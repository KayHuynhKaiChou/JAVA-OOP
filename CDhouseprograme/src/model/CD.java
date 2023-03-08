
package model;

import java.io.Serializable;

public class CD implements Serializable {

    private String title, collectionName;
    private int id, year;
    private double price;
    private char type;

    public CD() {
    }

    public CD(String title, String collectionName, int id, int year, double price, char type) {
        this.title = title;
        this.collectionName = collectionName;
        this.id = id;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type == 'a' ? "audio" : "video";
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ID:" + id + "     title: " + title
                + "     collection: " + collectionName
                + "     price: " + price
                + "     type: " + getType()
                + "     pb Year: " + year;
    }

}
