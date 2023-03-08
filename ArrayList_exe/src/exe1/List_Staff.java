/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class List_Staff {
    private ArrayList<staff> dsnv;

    public List_Staff() {
        this.dsnv = new ArrayList<staff>();
    }

    public List_Staff(ArrayList<staff> dsnv) {
        this.dsnv = dsnv;
    }
    
    public void addStaff(staff nv){
        dsnv.add(nv);
    }
    
    public void removeStaff(staff nv){
        if(dsnv.remove(nv)){
            System.out.println("remove success");
        }else{
            System.out.println("remove Fail because This staff does not exist in list");
        }
    }
    
    public void checkStaff(staff nv){
        if(dsnv.contains(nv)){
            System.out.println("This staff exist in list");
        }else{
            System.out.println("This staff does not exist in list");
        }
    }
    
    public void showAllStaff(){
        for (staff nv : dsnv) {
            int i = 1;
            System.out.println("Staff "+i+":\n  "+nv.toString());
        }
    }
    public int total(){
        int sum = 0;
        for (staff nv : dsnv) {
            if(nv instanceof staff_Fulltime){
                sum += nv.netSalary();
            }else{
                sum += nv.netSalary();
            }
        }
        return sum;
    }
    public void listFullStaff(){
        double average = (double)total()/dsnv.size();
        
        for (staff nv : dsnv) {
            if(nv instanceof staff_Fulltime && nv.netSalary() < average){
                System.out.println(nv.toString());
            }
        }
    }
    public void arrange(){
        Collections.sort(dsnv, new Comparator<staff>(){
            @Override
            public int compare(staff o1, staff o2) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return o1.netSalary() - o2.netSalary();
            }
        });
    }
    
}
    
    

