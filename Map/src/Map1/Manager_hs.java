/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Manager_hs {
    public static void main(String[] args) {
        listStudent ls = new listStudent();
        Scanner sc = new Scanner(System.in);
        CheckInput ch = new CheckInput();
        while(true){
            System.out.print("Enter student name: ");
            String ten = ch.checkName();
            System.out.print("Enter school: ");
            String truong = ch.checkSchool();
            System.out.print("Enter score Math: ");
            Double toan = ch.checkPoint();
            System.out.print("Enter score Physical: ");
            Double ly = ch.checkPoint();
            System.out.print("Enter score Chemistry: ");
            Double hoa = ch.checkPoint();
            ls.addHS(new student(ten, truong, toan, ly, hoa));
            // Because lazy to enter , so i will create available infor
            ls.addHS(new student("Nguyen Thai Son", "THPT Quoc Hoc QN", 8.6, 7.7, 8.2));
            ls.addHS(new student("Nguyen Trung Tam", "THPT Chuyen Le Quy Don", 8.2, 8.4, 8.0));
            ls.addHS(new student("Mai Xuan Huu", "THPT Quoc Hoc QN", 9, 7.8, 8.5));
            System.out.print("Do you wanna enter more student information?(Y/N): ");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("N")) break;
        }
        ls.showAllInform();
        //=====Print all ele in HashMap=====
        System.out.println("In Quy Nhon city, we have student rank: ");
        HashMap<String,Double> mapHS = ls.getPercent();
        mapHS.forEach((key,value)-> System.out.println("Type "+key+": "+value+"%"));
    }
}
