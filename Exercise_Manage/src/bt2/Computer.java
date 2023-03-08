/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

/**
 *
 * @author DELL
 */
public class Computer {
    protected String name;
    protected String color;
    protected Double price;

    public Computer(String name, String color, Double price) {
        this.name = name;
        this.color = color;
        this.price = price;

    }
    
    public Computer() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "\t" + price + "\t" + color;
    }
    
    
}

