/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ListProduct {
    private ArrayList<Product> listSP;
    Scanner sc = new Scanner(System.in);
            
    public ListProduct() {
        listSP = new ArrayList<>();
        this.readFile();
    }

    public ListProduct(ArrayList<Product> listSP) {
        this.listSP = listSP;
    }

    public ArrayList<Product> getListSP() {
        return listSP;
    }
    
    public ArrayList<Product> searchFunction(String name){
        ArrayList<Product> newlist = new ArrayList<>();
        for(Product po : listSP){
            if(po.getProductName().contains(name)) newlist.add(po);              
        }
        this.SortByName(newlist);
        return newlist;
    }
    
    public void SortByName(ArrayList<Product> ds){
        Collections.sort(ds, new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductName().compareTo(o2.getProductName());
            }
            
        });
    }
    
    public boolean checkInput(Product po){
        for (Product p : listSP) {
            if(p.equals(po)) return false;
        }
        if(!po.getProductID().matches("P[0-9][0-9]")) return false;
        if(po.getProductName().length()<5 && po.getProductName().isBlank()) return false;
        if(po.getUnitPrice()<=0 || po.getUnitPrice()>=10000) return false;
        if(po.getQuantity()<=0 || po.getQuantity()>=1000) return false;
        if(po.getStatus().equalsIgnoreCase("a"))
            po.setStatus("Available");
        else if(po.getStatus().equalsIgnoreCase("n"))
            po.setStatus("Not Available");
        else return false;
        return true;
    }
    
    public void updateFunction(String id){
        try {
            for(Product po : listSP){
                if(po.getProductID().equals(id)){
                    System.out.print("Enter new name product: ");
                    String name = sc.nextLine();
                    if(!name.isBlank() ) po.setProductName(name);

                    System.out.print("Enter new Price: ");
                    String price = sc.nextLine();
                    if(!price.isBlank()) po.setUnitPrice(Double.valueOf(price));

                    System.out.print("Enter new Quantity: ");
                    String sl = sc.nextLine();
                    if(!sl.isBlank()) po.setUnitPrice(Integer.parseInt(sl));

                    System.out.print("Choose new Status:\n+ Available (button 'a')\n+ Not Available (button 'n') ");
                    String status = sc.nextLine();
                    if(!status.isBlank()) po.setStatus(status);
                    else po.setStatus(po.getStatus().charAt(0)+"");
                    
                    
                    
                    if(this.checkInput(po)) System.out.println("Success !");
                    else System.err.print("Failure !");

                    return;
                }
            }
            System.out.println("Product does not exist");
        } catch (Exception e) {
            System.err.println("Error input Information");
        }
    }
    
    public void deleteFunction(String id){
        for(Product po : listSP){
            if(po.getProductID().equals(id)){
                listSP.remove(po);
                System.out.println("Success");
                return;
            }
        }
        System.out.println("Failure");
    }
    
    public void saveFile(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Product.dat"))) {
            for(Product sp : listSP){
                bw.write(sp.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void readFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("Product.dat"))) {
            String line = "";
            while(true){
                line=br.readLine();
                if(line==null) break;
                String[] s = line.split("-");
                listSP.add(new Product(s[0], s[1], s[2], Double.valueOf(s[3]), Integer.parseInt(s[4])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void SortOrder(){
        Collections.sort(listSP, new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getQuantity()==o2.getQuantity()){
                    return o1.getUnitPrice()>o2.getUnitPrice() ? 1:-1;
                }
                return o2.getQuantity()-o1.getQuantity();
            }            
        });
        for (Product product : listSP) {
            System.out.println(product);
        }
    }
    
    public void SortByID(){
        Collections.sort(listSP, new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductID().compareTo(o2.getProductID());
            }            
        });
        for (Product product : listSP) {
            System.out.println(product);
        }
    }
}
