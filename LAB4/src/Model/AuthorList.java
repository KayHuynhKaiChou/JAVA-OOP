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
public class AuthorList extends ArrayList<Author> implements Serializable{

    public AuthorList() {
//        this.add(new Author("A01", "Yamato Konsuke"));
//        this.add(new Author("A02", "Lion Messi"));
//        this.add(new Author("A03", "Conan doyle"));
//        this.add(new Author("A04", "JK Rowling"));
//        this.add(new Author("A05", "Kim Yohan"));
//        this.add(new Author("A06", "Lee min hoo"));
//        this.add(new Author("A07", "Nguyen Hoang Anh Tuan"));
//        this.add(new Author("A08", "Tran Dinh Hung"));
//        this.add(new Author("A09", "Nguyen Thai Son"));
//        this.add(new Author("A10", "Huynh Gia Khoi"));
        
    }

    public AuthorList(Collection<? extends Author> c) {
        super(c);
    }
    
    public Author searchByAuID(String id){
        return this.stream().filter(au -> au.getAuthorID().equals(id)).findAny().orElse(null);
    }
    
    public void searchByAuthorName(String text,BookList bl){
        List<String> listAuthorID = this.stream().filter(b -> b.getName().contains(text.toLowerCase())).map(Author::getAuthorID).collect(Collectors.toList());
        for(String aID : listAuthorID){
            bl.stream().filter(b -> b.getAuthorID().equals(aID)).forEach(System.out::println);
        }
    }
}
