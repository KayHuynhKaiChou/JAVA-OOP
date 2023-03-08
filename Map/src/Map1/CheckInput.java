/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CheckInput {
    Scanner sc = new Scanner(System.in);
    public Double checkPoint(){
        while(true){
            try {
                
                Double score = Double.parseDouble(sc.nextLine());
                if(score>=0 && score<=10 ){
                    return score;
                }else{
                    System.out.println("score subjects in [0,10]. So input again!");
                }
            } catch (Exception e) {
                System.err.println("Invalid score, please input again!");
            }
            
        }
        
    }
    
    public String checkName(){
        while(true){
            String input = sc.nextLine();
            if(!input.trim().equals("")){
                return input;
            }else{
                System.err.println("Invalid Your name, please input again!");
            }
        }
    }
    
    public String checkSchool(){
        while(true){
            String input = sc.nextLine();
            if(!input.trim().equals("")){
                return input;
            }else{
                System.err.println("Invalid Your school, please input again!");
            }
        }
    }
    
    public static void main(String[] args) {
        CheckInput ch = new CheckInput();
        System.out.println("Your score is: "+ch.checkPoint());
        System.out.println("Your name is: "+ch.checkName());
    }
}
