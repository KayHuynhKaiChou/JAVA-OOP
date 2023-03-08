/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

/**
 *
 * @author DELL
 */
public class SComputer extends Computer{
    private String series;
    
    public SComputer(){}

    public SComputer(String series, String name, String color, Double price) {
        super(name, color, price);
        this.series = series;
    }
    
    public Double getSalePrice(){
        if(this.series.charAt(series.length()-1) == 'A'){
            return super.getPrice() - super.getPrice()*0.05;
        }
        return super.getPrice() - super.getPrice()*0.1;
    }

    @Override
    public String toString() {
        return super.toString()+"\t" + series;
    }
    
    
}
