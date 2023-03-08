/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

/**
 *
 * @author DELL
 */
public class seller extends Employee{
    private Double revenue; //doanh thu trên 1 year

    public seller() {
    }
    
    

    public seller(Double revenue) {
        this.revenue = revenue;
    }

    public seller(Double revenue, String name, Double basicSalary) {
        super(name, basicSalary);
        this.revenue = revenue;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
    
    public Double getSalary(){
        if(revenue<30000.0)
            return super.getBasicSalary() + revenue*0.05;
        else
            return super.getBasicSalary() + revenue*0.1;
    }

    @Override
    public String toString() {
        return super.toString()+"     "+ revenue;
    }
    
    
}
