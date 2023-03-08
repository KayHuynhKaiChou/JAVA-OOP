/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function_string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Function_String {

    
    public static void main(String[] args) {
        String name = "Lion Messi";
        //charAt();
        char kitu = name.charAt(0); System.out.println(kitu);
        
        // take first name by ( lastIndexOf, indexOf, substring)
        String firstName = "";
        name.trim();
        if(name.indexOf(" ")>0){
            int in = name.lastIndexOf(" ");
            firstName = name.substring(in+1);
            System.out.println(firstName);
        }else{
            System.out.println(name);
        }
        
        //Combine 2 string by concat()
        String name1 = " M10";
        String name2 = "";
        
        name2 = name.concat(name1);
        System.out.println(name2);
        
        //Check whether substring(a sequence of char characters) are in a string
        String phu = "essi";
        System.out.println(name.contains(phu));
        
        //use startsWith , endsWith
        String mssv = "QE170047";
        Boolean result = mssv.startsWith("QE");
        //Boolean result = mssv.startsWith("QE",2); bắt đầu tìm từ index 2 của mssv
        System.out.println(result);
        
        //use split
        String[] sub = name.split(" ");
        System.out.println(Arrays.toString(sub));
        
    }
    
}
