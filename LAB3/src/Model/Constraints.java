/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Constraints {
    public static String checkID(String id,ArrayList<CD> listCDs){
        for (CD cd : listCDs) {
            if(cd.getId().equals(id)){
                return "ID may be the same with available ID, Please enter again!";
            }
        }
        if(!id.matches("C[0-9][0-9][0-9]")) return "ID is wrong format (ex: C001,C018,...), Please enter again!";
        return "true";
    }
    
    public static String checkPrice(Double w){
        if(w==0) return "true";
        return (w%100==0 && w>=1000) ? "true" : "Price must be more than 1000vnđ and divisible by 100, Please input again!";
    }
    
    public static String inputID(ArrayList<CD> listCDs){
        while(true){
            String id = IOkeyboard.InputNoneEmptyString("Enter CD's ID: ", "The ID can not be empty, please enter again !");
            String check = checkID(id, listCDs); 
            if(check.equals("true")) return id;
            else System.err.println(check);
        }
    }
    
    public static Double inputPrice(){
        while(true){
            Double price = IOkeyboard.InputDouble("Enter CD's price: ","Error Number input, please enter again!" ); 
            String check = checkPrice(price);
            if(check.equals("true")) return price;
            else System.err.println(check);
        }
    }
    
    public static String inputTitle(){
        while(true){
            String title = IOkeyboard.InputNoneEmptyString("Enter CD's Title: ","Name is not Empty, please enter again!" ); 
            if(title.length()<=30 && checkTitle(title).equals("True")){
                return title;
            }
            else {
                if(title.length()>30) System.err.println("Length of Name are more than 30 character , please enter again!");
                else System.err.println(checkTitle(title));
            }
        }
    }
    
    public static String checkTitle(String namae){
        int slan = 0;
        for(int i=0; i<namae.length(); i++){
            if(!Character.isDigit(namae.charAt(i))) {
                slan++;
                if(slan==2) return "True";
            }
        }
        return "Name should contain at least 2 character (a-z), Please enter again!";
    }
    
    public static String checkYear(int y){
        return ((y>=1900 && y<= 2023) || y==0) ? "true" : "year is in range [1900,2023]";
    }
    
    public static int inputYear(){
        while(true){
            int year = IOkeyboard.InputInteger("Enter CD's year published: ","Error Number input, please enter again!" ); 
            String check = checkYear(year);
            if(check.equals("true")) return year;
            else System.err.println(check);
        }
    }
    
    public static char inputType(){
        while(true){
            String type = IOkeyboard.InputNoneEmptyString("Type of CD includes:\n+ Audio(a)\n+ Video(v)\nEnter CD's Type (a/v): ","Name is not Empty, please enter again!" ); 
            if(type.matches("[a|v]")) return type.charAt(0);
            else System.err.println("Just enter 2 character : a or v, Please enter again!");
        }
    }
    
    public static String inputCollectInUpdate(){
        String naCo = "";
        while(true){
            int num = IOkeyboard.InputInteger("Enter new name collection (by number): ", "Input must be number, pls enter again!");
            if(num>=0 && num<=3) {
                naCo = num == 1 ? "game" : num==2 ? "movie" : num==3 ? "music" : "";
                break;
            }else System.out.println("Just enter number in range [1,3], pls enter again!");
        }
        return naCo;
    }
}
