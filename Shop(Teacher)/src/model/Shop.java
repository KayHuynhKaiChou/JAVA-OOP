package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Shop {
    private ArrayList<Product> products;
    private ArrayList<Order> orders;
    private ArrayList<Customer> customers;

    public Shop() {
        products= new ArrayList<>();
        orders= new ArrayList<>();
        customers= new ArrayList<>();
        readData("Account.txt");
        //products.add(new Product("H001","Cake","pack",150,10));
        //products.add(new Product("H002","Candy","pack",100,15));
        //products.add(new VolumnProduct(2,"H003","Rice","pack",50,50));
        //products.add(new VolumnProduct(15,"H004","Suger","bag",15,100));
        //products.add(new Product("H005","Tooth paste","tupe",10,10));
    }
    public void addOrder(Order d){
        orders.add(d);
    }
    public void addCustomer(Customer c){
        customers.add(c);
    }
    public void readData(String fname){
        try {
          //(cấp cao)                    (cấp thấp)
            Scanner sc = new Scanner(new FileReader(fname));
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                //addProduct(s);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        //cách 2:
        try(BufferedReader br = new BufferedReader(new FileReader(fname))) { // nếu use try(Buffer...) thì file sẽ tự đóng nên ko cần br.close()
            //(cấp cao)                               (cấp thấp)
            //BufferedReader br = new BufferedReader(new FileReader(fname));
            String line = "";
            while((line=br.readLine())!=null){
                //addProduct(line);
            }
            //ko nên đặt lệnh br.close(); ở đây vì nếu có excep thì nó nhảy xuống catch luôn và ko close file đc
            // vì vậy đặt ở finally
        } catch (Exception ex) {
            Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    //===============================================//
    /*
    public void addProduct(String s){
        String[] p = s.split(":");
        switch(p[0].charAt(0)){
            case"P":
               products.add(new VolumnProduct()); 
        }
        products.add(new)
    }*/
    //===============================================//
    /*public void saveCustomer(String fname){
        try(PrintWriter pw = new PrintWriter(new FileWriter(fname)){
            
        }cat
    }
*/
    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
//------------------------------------------------------
    public ArrayList<Order> search(Predicate<Customer> p){
        ArrayList<Order> kq= new ArrayList<>();
        for(Order o:orders) 
            if(p.test(o.getCust())) kq.add(o);
        return kq;
    }
//------------------------------------------------------    
}
