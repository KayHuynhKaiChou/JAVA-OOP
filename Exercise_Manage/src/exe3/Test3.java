/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter reservation Code: ");
        String rc = sc.nextLine();
        ReservationCode rec = new ReservationCode(name, rc);
        
        System.out.print("Enter tc: ");
        int tc = Integer.parseInt(sc.nextLine());
        
        switch(tc){
            case 1:
                System.out.println("OUTPUT: ");
                System.out.println(rec);
                break;
            case 2:
                System.out.println("OUTPUT: ");
                System.out.println(rec.getCode());
        }
    }
}
