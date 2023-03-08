/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ListPartTime {
    List<NVpartTime> dsPart = new ArrayList<>();

    public ListPartTime() {
    }

    public List<NVpartTime> getDsPart() {
        return dsPart;
    }
    
    public void addNV(NVpartTime nv){
        dsPart.add(nv);
    }
    
    public void inputInform(){
        Scanner sc = new Scanner(System.in);
        while(true){
            NVpartTime nvp = new NVpartTime();
            System.out.print("Enter Id: ");
            nvp.setID(sc.nextLine());
            System.out.print("Enter Name: ");
            nvp.setName(sc.nextLine());
            System.out.print("Enter Telephone: ");
            nvp.setTelephone(sc.nextLine());
            System.out.print("Enter Address: ");
            nvp.setAddress(sc.nextLine());
            System.out.print("Enter TimeHour: ");
            nvp.setTimeHour(sc.nextInt()); sc.nextLine();
            //nvf.setSalary(nvf.getSalary());
            addNV(nvp);
//// vì lazy nên create sẵn
            addNV(new NVpartTime("BY6", "Trung Dung", "0219034820", "45 Le Loi",14));
            addNV(new NVpartTime("BY10", "Bao Tran", "0984449123", "19 Tran Hung Dao",12));
            System.out.print("Do you wanna enter more inform others (Y/N): ");
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("N")) break;
        }
    }
    
    public void showInform(){
        for (NVpartTime nvp : dsPart) {
            nvp.display();
            System.out.println("---------------------");
        }
    }
    
    public void SearchNV(String id, String name){
        Boolean check = false;
        for (NVpartTime nvp : dsPart) {
            if(nvp.getID().trim().equals(id) && nvp.getName().trim().equals(name)){
                System.out.println("This name and ID exist in list PartTime: ");
                nvp.display(); check = true;
                break;
            }
        }
        if(!check) System.out.println("--> This name & ID do NOT Exist in list PastTime");
    }
    
    public String firstName(String fn){
        if(fn.indexOf(" ")>0){
            int index = fn.lastIndexOf(" ");
            String first = fn.substring(index+1);
            return first;
        }else{
            return fn;
        }
    }
    
    public void arrangeP(){
        Collections.sort(dsPart, new Comparator<NVpartTime>(){

            @Override
            public int compare(NVpartTime o1, NVpartTime o2) {
                return firstName(o1.getName()).compareTo(firstName(o2.getName()));
            }
        });
    }
}
