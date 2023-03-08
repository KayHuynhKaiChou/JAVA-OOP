/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu {
    String title;
    ArrayList<String> mChon;
    ListGakusei list;
    public Menu(){}
    
    public Menu(ArrayList me){
        list = new ListGakusei();
        mChon = new ArrayList<String>();
        mChon.addAll(me);
        title = mChon.get(0);
    }
    
    public void display(){
        for (String lc : mChon) {
            System.out.println(lc);
        }
    }
    
    public int getSelected(){
        display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        
        return Integer.parseInt(sc.nextLine()); 
    }
    
    public void execute() throws IOException{
        int choice;
        while(true){
            choice = getSelected();
            switch(choice){
                case 1:
                    list.addHS();
                    break;
                case 2:
                    list.editHS();
                    break;
                case 3:
                    list.deleteHS();
                    break;
                case 4:
                    list.sortGPA();
                    break;
                case 5:
                    list.sortName();
                    break;
                case 6:
                    list.showAllHS();
                    break;
                case 7:
                    list.saveFile();
                    System.out.println("Save completely!");
                    break;
                case 8:
                    System.out.println("Read completely!");
                    list.readFile();
                    
                    break;
            }
            if(choice == 0) break;
        }
    }
}
