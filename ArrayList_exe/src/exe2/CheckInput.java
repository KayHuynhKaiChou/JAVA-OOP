/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe2;

import java.util.Scanner;
import java.util.regex.Pattern;


public class CheckInput {
    Scanner sc = new Scanner(System.in);
            
    public CheckInput() {
    }
    
    public String checkID(){
        String id;
        while(true){
            System.out.print("Enter ID:");
            id = sc.nextLine();
            if(id.startsWith("BY17") && id.length()==8 && !id.isBlank() && !id.isEmpty()) break;
            else System.out.println("ID is Invalid , input again!");
        }
        return id.trim();
    }
    
    String UpperCaseFirst(String name){
        char[] arr = name.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(i==0 || (i>0 && arr[i-1] == ' ')){
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        String s = "";
        for(int i = 0; i<arr.length; i++){
            s = s + arr[i];
        }
        return s;
    }
    
    public String checkName(){
        String name = "";
        Pattern pa = Pattern.compile("^[a-zA-Z ]+$");
        Boolean kq = false ;
            while(true){
                System.out.print("Enter Name:");
                name = sc.nextLine();
                for(int i=0; i<name.length(); i++){
                    char ch = name.charAt(i); String s = String.valueOf(ch);
                    if(s.equals(" ")){
                        kq = true;
                    }
                }
                
                if(pa.matcher(name).find() && kq && !name.isBlank() && !name.isEmpty()) break;
                else System.err.println("Name is Invalid or lack of blank, input again!");
            }
            return UpperCaseFirst(name.trim());
        
    }
    
    public static void main(String[] args) {
        CheckInput ch = new CheckInput();
        System.out.println(ch.checkName());
    }
}
