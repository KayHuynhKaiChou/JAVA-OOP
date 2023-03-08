/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author DELL
 */
public class Basic_Ite {
    public static void main(String[] args) {
        //Declare a ArrayList contains eles multitude of types like: String, Integer,...
        ArrayList NameAge = new ArrayList();
        NameAge.add("Jisoo");  NameAge.add(27);
        NameAge.add("Jennie"); NameAge.add(26);
        NameAge.add("Rose");   NameAge.add(25.0);
        NameAge.add("Lisa");   NameAge.add(25.0);
        //Duyet eles = Iterator
        Iterator ite = NameAge.iterator();
        while(ite.hasNext()){
            Object ele = ite.next();
            if(ele instanceof String){
                System.out.print(ele+": ");
            }else{
                System.out.println(ele+" age.");
            }
        }
        
        //Adjust eles in NameAge by using ListIterator
        ListIterator li = NameAge.listIterator();
        while(li.hasNext()){
            Object el = li.next();
            if(el instanceof Integer || el instanceof Double){
                li.set(el + " age (BlackPink)");
            }/*else{
                li.set(el);
            }*/
        }
        System.out.println("\nNew contents in NameAge: ");
        ite = NameAge.iterator();
        while(ite.hasNext()){
            Object ele = ite.next();
            if(String.valueOf(ele).length()<8){
                System.out.print(ele+": ");
            }else{
                System.out.println(ele+".");
            }
        }
        
        //Reverse list "NameAge" use hasPrevious (in ListIterator) : Trả về true nếu có phần tử trước. Nếu không, trả về false.
        System.out.println("\nNew list with eles reversed: ");
        String s = "";
        while(li.hasPrevious()){
            Object ele = li.previous();
            if(String.valueOf(ele).length()<8){
                s = ele + s ;
            }else{
                s = ele+"\n"+s ;
            }
        }
        // chưa xử lí đc
        System.out.println(s);
        /*
        
        StringBuffer DaoNguoc = new StringBuffer("abcd");
        DaoNguoc.reverse().toString();
        System.out.println(DaoNguoc); // dcba
        */
    }
    
    
}
