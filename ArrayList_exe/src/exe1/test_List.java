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
public class test_List {
    public static void main(String[] args) {
        List_Staff ls = new List_Staff();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("==============MANAGE STAFF===============");
            System.out.println("Note : \n+ Staffs in list which includes : fulltime staff and parttime staff"
                    + "                \n+ netSalary(fulltime) = Hard salary + (bonus - penalty)"
                    + "                \n+ netSalary(parttime) = hour work * 100000");
            System.out.println("1.Add staff in the list");
            System.out.println("2.Show all related information of all the staff");
            System.out.println("3.Remove staff out of list");
            System.out.println("4.Check whether staff exists in list");
            System.out.println("5.Show list fulltime staffs who have salary(net salary)\nis lower than the average salary of all staff in the company");
            System.out.println("6.sort staffs in the list by salary ascending");
            
            System.out.print("Your choice is: ");
            choice = sc.nextInt(); sc.nextLine();
            
            switch(choice){
                case 1:
                    int num;
                    System.out.print("Press '1' to choice fulltime staff and '2' to choice parttime staff: ");
                    num = sc.nextInt();
                    if(num == 1){
                       staff full = new staff_Fulltime();
                       full.enterInform();
                       ls.addStaff(full);
                    }else{
                        staff part = new staff_Parttime();
                        part.enterInform();
                        ls.addStaff(part);
                    }
                    break;
                case 2:
                    System.out.println("------------List Staff--------------");
                    ls.showAllStaff();
                    break;
                case 3:
                    int nu;
                    System.out.print("Press '1' to choice fulltime staff and '2' to choice parttime staff: ");
                    nu = sc.nextInt();
                    if(nu == 1){
                       staff full = new staff_Fulltime();
                       full.enterInform();
                       ls.removeStaff(full);
                    }else{
                        staff part = new staff_Parttime();
                        part.enterInform();
                        ls.removeStaff(part);
                    }
                    break;
                case 4:
                    int n;
                    System.out.print("Press '1' to choice fulltime staff and '2' to choice parttime staff: ");
                    n = sc.nextInt();
                    if(n == 1){
                       staff full = new staff_Fulltime();
                       full.enterInform();
                       ls.checkStaff(full);
                    }else{
                        staff part = new staff_Parttime();
                        part.enterInform();
                        ls.checkStaff(part);
                    }
                    break;
                case 5:  
                    System.out.println("That List fulltime staffs include: ");
                    ls.listFullStaff();
                    break;
                case 6:
                    ls.arrange();
                    ls.showAllStaff();
                    break;
            }
        }while(choice != 8);
        
        
    }
}
