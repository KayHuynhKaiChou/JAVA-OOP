/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TextMenu {
    String title;
    ArrayList mChon;

    TextMenu() {
    }
    
    TextMenu(String[] mc){
        title = mc[0];
        mChon = new ArrayList();
        for(int i=1; i<mc.length; i++){
            mChon.add(mc[i]);
        }
    }
    
    void display(){
        System.out.println("========="+title+"===========");
        for(int i=0; i<mChon.size(); i++){
            System.out.println((i+1)+". "+mChon.get(i));
            
        }
    }
    
    int getSelected(){
        display();
        System.out.print("Your choice is: ");
        Scanner sc = new Scanner(System.in);
        int en = sc.nextInt();
       
        return en;
    }
    
    void execute(){
        
        int choice ;
        while(true){
            choice = getSelected();
            switch(choice){
                
                case 1:
                    System.out.println("hello");
                    break;
                case 2:
                    System.out.println("hell");
                    break;
                case 3:
                    System.out.println("hel");
                    break;
                case 4:
                    System.out.println("he");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        String[] arr = {"Calculation Fraction","Add Fraction together.","Subtract Fraction together.","Mutiply Fraction together.","Divide Fraction together.","Reverse a fraction."};
        TextMenu tm = new TextMenu(arr);
        tm.execute();
    }
}
