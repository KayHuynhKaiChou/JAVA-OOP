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
public class staff_Fulltime extends staff{
    private String bonus;
    private String penalty; // tiền phạt
    private String Hardsalary; // lương cứng 

    public staff_Fulltime(){
        super();
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getHardSalary() {
        return Hardsalary;
    }

    public void setHardSalary(String Hardsalary) {
        this.Hardsalary = Hardsalary;
    }

    @Override
    public void enterInform() {
        Scanner sc = new Scanner(System.in);
        super.enterInform(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("+ Enter bonus staff: ");
        bonus = sc.nextLine();
        System.out.print("+ Enter penalty staff: ");
        penalty = sc.nextLine();
        System.out.print("+ Enter Hard salary staff: " );
        Hardsalary = sc.nextLine();
    }

    @Override
    public int netSalary() {
        //super.netSalary(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        int bonus1 = Integer.parseInt(bonus);
        int penalty1 = Integer.parseInt(penalty);
        int hardsalary1 = Integer.parseInt(Hardsalary);
        
        return hardsalary1 + (bonus1 - penalty1);
    }
    
   
    
    @Override
    public String toString() {
        return super.toString() + "\n  Bonus: " + bonus + ", Penalty: " + penalty + ", Salary: " + Hardsalary;
    }
    
    
}
