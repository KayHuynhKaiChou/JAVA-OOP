/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class StudentList {
    private ArrayList<Student> listHS = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getListHS() {
        return listHS;
    }
    
    public void readFile(String fname){
        try {
          //(cấp cao)                    (cấp thấp)
            Scanner sc = new Scanner(new FileReader(fname));
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                addStudent(s);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void addStudent(String hs){
        String[] arr = hs.split("\\$");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDate localDate = LocalDate.parse(arr[3], formatter);
        // char sex=arr[4].equals("Male")?'M':'F';
        listHS.add(new Student(arr[0],arr[1],arr[2],localDate,arr[4]));
    }
    
    public ArrayList<Student> SearchByCriteria(Predicate<Student> p){
        /*ArrayList<Student> newlist = new ArrayList<>();
        for (Student st : listHS) {
            if(p.test(st))  newlist.add(st);
        }
        return newlist;*/
        
        return (ArrayList<Student>)listHS.stream().filter(p).collect(Collectors.toList());
    }
    
    
    public void addNewStudent(Student hs){
        listHS.add(hs);
    }
    
    public Boolean checkInput(Student hs){
        if(!hs.getStudentID().matches("S000[0-9]+")) return false;
        if(!hs.getFirstName().matches("[a-zA-Z]+") && !hs.getLastName().matches("[a-zA-Z]+")) return false;
        //if(!hs.getDateofBirth()) return false;
        if(!(hs.getGender().equals("Male") || hs.getGender().equals("Female"))) return false;
        return true;
    }
    
    public void PrintAllListView(ArrayList<Student> li){
        for (Student st : li) {
            System.out.println(st);
        }
    }
}
