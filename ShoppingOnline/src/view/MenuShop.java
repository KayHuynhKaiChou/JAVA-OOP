/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public abstract class MenuShop<T>{
    protected String title;
    protected ArrayList<T> mChon;
    Scanner sc = new Scanner(System.in);
    
    public MenuShop(){     
        mChon = new ArrayList<>();     
    }

    public MenuShop(String title, ArrayList<T> mChon) {
        this.title = title;
        this.mChon = mChon;
    }

    
   
    public void display(){
        System.out.println(title);
        int i = 0;
        for (T lc : mChon) {
            i++;
            System.out.println(i+". "+(T)lc);
        }
    }
    
    public String getSelected(){
        display();
        System.out.print("Your choice: ");
        
        return sc.nextLine();
    }
    
    public String getChoiceID(){
        display();
        System.out.print("\n>>>Do you wanna continue (Y/N)?: ");
        if(sc.nextLine().equalsIgnoreCase("Y")){
            System.out.print("+ Enter ID product : ");
            return sc.nextLine(); 
        }else{
            return "End";
        }
    }
    
    public abstract void execute(String str);
    
    //public abstract void execute(int n);
    public void run(){
        while(true){
            if(mChon.get(0) instanceof String){
                String choice = getSelected();
                execute(choice);
            }else{
               // System.out.print("Enter ID product : ");
                String id = getChoiceID();
                if(id.equals("End")) break;
                execute(id);
            }
        }
    }
}
