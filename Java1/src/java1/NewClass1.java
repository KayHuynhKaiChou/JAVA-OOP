package java1;

import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class NewClass1 {
    public static void swap(Integer a, Integer b){
        Integer tempt = a;
        a = b;
        b = tempt;
    }
    static int m = 30;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a,b;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        swap(a,b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
