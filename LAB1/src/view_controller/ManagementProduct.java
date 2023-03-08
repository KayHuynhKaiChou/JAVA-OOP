/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_controller;

import Model.ListProduct;
import Model.Product;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ManagementProduct extends Menu<String>{
    static String[] menu = {"Create a product","Check exist product","Search Product's information by Name",
        "Update Product","Save Products to file","Print list Products from the file","Exit"};
    Scanner sc = new Scanner(System.in);
    private ListProduct lpro;

    public ManagementProduct() {
        super("----> Function Shop <----",menu);
        lpro = new ListProduct();
    }
    //////////////////////////////////////////////////////////////////////
    
    public void Note(){
        String s = "Note: ";
        s=s+"\n+ ID is not similar and it must be right format Pnn , with n is in [0-9] , ex: P01,P02,...";
        s=s+"\n+ Name must has length >= 5 and not empty";
        s=s+"\n+ Price is in [0,10000]";
        s=s+"\n+ Quantity is in [0,1000]";
        s=s+"\n+ Status is 'A' or 'N'";
        s=s+"\n============================------==============================";
        System.out.println(s);
    }
    public void createProduct(){
        Note();
        try {
            System.out.print("Enter ProductID: ");
            String id = sc.nextLine();
            System.out.print("Enter ProductName: ");
            String namae = sc.nextLine();
            System.out.print("Enter UnitPrice: ");
            Double price = Double.valueOf(sc.nextLine());
            System.out.print("Enter Quantity: ");
            int sl = Integer.parseInt(sc.nextLine());
            System.out.print("Choose Status: \n+ Choose button(a) : Available\n+ Choose button(b) : Not Available" +"\n--> Your Choice: ");
            String sta = sc.nextLine();
            Product sp = new Product(id, namae, sta, price, sl);
            if(lpro.checkInput(sp)) lpro.getListSP().add(sp);
            else System.out.println("Information Input are not suitable");
        } catch (Exception e) {
            
            System.err.println("Information format is wrong");
        }
//        System.out.println("Do you wanna continue (Y/N): ");
//        if(sc.nextLine().equalsIgnoreCase("Y")) this.createProduct();
    }
    /////////////////////////////////////////////////////////////////
    public void CheckExist(){
        System.out.print("Enter product ID need to check: ");
        String id = sc.nextLine();
        for(Product po : lpro.getListSP()){
            if(id.equals(po.getProductID())){
                System.out.println("Exist Product");
                return;
            }
        }
        System.out.println("No Product Found! ");
    }
    //////////////////////////////////////////////////////////////////////////////////
    public void SearchProductbyName(){
        System.out.print("Enter searched Product name: ");
        String name = sc.nextLine();
        if(lpro.getListSP() == null) System.out.println("Have no any Product");
        else
            for(Product po : lpro.searchFunction(name)) System.out.println(po);
    }
    
    /////////////////////////////////////////////////////////////////////////////////////
    class updateProduct extends Menu<String>{
        static String[] choices = {"Update Product Information","Delete Product Information"};
        
        public updateProduct(){
            super("",choices);
        }
        
        @Override
        public void execute(int n) {
            switch(n){
                case 1:
                    System.out.print("Enter ID: ");
                    lpro.updateFunction(sc.nextLine());
                    Decide(n); break;
                case 2:
                    System.out.print("Enter ID:");
                    lpro.deleteFunction(sc.nextLine());
                    Decide(n); break;
            }
        }
    }
 
    public void Decide(int n){
        while(true){
            System.out.print("Do you wanna continue or not (Y/N): ");
            String choice = sc.nextLine();
            if(!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")){
                System.err.println("Just enter Y/y or N/n , Please enter again!");
            }else if(choice.equalsIgnoreCase("Y")){
                this.execute(n); break;
            }else break;
        }
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1: this.createProduct(); 
                    this.Decide(n); break;
            case 2: this.CheckExist(); 
                    this.Decide(n); break;
            case 3: this.SearchProductbyName(); 
                    this.Decide(n); break;
            case 4: new updateProduct().run(); 
                    break;
            case 5: this.lpro.saveFile(); 
                    this.Decide(n); break;
            case 6: 
               // this.lpro.readFile();
                this.lpro.SortOrder();
                this.Decide(n); break;
            case 7: System.exit(0);
                
        }
    }
    
    public static void main(String[] args) {
        new ManagementProduct().run();
    }
}
