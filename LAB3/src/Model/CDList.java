/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
import java.util.*;
import java.util.stream.*;
/**
 *
 * @author DELL
 */
public class CDList extends ArrayList<CD> implements Serializable{

    public CDList() {
    }

    public CDList(Collection<? extends CD> c) {
        super(c);
    }
    
    public CDList search(String title){
        return new CDList(this.stream().filter(
                cd -> cd.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList()));
    }
    
    
    public void print(){
        this.forEach(System.out::println);
    }
    
    public boolean spaceMax(int max){
        return this.size() < max;
    }
    
    public CD findCDByID(String id){
       return this.stream().filter(c -> c.getId().equals(id)).findAny().orElse(null);      
    }
}
