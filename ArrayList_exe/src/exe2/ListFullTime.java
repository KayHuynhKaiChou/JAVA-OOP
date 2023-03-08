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
public class ListFullTime {
    List<NVfullTime> dsFull = new ArrayList<>();

    public ListFullTime() {
    }

    public List<NVfullTime> getDsFull() {
        return dsFull;
    }
    
    public void addNV(NVfullTime nv){
        dsFull.add(nv);
    }
    
    public void inputInform(){
        Scanner sc = new Scanner(System.in);
        while(true){
            NVfullTime nvf = new NVfullTime();
            System.out.print("Enter Id: ");
            nvf.setID(sc.nextLine());
            System.out.print("Enter Name: ");
            nvf.setName(sc.nextLine());
            System.out.print("Enter Telephone: ");
            nvf.setTelephone(sc.nextLine());
            System.out.print("Enter Address: ");
            nvf.setAddress(sc.nextLine());
            System.out.print("Enter NumberWorkDay: ");
            nvf.setNumberWorkDay(sc.nextInt()); sc.nextLine();
           // nvf.setSalary(nvf.getSalary());
            addNV(nvf);
    /// vì lazy nên tạo sẵn/////
            addNV(new NVfullTime("BY2", "Thai Son", "091567356", "05 Nguyen Lu",5));
            addNV(new NVfullTime("BY3", "Anh Tuan", "099103213", "123 Nguyen Trai",3));
            System.out.print("Do you wanna enter more inform others (Y/N): ");
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("N")) break;
        }
    }
    
    public void showInform(){
        for (NVfullTime nvf : dsFull) {
            nvf.display();
            System.out.println("---------------------");
        }
    }
    
    public void searchNV(String id, String name){
        Boolean check = false;
        for (NVfullTime nvf : dsFull) {
            if(nvf.getID().trim().equals(id) && nvf.getName().trim().equals(name)){
                System.out.println("This name and ID exist in list FullTime: ");
                nvf.display(); check = true;
                break;
            }
        }
        if(!check) System.out.println("--> This name & ID do Not Exist in list FullTime");
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
    
    public void arrangeF(){
        Collections.sort(dsFull, new Comparator<NVfullTime>(){
            @Override
            public int compare(NVfullTime o1, NVfullTime o2) {
                return firstName(o1.getName()).compareTo(firstName(o2.getName()));
            }
        });
    }
}
