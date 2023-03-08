/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author DELL
 */
public class BookList extends ArrayList<Book> implements Serializable{

    public BookList(){}
    
    public BookList(Collection<? extends Book> c) {
        super(c);
    }
    
    public void printList(){
        this.forEach(System.out::println);
    }
    
    public Book searchByISBN(String id){
        return this.stream().filter(b -> b.getIsbn().equals(id)).findAny().orElse(null);
    }
    
    public BookList searchByBookName(String text){
        return new BookList(this.stream().filter(b -> b.getTitle().contains(text.toLowerCase())).collect(Collectors.toList()));
    }
    
}
