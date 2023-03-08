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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DatabaseAccount {
    private ArrayList<Account> TotalAc;

    public DatabaseAccount() {
        TotalAc = new ArrayList<Account>();
        this.readAccount("Account.txt");       
    }

    public ArrayList<Account> getTotalAc() {
        return TotalAc;
    }

    public void setTotalAc(ArrayList<Account> TotalAc) {
        this.TotalAc = TotalAc;
    }
    
    public void saveAccount(String fname){
        try {
            FileWriter fw = new FileWriter(fname);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Account tk : TotalAc) {
                bw.write(tk.toString());
                bw.newLine();
            }
            bw.close();fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ShopProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readAccount(String fName) {
        try {
            FileReader fr = new FileReader(fName);
            BufferedReader br = new BufferedReader(fr);
            String line ="";
            while(true){             
                line = br.readLine();
                if(line == null) break;
                Account tk = new Account();
                tk.parseObject(line);
                TotalAc.add(tk);    
            }
            br.close(); fr.close();
        } catch (Exception ex) {
            Logger.getLogger(ShopProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
