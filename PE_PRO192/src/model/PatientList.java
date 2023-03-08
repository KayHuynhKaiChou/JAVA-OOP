/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author DELL
 */
public class PatientList {
    private ArrayList<Patient> dspa = new ArrayList<>();

    public PatientList() {
    }

    public ArrayList<Patient> getDspa() {
        return dspa;
    }

    public void setDspa(ArrayList<Patient> dspa) {
        this.dspa = dspa;
    }
    
    public void readFile(String fname){
        try(BufferedReader br = new BufferedReader(new FileReader(fname))) { 
            String line = "";
            while((line=br.readLine())!=null){
                String[] s = line.split(":");
                dspa.add(new Patient(s[0],s[1],s[2],s[3]));
                br.readLine();
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Patient> SearchByCriteria(Predicate<Patient> p){
        ArrayList<Patient> newlist = new ArrayList<>();
        for (Patient pa : dspa) {
            if(p.test(pa))  newlist.add(pa);
        }
        return newlist;
    }
     
    public void addPatient(Patient p){
        for (int i=0; i<dspa.size(); i++) {
            if(!p.getPhone().equals(dspa.get(i).getPhone())) dspa.add(p);
        }
    }
}
