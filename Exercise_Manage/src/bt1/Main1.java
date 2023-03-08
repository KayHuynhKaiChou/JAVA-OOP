/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Person name: ");
        String na = sc.nextLine();
        System.out.print("Enter Person age: ");
        int ag = Integer.parseInt(sc.nextLine());
        Person pe = new Person(na, ag);
        
        while(true){
            System.out.println("1. TC = 1 - test getName()");
            System.out.println("2. TC = 2 - test setAge()");
            System.out.println("3. TC = 3 - test toString()");
            System.out.print("Enter TC: ");
            int tc = Integer.parseInt(sc.nextLine());
            
            switch(tc){
                case 1:
                    System.out.println("OUTPUT: ");
                    System.out.println(pe.getName());
                    break;
                case 2:
                    
                    System.out.print("Enter new age: ");
                    int newage = Integer.parseInt(sc.nextLine());
                    pe.setAge(newage);
                    System.out.println("OUTPUT: ");
                    System.out.println( pe.getAge());
                    break;
                case 3:
                    System.out.println("OUTPUT: ");
                    System.out.println(pe);
                    break;
            }
            if(tc == 3) break;
        }
        

    }
}
