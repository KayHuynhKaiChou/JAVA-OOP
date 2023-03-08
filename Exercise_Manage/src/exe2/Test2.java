/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test2 {
    public static void main(String[] args) {
        List<Course> khHoc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        khHoc.add(new Course(110,"PRJ311"));
        khHoc.add(new Course(150,"DBI202"));
        khHoc.add(new Course(120,"PRF192"));

        
        System.out.print("Add more how many course: ");
        int sl = Integer.parseInt(sc.nextLine());
        int i = 0;
        do{
            i++;
            System.out.print("Course Name: "); String name = sc.nextLine();
            System.out.print("Course Fee: "); Double fee = Double.parseDouble(sc.nextLine());
            khHoc.add(new Course(fee,name));
        }while(i<sl);
        
        MyCourse mc = new MyCourse();
        
            System.out.print("Enter test function (1-f1; 2-f2): ");
            int s2 = sc.nextInt();
            switch(s2){
                case 1:
                    System.out.print("Enter st:"); s2 = sc.nextInt();
                    mc.f1(khHoc, s2);
                    System.out.println("OUTPUT: ");
                    for (Course co : khHoc) {
                        System.out.println(co.getName());
                    }
                    break;
                case 2:
                    Double s3;
                    System.out.print("Enter Course fee: "); s3 = sc.nextDouble();
                    
                    System.out.println("OUTPUT: "); System.out.println(mc.f2(khHoc, s3));
                    break;
            }
                
            
        
    }
}
