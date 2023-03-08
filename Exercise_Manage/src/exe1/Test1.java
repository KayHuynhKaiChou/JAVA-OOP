/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        Double bsalary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter employee revenue: ");
        Double revenue = Double.parseDouble(sc.nextLine());
        System.out.print("Enter TC: ");
        int tc = sc.nextInt();
        
        Employee em = new Employee(name, bsalary);
        seller se = new seller(revenue,name,bsalary);
        
        switch(tc){
            case 1:
                System.out.println(em);
                System.out.println(se);
                break;
            case 2:
                System.out.println(se.getSalary());
        }
    }
}
