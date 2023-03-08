/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_controller;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mChon;
    
    public Menu(){}
    
    public Menu(String td, String[] mc){
        title=td;
        mChon= new ArrayList<>();
        for(String s:mc) mChon.add((T) s);
    }
//-------------------------------------------
    public void display(){
        System.out.println(title);
        System.out.println("--------------------------------");
        for(int i=0; i<mChon.size();i++)
            System.out.println((i+1)+"."+mChon.get(i));
        System.out.println("--------------------------------");
    }
//-------------------------------------------
    public int getSelected(){
        while(true){
            try{
                display();
                Scanner sc= new Scanner(System.in);
                System.out.print("Enter selection..");
                return Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.err.println("Option must be Integer, Not another character, Please enter again!");
            }
        }
        
    }
//-------------------------------------------
    public abstract void execute(int n);
//-------------------------------------------
    public void run(){
        while(true){
            int n=getSelected();
            execute(n);
            if(n>mChon.size()) break;
        }
    }
//-------------------------------------------    
}