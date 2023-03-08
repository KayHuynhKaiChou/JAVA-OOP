/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import Model.Student;
import Model.StudentList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class StudentManagement extends Menu<String>{
    Scanner sc = new Scanner(System.in);
    static String[] mc={"Add new student","Search student","Print all students","Quit"};
    private StudentList sl ;

    public StudentManagement(StudentList sl) {
        super("\n>>>Student Management System<<<",mc);
        sl.readFile("student.txt");
        this.sl = sl;
    }
    
    public void ViewAdd(){
        while(true){
            System.out.print("Enter StudentID: ");
            String id = sc.nextLine();
            System.out.print("Enter FirstName: ");
            String fn = sc.nextLine();
            System.out.print("Enter LastName: ");
            String ln = sc.nextLine();
            System.out.print("Enter Date of Birth: ");
            String date = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
            LocalDate localDate = LocalDate.parse(date, formatter);
            System.out.print("Enter Gender: ");
            String gen = sc.nextLine();
            Student hs = new Student(id,fn,ln,localDate,gen);
            if(sl.checkInput(hs)){ 
                sl.addNewStudent(hs); 
                break;
            }else System.out.println("Invalid Input , please input again!");
        }
    }
    /*
    class SearchView extends Menu<String>{
        static String[] mc={"Search by ID","Search by Last name","Search by DOB","Search by Gender"};

        public SearchView() {
            super("\n>>>Student Searching<<<",mc);
            
        }
        
        public void byID(){
            System.out.println("Enter Searched ID: "); String id = sc.nextLine();
            ArrayList listID = sl.SearchByCriteria((Student hs) -> hs.getStudentID().equals(id));
            System.out.println(listID);
        }
        
        public void byLastName(){ 
            System.out.println("Enter Searched LastName: "); String ln = sc.nextLine();
            ArrayList listLN = sl.SearchByCriteria((Student hs) -> hs.getLastName().equals(ln));
            System.out.println(listLN);
        }
        
        public void byDOB(){
            System.out.println("Enter Searched Date of Birth: "); String dob= sc.nextLine();
            ArrayList listDOB = sl.SearchByCriteria((Student hs) -> hs.getDateofBirth().equals(dob));
            System.out.println(listDOB);
        }
        
        public void byGender(){
            System.out.println("Enter Searched Gender: "); String gt = sc.nextLine();
            ArrayList listGT = sl.SearchByCriteria((Student hs) -> hs.getGender().equals(gt));
            System.out.println(listGT);
        }
        
        @Override
        public void execute(int n) {
            switch(n){
                case 1: byID(); break;
                case 2: byLastName(); break;
                case 3: byDOB(); break;
                case 4: byGender();break;
                
            }
        }
        
    }
    */
    public void doSearch(){
        String[] mc={"Search by ID","Search by Last name","Search by DOB","Search by Gender"};
        Menu smenu = new Menu<String>("\n>>>Student Searching<<<",mc) {
            @Override
            public void execute(int n) {
                switch(n){
                    case 1:
                        System.out.println("Enter Searched ID: "); String id = sc.nextLine();
                        sl.PrintAllListView(sl.SearchByCriteria((Student hs) -> hs.getStudentID().equals(id)));
                        break;
                    case 2:
                        System.out.println("Enter Searched LastName: "); String ln = sc.nextLine();
                        sl.PrintAllListView(sl.SearchByCriteria((Student hs) -> hs.getLastName().equals(ln)));
                        break;
                    case 3: break;
                    case 4: break;
                
                }
            }
        };
        smenu.run();
    }
    
    
    public static void main(String[] args) {
        StudentList st = new StudentList();
        new StudentManagement(st).run();
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1: ViewAdd(); break;
            case 2: doSearch(); break;
            case 3: sl.PrintAllListView(sl.getListHS()); break;
            case 4: System.exit(0);
        }
    }
    
    
}
