/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class staff_Parttime extends staff{
    private int hourWork; // số giờ làm việc

    public staff_Parttime(){
        super();
    }

    public int getHourWork() {
        return hourWork;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    @Override
    public void enterInform() {
        Scanner sc = new Scanner(System.in);
        super.enterInform(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("+ Enter hour work staff: ");
        hourWork = sc.nextInt();
                
    }

    @Override
    public int netSalary() {
        //super.netSalary(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return hourWork*100000;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\n  HourWork: " + hourWork;
    }
    
    
    
    
}
