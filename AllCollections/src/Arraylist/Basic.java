/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import static javax.management.openmbean.SimpleType.STRING;

/**
 *
 * @author DELL
 */
public class Basic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> listYear = new ArrayList<>();
        //Declare eles for listYear
        listYear.add("Kyounen");
        listYear.add("Kotoshi");
        listYear.add("Lainen");
       // listYear.add(1,"client");  --> {Kyounen, client, Kotoshi, Lainen}
       // listYear.set(1,"remain");  --> {Kyounen, remain, Kotoshi, Lainen}
       
       //Can swap 2 ele by combine get() and set()
        String swap = listYear.get(0);
        listYear.set(0, listYear.get(1));
        listYear.set(1,swap);
        
        
        //Duyet eles 
        //Cach 1:
        for (int i = 0; i < listYear.size(); i++) {
            System.out.print(listYear.get(i)+", ");
            
        }
        System.out.println("\n--------------------------------");
        //Cach 2:
        for (StringTokenizer stringTokenizer = new StringTokenizer(Arrays.toString(listYear.toArray()),"[]"); stringTokenizer.hasMoreTokens();) {
            String token = stringTokenizer.nextToken();
            System.out.print(token); // just have 1 token was printed
            System.out.println("\n----------------------------------");
        }
        
        //Cach 3:
        for (Iterator<String> ite = listYear.iterator(); ite.hasNext();) {
            String ele = ite.next();
            System.out.print(ele+", ");
            
        }
        System.out.println("\n--------------------------------");
        
        //Cach 4:
        for (String ele : listYear) {
             System.out.print(ele+", ");
        }
        System.out.println("\n--------------------------------");
        
        //Cach 5:
        listYear.stream().forEach(System.out::println);
    }
    
    
}
