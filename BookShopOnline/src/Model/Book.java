/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author DELL
 */
public class Book {
    private String nameBook , author , genre, barcode, pathimage;
    private int numberPage,quantity;
    private double price;

    public Book() {
    }

    public Book(Book sa){
        this.nameBook = sa.nameBook;
        this.author = sa.author;
        this.genre = sa.genre;
        this.barcode = sa.barcode;
        this.numberPage = sa.numberPage;
        this.price = sa.price;
        this.quantity = sa.quantity;
        this.pathimage = sa.pathimage;
    }
    
    public Book(String barcode,String nameBook, String author, String genre, int numberPage,int quantity, double price, String pathimage) {
        this.nameBook = nameBook;
        this.author = author;
        this.genre = genre;
        this.barcode = barcode;
        this.numberPage = numberPage;
        this.price = price;
        this.quantity = quantity;
        this.pathimage = pathimage;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return nameBook + "\n+ Author: " + author + "\n+ Genre: " + genre + "\n+ Barcode: " + barcode + "\n+ Number Page: " + numberPage + "\n+ Quantity: " + quantity + "\n+ Price: " + price ;
    }

   
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPathimage() {
        return pathimage;
    }

    public void setPathimage(String pathimage) {
        this.pathimage = pathimage;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Book other = (Book) obj;
        return Objects.equals(this.barcode, other.barcode);
    }
    
    public Vector getTitle(String s){
        Vector ti = new Vector();
        ti.add("Barcode");
        ti.add("Name");
        ti.add("Author");
        ti.add("Genre");
        ti.add("NumberPage");
        ti.add("Quantity");
        ti.add("Price");
        ti.add(s);
        return ti;
    }
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(this.getBarcode());
        v.add(this.getNameBook());
        v.add(this.getAuthor());
        v.add(this.getGenre());
        v.add(this.getNumberPage());
        v.add(this.getQuantity());
        v.add(this.getPrice());
        v.add(Boolean.FALSE);
        return v;
    }
    
}
