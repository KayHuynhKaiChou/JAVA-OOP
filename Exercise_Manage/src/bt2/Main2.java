/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of a computer: ");
        String na = sc.nextLine();
        System.out.print("Enter color of a computer: ");
        String co = sc.nextLine();
        System.out.print("Enter series of a computer: ");
        String se = sc.nextLine();
        System.out.print("Enter price of a computer: ");
        Double gia = Double.parseDouble(sc.nextLine());
        SComputer sco = new SComputer(se,na,co,gia);
        
        while(true){
            System.out.println("1. TC = 1 - test toString() function");
            System.out.println("2. TC = 2 - test getSalaryPrice function");
            System.out.println("3. TC = 3 - test Name function");
            System.out.print("Enter TC: ");
            int tc = Integer.parseInt(sc.nextLine());
            
            switch(tc){
                case 1:
                    System.out.println("OUTPUT: ");
                    Computer c1 = new Computer(na, co, gia);
                    System.out.println(c1);
                    System.out.println(sco);
                    break;
                case 2:
                    System.out.println("OUTPUT: ");
                    System.out.println(sco.getSalePrice());
                    break;
                case 3:
                    System.out.println("OUTPUT: ");
                    System.out.println(sco.getName());
                    break;
            }
            if(tc == 3) break;
        }
    }

}
