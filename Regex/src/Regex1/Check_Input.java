/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regex1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class Check_Input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /////* digit in [0,9] ,  Character in [a->z and A->Z]
        // Vd1: Just input 1 number includes 1 digit   "^[0-9]$"
        // Vd2: Input 1 number includes many digits   "^[0-9]+$"
        // Vd3: Input 1 number includes more 6 digits   "^[0-9]{6,}$"
        // Vd4: Input 1 number includes [6->10] digits   "^[0-9]{6,10}$"
        // Vd5: Input 1 character from a->zA->Z  "^[a-zA-Z]$" or  "^[a-zA-Z]{1}$"
        // Vd6: Input 1 string includes characters and have blank "^[a-zA-Z ]+$"
        // Vd7: ("^PRINT [a-zA-Z]$");  chỉ đc nhập "PRINT a,b,A,B,... ex : PRINT M
        while(true){
            System.out.print("Enter data: ");
            String nhap = sc.nextLine();

            //Cách 1:
            /*
            Pattern pa = Pattern.compile("^LET [A-Z] = ([0-9]+|[A-Z] [*-/] [A-Z])$");
            if(pa.matcher(nhap).find()){
                System.out.println("Valid input!");
                break;
            }else{
                System.err.println("Invalid input!");
            }*/
            
            //Cách 2:
            
           // if(nhap.matches("LET [A-Z] = ([0-9]+|[A-Z] [*-/] [A-Z])")){
//            if(nhap.matches("([A-Za-z]+[0-9]+)|([0-9]+[A-Za-z]+)")){
            if(nhap.matches("A17[0-9][0-9][0-9]")){
                System.out.println("Valid input!");
                break;
            }else{
                System.err.println("Invalid input!");
            }
        }
    }
}
