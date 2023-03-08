/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geomatry;

import java.awt.Point;

/**
 *
 * @author DELL
 */
public class Cylinder extends Circle {
    private double high;
    
    public Cylinder(){};

    public Cylinder(double high, double radius, Point center) {
        super(radius, center);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
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
        return "Cylinder includes: " + "high =" + high + " and Bottom is "+super.toString();
    }
    
    public double areaXQ(){ // area xung quanh
        return super.CV()*high;
    }
    
    public double areaD(){ // area đáy
        return super.area();
    } 
    
    public double Volume(){
        return areaD()*high;
    }
    
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(5, 3, new Point(1,4));
        System.out.println(c1);
        System.out.println("areaXQ = "+c1.areaXQ());
        System.out.println("areaBottom = "+c1.areaD());
        System.out.println("Volume = "+c1.Volume());
    }
}
