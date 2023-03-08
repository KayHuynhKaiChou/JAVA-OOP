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
public class Book implements Serializable{
    private String isbn, title;
    private Double price;
    private String authorID;

    public Book() {
    }

    public Book(String isbn, String title, Double price, String authorID) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.authorID = authorID;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(!title.isBlank()) this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price!=0) this.price = price;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        if(!authorID.isBlank()) this.authorID = authorID;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", title: " + title + ", price: " + price + ", authorID: " + authorID;
    }
    
    
}
