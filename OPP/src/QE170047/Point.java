/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QE170047;

/**
 *
 * @author DELL
 */
public class Point {
    private char name;
    private double x;
    private double y;
    
    public Point(){}

    public Point(char name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
        this.name = p.name;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
  
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distanceAB(Point po){
        return Math.sqrt(Math.pow(po.x-this.x, 2)+Math.pow(po.y-this.y, 2));
    }

    
    @Override
    public String toString() {
        return name+"("+x+","+y+")"; // A(x,y)
    }
    
    
}
