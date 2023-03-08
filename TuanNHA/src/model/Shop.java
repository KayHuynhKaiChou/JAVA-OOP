package model;

import java.util.ArrayList;
import java.util.Vector;
import java.util.function.Predicate;

public class Shop {
    private ArrayList<Product> products;
    private ArrayList<Order> orders;
    private ArrayList<Customer> customers;

    public Shop() {
        products= new ArrayList<>();
        orders= new ArrayList<>();
        customers= new ArrayList<>();
        products.add(new WeightProduct(300,"H001","Cake","pack",150,10));
        products.add(new WeightProduct(220,"H002","Candy","pack",100,15));
        products.add(new VolumnProduct(1000,"H003","Rice","pack",50,50));
        products.add(new VolumnProduct(150,"H004","Suger","bag",15,100));
        products.add(new WeightProduct(100,"H005","Tooth paste","tupe",10,10));
    }
    public void addOrder(Order d){
        orders.add(d);
    }
    public void addCustomer(Customer c){
        customers.add(c);
    }
    public void readData(){
        
    }
    public void saveData(){
        
    }

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
        public Vector<Vector> getData(){
        Vector<Vector> data = new Vector<Vector>();
        for(Product p: products){
            if(p instanceof VolumnProduct) data.add(p.toVector());
            else if(p instanceof WeightProduct) data.add(p.toVector());
        }
        return data;
    }
    
    public Product getProduct(String id){
        for (Product p : products) {
            if(p.getProID().equals(id)) return p;
        }
        return null;
    }
}
