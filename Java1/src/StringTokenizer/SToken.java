/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringTokenizer;

import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class SToken {
    public static void main(String[] args) {
        // Ko chọn dấu phân cách thì mặc định dấu phân cách là blank
        StringTokenizer st = new StringTokenizer("It's no   better way to   actually see one  of those");
        // Ko có cách nào tốt hơn là gặp 1 trong số họ
        System.out.println("Total tokens: "+st.countTokens());
        while(st.hasMoreTokens()) System.out.println(st.nextToken());
        
        
        // Chỉ định dấu phân cách là ";" and ":"
        StringTokenizer st1 = new StringTokenizer("I;don't;have;enough;:talent;:;so;;;i have to work hard", ";:");
        System.out.println("\nTotal tokens: "+st1.countTokens());
        while(st1.hasMoreTokens()) System.out.println(st1.nextToken());
        
    }
}
