/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
import Entity.Student;
import IOTools.IOkeyboard;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Constraints {
    public static String checkCode(String code){
//        for (Student sv : listDV) {
//            if(sv.getCode().equals(code)){
//                return "CODE may be the same with available Code, Please enter again!";
//            }
//        }
        if(!code.matches("QE17[0-9][0-9][0-9]")) return "Code is wrong format (ex: QE17008,...), Please enter again!";
        return "true";
    }
    
    public static String checkMark(Double w){
        if(w<0 || w>10) return "Mark is in the range [1,10] , Please input again!";
        return "true";
    }
    
    public static String inputCode(){
        while(true){
            String code = IOkeyboard.inputNoneEmptyString("Enter Code: ", "The Code can not be empty, please enter again !");
            String check = checkCode(code);
            if(check.equals("true")){
                return code;
            }
            else System.out.println(check);
        }
    }
    
    public static Double inputMark(){
        while(true){
            Double mark = IOkeyboard.inputDouble("Enter Mark: ","Error Number input, please enter again!" ); 
            String check = checkMark(mark);
            if(check.equals("true")){
                return mark;
            }
            else System.out.println(check);
        }
    }
    
    public static String inputName(){
        while(true){
            String name = IOkeyboard.inputNoneEmptyString("Enter name: ","Name is not Empty, please enter again!" ); 
            if(name.length()>=7 && checkName(name).equals("True")){
                return name;
            }
            else {
                if(name.length()<7) System.out.println("Length of Name are more than 7 character , please enter again!");
                else System.out.println(checkName(name));
            }
        }
    }
    
    public static String checkName(String namae){
        int sl = 0;
        for(int i=0; i<namae.length(); i++){
            if(!Character.isDigit(namae.charAt(i))) {
                sl++;
                if(sl==2) return "True";
            }
        }
       return "Name should contain at least 2 character (a-z), Please enter again!";
    }
}
