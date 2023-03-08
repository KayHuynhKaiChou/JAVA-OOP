/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Area_triangle {

    /**
     * @param args the command line arguments
     */
    public static void P_triangle(double a, double b, double c){
        double P = a + b + c;
        System.out.println("Chu vi triangle: "+P);
    }
    
    public static void S_triangle(double a, double b, double c){
        double np = (a+b+c)/2;
        double S;
        S = Math.sqrt(np*(np-a)*(np-b)*(np-c));
        System.out.println("Area triangle: "+S);

    }
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a = ");
        a = sc.nextDouble();
        System.out.print("Enter value b = ");
        b = sc.nextDouble();
        System.out.print("Enter value c = ");
        c = sc.nextDouble();     
        
        Area_triangle.P_triangle(a, b, c);
        Area_triangle.S_triangle(a, b, c);
    }
    
}
