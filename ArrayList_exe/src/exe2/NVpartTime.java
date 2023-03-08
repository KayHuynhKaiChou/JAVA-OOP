/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe2;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author DELL
 */
public class NVpartTime {
    private String ID;
    private String name;
    private String telephone;
    private String address;
    private Double salary;
    private int timeHour;
    
    public NVpartTime(){};

    public NVpartTime(String ID, String name, String telephone, String address, int timeHour) {
        this.ID = ID;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
       // this.salary = salary;
        this.timeHour = timeHour;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return 1.0*timeHour*120000;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public void setTimeHour(int timeHour) {
        this.timeHour = timeHour;
    }
    
    
    public void display(){
        Locale lc = new Locale("vi","VN");
        NumberFormat num = NumberFormat.getCurrencyInstance(lc);
        System.out.println("ID:        "+ID);
        System.out.println("Name:      "+name);
        System.out.println("Telephone: "+telephone);
        System.out.println("Address:   "+address);
        System.out.println("Salary:    "+num.format(getSalary()));
        System.out.println("TimeHours: "+timeHour);
    }
    
}
