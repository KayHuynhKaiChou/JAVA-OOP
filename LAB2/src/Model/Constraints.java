/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import IOTools.IOkeyboard;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Constraints {
    public static String checkID(String id,ArrayList<Animal> listDV){
        for (Animal dv : listDV) {
            if(dv.getId().equals(id)){
                return "ID may be the same with available ID, Please enter again!";
            }
        }
        if(!id.matches("A17[0-9][0-9][0-9]")) return "ID is wrong format (ex: A17008,...), Please enter again!";
        return "true";
    }
    
    public static String checkWeight(Double w){
        if(w>=200) return "Weight are more than 200 kg , Please input again!";
        return "true";
    }
    
    public static String inputID(ArrayList<Animal> listDV){
        while(true){
            String id = IOkeyboard.InputNoneEmptyString("Enter Animal ID: ", "The ID can not be empty, please enter again !");
            String check = checkID(id, listDV);
            if(check.equals("true")){
                return id;
            }
            else System.out.println(check);
        }
    }
    
    public static Double inputWeight(){
        while(true){
            Double weight = IOkeyboard.InputDouble("Enter Animal weight: ","Error Number input, please enter again!" ); 
            String check = checkWeight(weight);
            if(check.equals("true")){
                return weight;
            }
            else System.out.println(check);
        }
    }
    
    public static String inputName(){
        while(true){
            String name = IOkeyboard.InputNoneEmptyString("Enter Animal name: ","Name is not Empty, please enter again!" ); 
            if(name.length()<=15 && checkName(name).equals("True")){
                return name;
            }
            else {
                if(name.length()>15) System.out.println("Length of Name are more than 15 character , please enter again!");
                else System.out.println(checkName(name));
            }
        }
    }
    
    public static String checkName(String namae){
        for(int i=0; i<namae.length(); i++){
            if(!Character.isDigit(namae.charAt(i))) {
                return "True";
            }
        }
       return "Name should contain at least 2 character (a-z), Please enter again!";
    }
}
