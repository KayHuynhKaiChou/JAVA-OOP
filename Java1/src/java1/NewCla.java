/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NewCla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.matches("[a-zA-Z0-9 ]+")) System.out.println(s);
        else System.out.println("Error");
    }
}
