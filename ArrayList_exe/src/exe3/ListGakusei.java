/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ListGakusei {
    ArrayList<Gakusei> dshs;
    Scanner sc = new Scanner(System.in);
    public ListGakusei(){
        dshs = new ArrayList<>();
    }

    public ListGakusei(ArrayList<Gakusei> dshs) {
        this.dshs = dshs;
    }
    
    public void addHS(){
        Gakusei hs = new Gakusei(); hs.inputInform();
        dshs.add(hs);
    }
    
    public void editHS(){
        System.out.print("Enter id Gakusei need to edit:");
        String id = sc.nextLine();
        int i = -1;
        for (Gakusei hs : dshs) {
            i++;
            if(hs.getId().equals(id)){
                System.out.println(hs);
                System.out.println("--->>>>Enter inform again! ");
                hs.inputInform(); dshs.set(i, hs);
                break;
            }
        }
    }
    
    public void deleteHS(){
        System.out.print("Enter id Gakusei need to edit:");
        String id = sc.nextLine();
        for (Gakusei hs : dshs) {
            if(hs.getId().equals(id)){
                dshs.remove(hs);
                break;
            }
        }
    }
    
    public void sortGPA(){
        Collections.sort(dshs, new Comparator<Gakusei>(){
            @Override
            public int compare(Gakusei o1, Gakusei o2) {
                if(o1.getGPA()>o2.getGPA()) return 1;
                else if(o1.getGPA()<o2.getGPA()) return -1;
                else return 0;
            }
        });
    }
    
    public void sortName(){
        Collections.sort(dshs,new Comparator<Gakusei>(){
            @Override
            public int compare(Gakusei o1, Gakusei o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        });
    }
    
    public void showAllHS(){
        Iterator<Gakusei> ite = dshs.iterator();
        while(ite.hasNext()){
            Gakusei hs = ite.next();
            System.out.println(hs);
        }
    }
    
    public void saveFile(){
        try {
            FileWriter fw = new FileWriter("student.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Gakusei hs : dshs) {
                bw.write(hs.getLineFile());
                bw.newLine();
                
            }
            bw.close(); fw.close(); // nếu fw đc close trước bw sẽ bị lỗi
        } catch (IOException ex) {
            Logger.getLogger(ListGakusei.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readFile() throws IOException{
        try {
            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);
            String Line = "";
            while(true){
                Line = br.readLine();
                if(Line == null) break;
                Gakusei ga = new Gakusei();
                ga.parse(Line);
                dshs.add(ga);
                
                System.out.println(Line);
            }
            fr.close(); br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListGakusei.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
