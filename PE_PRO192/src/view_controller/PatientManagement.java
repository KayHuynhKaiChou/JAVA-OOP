/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Patient;
import model.PatientList;

/**
 *
 * @author DELL
 */
public class PatientManagement extends Menu<Patient>{
    Scanner sc = new Scanner(System.in);
    static String[] mc={"Display all patient","Search Patient","Add patient","Update Phone number","Search Information from list","Exit"};
    private PatientList pl ;

    public PatientManagement(PatientList pl) {
        super("\n>>>Patient Management<<<",mc);
        pl.readFile("patient.txt");
        this.pl = pl;
    }
    
    public void ViewAdd(){
        while(true){
            try {
                System.out.print("Enter Patient ID: ");
                String id = sc.nextLine();
                System.out.print("Enter Patient Name: ");
                String na = sc.nextLine();
                System.out.print("Enter Address: ");
                String dc = sc.nextLine();
                System.out.print("Enter Phone Number: ");
                String dt = sc.nextLine();
                Patient pa = new Patient(id,na,dc,dt);                
                pl.addPatient(pa);
                break;
            } catch (Exception e) {
               System.out.println("Invalid Input, please input again!");
            }
           
        }
    }
    
    public void changePhone(){
        System.out.print("Enter Old Phone Number: ");
        String oldPhone = sc.nextLine();
        for (Patient pa : pl.getDspa()) {
            if(pa.getPhone().equals(pl.getDspa())){
                System.out.print("\nOld Phone Number is valid\nEnter New Phone Number: ");
                String newPhone = sc.nextLine();
                pa.UpdatePhone(newPhone);
            }
        }
    }
    
    public void PrintAllListView(ArrayList<Patient> pl){
        for (Patient p : pl) {
            System.out.println(p);
        }
    }
    
    public void doSearch(){
        String[] mc={"Search by patient ID","Search by patient name","Search by Address","Search by Phone-No"};
        Menu smenu = new Menu<String>("\n>>>Search Patient Option<<<",mc) {
            @Override
            public void execute(int n) {
                switch(n){
                    case 1:
                        System.out.println("Enter Searched ID: "); String id = sc.nextLine();
                        PrintAllListView(pl.SearchByCriteria((Patient pa) -> pa.getPatientID().equals(id)));
                        break;
                    case 2:
                        System.out.println("Enter Searched Name: "); String na = sc.nextLine();
                        PrintAllListView(pl.SearchByCriteria((Patient pa) -> pa.getFullname().equals(na)));
                        break;
                    case 3: 
                        System.out.println("Enter Searched Address: "); String dc = sc.nextLine();
                        PrintAllListView(pl.SearchByCriteria((Patient pa) -> pa.getAddress().equals(dc)));
                        break;
                    case 4: 
                        System.out.println("Enter Searched Address: "); String pho = sc.nextLine();
                        PrintAllListView(pl.SearchByCriteria((Patient pa) -> pa.getPhone().equals(pho)));
                        break;
                
                }
            }
        };
        smenu.run();
    }
    
    public void SearchInform(){
        int i=0;
        String[] listName = new String[pl.getDspa().size()];
        for (Patient p : pl.getDspa()) {
            listName[i++] = p.getFullname();
        }
        Menu smenu = new Menu<String>("\n>>>List Patient<<<",listName) {
            @Override
            public void execute(int n) {
                System.out.println(pl.getDspa().get(n-1));
                
            }
        };
        smenu.run();
    }
    
    public static void main(String[] args) {
        PatientList pl = new PatientList();
        new PatientManagement(pl).run();
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1: PrintAllListView(pl.getDspa()); break;
            case 2: doSearch(); break;
            case 3: ViewAdd(); break;
            case 4: changePhone(); break;
            case 5: SearchInform(); break;
            case 6: System.exit(0);
        }
    }
}
