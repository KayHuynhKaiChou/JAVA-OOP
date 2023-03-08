/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

/**
 *
 * @author DELL
 */
public class Employee {
    private String name;
    private Double basicSalary;

    public Employee() {
    }
    
    

    public Employee(String name, Double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return name + "     " + basicSalary;
    }
    
    
}
