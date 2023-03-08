/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geomatry;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class Circle implements Comparable<Circle>{
    protected double radius;
    //private double xTam;
    //private double yTam;
    protected Point center;

    public Circle() {
            
    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle((" + center.x + ", " +center.y+ "); " + radius+")" ;
    }
    
    
    
    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    public double CV(){
        return 2*Math.PI*radius;
    }
// Kt 2 circle có tiếp xúc nhau hay ko ?    
    public double distance(Circle c){
        return Math.sqrt(Math.pow(center.x - c.center.x,2)+Math.pow(center.y - c.center.y,2));
    }
    public int isContact(Circle c){
        if(this.distance(c)==this.radius+c.radius) return 1;
        else if(this.distance(c)==Math.abs(this.radius - c.radius)) return -1;
        else return 0;
    }
// Tạo array chứa các Objects circle
    public static Circle[] arrCir(int n){
        Random r = new Random();
        Circle[] ci = new Circle[n];
        for(int i=0; i<n; i++){
            ci[i] = new Circle(r.nextInt(10)+1,new Point(r.nextInt(10)+1, r.nextInt(10)+1));
        }
        
        return ci;
    }
    
    @Override
    public int compareTo(Circle o) {
        if(this.radius > o.radius) return 1;
        else if(this.radius < o.radius) return -1;
        else return 0;
    }
    
    public static void main(String[] args) {
        Circle[] hinhTron = arrCir(3);
        for (Circle cir : hinhTron) {
            System.out.println(cir);
            System.out.println("S = "+String.format("%.2f", cir.area()));
            System.out.printf("P = %.2f\n",cir.CV());
            System.out.println("----------------------");
        }
        
        int check = hinhTron[0].isContact(hinhTron[1]);
        System.out.println("With "+hinhTron[0]+" and "+hinhTron[1]);
        if(check == 1) System.out.println("Two this circles contact outside.");
        else if(check == -1) System.out.println("Two circles contact inside.");
        else System.out.println("Two circles do not contact each other");
        
        System.out.println("-----------------------------------");
        System.out.println("Arrange Circle by radius ascending: ");
        Arrays.sort(hinhTron);
        System.out.println(Arrays.toString(hinhTron));
        
        /*
        ArrayList<Circle> listHT = new ArrayList<>();
        listHT.add(hinhTron[0]);
        listHT.add(hinhTron[1]);
        listHT.add(hinhTron[2]);
        
        listHT.forEach(ht -> {
            if(ht.radius>3)
                System.out.println(ht);
        });
        */
    }

    
   
}
