/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        this.readData("shop.txt");
            //shop.add(new VolumnProduct("P1","CocaCola","120322","030922",10000,40,350));
            //shop.add(new VolumnProduct("P2","Pepsi","120322","030922",12000,70,450));
            //shop.add(new VolumnProduct("P3","7up","030322","150922",10000,30,350));
            //shop.add(new WeightProduct("P4","Tony Cake","290322","031222",25000,80,100));
            //shop.add(new WeightProduct("P5","Oreo","120322","030922",20000,20,100));
        
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
    
    class checkDate implements DateValidator{
        private String dateFormat;

        public checkDate(String dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public Boolean isValid(String dateStr) {
            DateFormat sdf = new SimpleDateFormat(this.dateFormat);
            sdf.setLenient(false);
            try {
                sdf.parse(dateStr);
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
        
    }
    
    public boolean checkInput(Product p, ArrayList<Product> ch){
        for (Product pr : ch) {
            if(pr.getId().equals(p.getId()))return false;
        }
        if(!p.getId().matches("P[0-9]{1,}")) return false;
        if(!p.getProductName().matches("[a-zA-Z0-9 ]+")) return false;
        checkDate cd = new checkDate("dd.MM.yy");
        if(!cd.isValid(p.getNSX()) || !cd.isValid(p.getHSD())) return false;
        if(p.getPrice()<1000 && p.getPrice()%1000!=0) return false;
        if(p.getQuantity()<1 ) return false;
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
    public void readData(String fName){
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
        } catch (Exception ex) {
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
            ex.printStackTrace();
        }
    }
    
    
}
