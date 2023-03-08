/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QE170047;

/**
 *
 * @author DELL
 */
public class Rectangle implements Shape{
    private Point p1,p2; // chỉ cần 2 point để xđ 1 rectangle // hoặc dùng width, leight

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    
    @Override
    public String toString() {
        return "Rectangle("+super.toString()+"-length: "+(p1.getX()-p2.getX())+", width: "+(p1.getY()-p2.getY())+"), diagonal: "+diagonal();
    }
   
    @Override
    public double area() {
        return Math.abs((p1.getX()-p2.getX())) * Math.abs((p1.getY()-p2.getY()));
    }
    
    public double diagonal(){
        return p1.distanceAB(p2);
    }
    
}
