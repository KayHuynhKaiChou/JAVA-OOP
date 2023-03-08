/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MainNV {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        ListFullTime lf = new ListFullTime();
        ListPartTime lp = new ListPartTime();
        
        System.out.println(">>>>Enter inform FullTime:");lf.inputInform();
        System.out.println(">>>>Enter inform PartTime:");lp.inputInform(); 
        
        System.out.println(".....>>> List FULLTIME employees");
        lf.showInform();
        
        System.out.println();
        
        System.out.println(".....>>> List PARTTIME employees");
        lp.showInform();
/////////////////////////////////////////////////////////////////////////////
        Company co = new Company(lf,lp);
        System.out.print("\nTotal salary which company must pay for employees: "+co.AllSalary());
///////////////////////////////////////////////////////////////////////////////
        System.out.println("\n-------------------------------------");
        System.out.print("Enter ID of staff you search: ");
        String id = sc.nextLine();
        System.out.print("Enter name of staff you search: ");
        String name = sc.nextLine();
        System.out.println();
        co.searchNVFP(TypeEmploy.FULLTIME, id, name);
        co.searchNVFP(TypeEmploy.PARTTIME, id, name);
        
/////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nArrange list employees FullTime ascending by First name:");
        lf.arrangeF(); lf.showInform();
        System.out.println("-..-....................-..-");
        System.out.println("\nArrange list employees PartTime ascending by First name:");
        lp.arrangeP(); lp.showInform();
    }
}
