/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QE170047;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point('A',2,4);
        Point p2 = new Point('B',1, 5);
        
        System.out.format("The distance between "+p1+" and "+p2+" is z = %.2f\n", p1.distanceAB(p2));
       
        Rectangle re = new Rectangle(p1,p2);
        System.out.println(re);
        
    }
}
