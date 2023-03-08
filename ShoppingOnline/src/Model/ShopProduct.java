/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.WeightProduct;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ShopProduct{
    private ArrayList<Product> shop ;
    
    public ShopProduct() {
        shop = new ArrayList<>();
        try {
            this.readData("shop.txt");
            //shop.add(new VolumnProduct("P1","CocaCola","120322","030922",10000,40,350));
            //shop.add(new VolumnProduct("P2","Pepsi","120322","030922",12000,70,450));
            //shop.add(new VolumnProduct("P3","7up","030322","150922",10000,30,350));
            //shop.add(new WeightProduct("P4","Tony Cake","290322","031222",25000,80,100));
            //shop.add(new WeightProduct("P5","Oreo","120322","030922",20000,20,100));
        } catch (IOException ex) {
            Logger.getLogger(ShopProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    public ShopProduct(ArrayList<Product> shop) {
        this.shop = shop;
    }
    
    public ShopProduct(ShopProduct sp) {
        this(sp.getShop());
    }
    
    public ArrayList<Product> getShop() {
        return shop;
    }
   
    public void addSP(Product p){
          shop.add(p);        
    }
    
    public boolean check(Product p){
        if(p.getId().matches("[0-9A-Z]+")) return true;
        if(p.getProductName().matches("[a-zA-Z ]+")) return true;
       //if(p.getNSX().matches("[0-9]+/["))
       return true;
    }
    
    public Product searchSP(String id ,ArrayList<Product> shp){
        
        for (Product sp : shp) {
            if(id.equals(sp.getId())){
                return sp;
            }
        }
        return null;
       // System.out.println("Not Exist product in shop!");
    }
    
    //=====================//
    public void readData(String fName) throws IOException{
        try {
            FileReader fr = new FileReader(fName);
            BufferedReader br = new BufferedReader(fr);
            String line ="";
            while(true){             
                line = br.readLine();
                if(line == null) break;
                else if(line.indexOf("ml") > 0){
                    VolumnProduct vp = new VolumnProduct();
                    vp.parseV(line);
                    shop.add(vp);
                }else{
                    WeightProduct wp = new WeightProduct();
                    wp.parseW(line);
                    shop.add(wp);
                }
            }
            br.close(); fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ShopProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //=====================//
    public void saveData(String fname){
        try {
            FileWriter fw = new FileWriter(fname);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product sp : shop) {
                if(sp instanceof VolumnProduct)                   
                    bw.write(((VolumnProduct) sp).getLine());
                else
                    bw.write(((WeightProduct) sp).getLine());
                bw.newLine();
            }
            bw.close();fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ShopProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Vector<Vector> getData(){
        Vector<Vector> data = new Vector<Vector>();
        for(Product p: shop) data.add(p.toVector());
        return data;
    }
    
    public Product getProduct(String id){
        for (Product p : shop) {
            if(p.getId().equals(id)) return p;
        }
        return null;
    }
}
