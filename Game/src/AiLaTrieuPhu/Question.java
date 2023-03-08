/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AiLaTrieuPhu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Question {
    private String title;
    ArrayList<String> options;
    private String result;
    Scanner sc = new Scanner(System.in);
    
    public Question(){
        title = "";
        options = new ArrayList<>();
    }

    public Question(String title, ArrayList<String> options, String result) {
        this.title = title;
        this.options = options;
        this.result = result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
    public void input(){
        
        int kitu = 65;
        String yn ;
        System.out.print("Enter a question: ");
        title = sc.nextLine();
        System.out.println("---------------\nEnter options:");
        for(;;){ 
            System.out.print((char)(kitu++)+". ");
            this.options.add(sc.nextLine());
            if(kitu==67 || kitu==69){
                System.out.print("Do you wanna extra options (Y/N): ");
                yn = sc.nextLine();
                if(yn.equalsIgnoreCase("N")) break;
            }
        }
        System.out.print("Enter Correct Answer: ");
        result = sc.nextLine().toUpperCase().trim();
    }
    public void display(){
        int kt = 65;
        System.out.println(title);
        for (String op : options) {
            System.out.println((char)(kt++)+". "+op);
        }
        System.out.print("So Your answer is: ");
        if(check(sc.nextLine())) System.out.println("Exactly!");
        else System.out.println("Wrong!\nthe correct Answer is :"+result);
    }
    
    public Boolean check(String s){
        return s.equalsIgnoreCase(result);
    }
}
