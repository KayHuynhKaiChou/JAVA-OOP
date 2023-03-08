/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import IOTools.IOkeyboard;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
/**
 *
 * @author DELL
 */
public class ListAnimal implements File{
    private ArrayList<Animal> listDV = new ArrayList<>();

    public ListAnimal() {
    }

    public ArrayList<Animal> getListDV() {
        return listDV;
    }

    public void setListDV(ArrayList<Animal> listDV) {
        this.listDV = listDV;
    }
    
    
    public String constraints(Animal an){
        for (Animal dv : listDV) {
            if(dv.equals(an)){
                return "ID may be the same with available ID, Please enter again!";
            }
        }
        if(!an.getId().matches("A17[0-9][0-9][0-9]")) return "ID is wrong format (ex: A17008,...), Please enter again!";
        if(an.getWeight()>=200) return "Weight are more than 200 kg , Please input again!";
        return "All True";
    }
    
    public void DeleteAnimal(String id){
        for(Animal po : listDV){
            if(po.getId().equals(id) && IOkeyboard.confirm("Do you wanna delete this Animal", "Your input is not 'Y,N,y,n', Please enter again!")){
                listDV.remove(po);
                System.out.println("Success!");
                return;
            }
        }
        System.out.println("Failure!");
    }
    
    public void SearchByName(String name){
        ArrayList<Animal> listKQ = new ArrayList<>();
        for (Animal dv : listDV) {
            if(dv.getName().contains(name)){
                listKQ.add(dv);
            }
        }
        if(listKQ.isEmpty()) System.out.println("Not Found!");
        else this.ShowAll(listKQ);
    }
    
    public void SearchByWeight(Double upperb, Double lowerb){
        ArrayList<Animal> listKQ = new ArrayList<>();
        for (Animal dv : listDV) {
            if(dv.getWeight()>=upperb && dv.getWeight()<=lowerb){
                listKQ.add(dv);
            }
        }
        if(listKQ.isEmpty()) System.out.println("Not Found!");
        else this.ShowAll(listKQ);
    }
    
    public void ShowAll(ArrayList<Animal> dsdv){
        for (Animal ani : dsdv) {
            System.out.println(ani.Display());
        }
    }
    
    public void ShowByType(String type){
        ArrayList<Animal> listKQ = new ArrayList<>();
        for (Animal dv : listDV) {
            if(dv.getType().equals(type)){
                listKQ.add(dv);
            }
        }
        this.ShowAll(listKQ);
    }

    @Override
    public void write() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("animals.txt"))){
            for (Animal a : listDV) {
                bw.write(a.toString());
                bw.newLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try(BufferedReader br = new BufferedReader(new FileReader("animals.txt"))){
            String line = "";
            while(true){
                line = br.readLine();
                if(line==null) break;
                String[] s = line.split("_");
                listDV.add(new Animal(s[0],s[1],Double.parseDouble(s[2]),s[3],s[4].split(","),s[5],Integer.parseInt(s[6])));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
