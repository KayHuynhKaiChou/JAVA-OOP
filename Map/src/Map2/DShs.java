/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class DShs {
    public static void main(String[] args) {
        HashMap<String,hocSinhFPT> listHS = new HashMap<>();
        hocSinhFPT hs = new hocSinhFPT("Huynh Gia Khoi","QE170047","0935187859");
        listHS.put(hs.getMssv(),hs);
        hocSinhFPT hs1 = new hocSinhFPT("Nguyen Thai Son","QE170121","0336536308");
        listHS.put(hs1.getMssv(),hs1);
        hocSinhFPT hs2 = new hocSinhFPT("Tran Dinh Hung","QE170159","0914354468");
        listHS.put(hs2.getMssv(),hs2);
        
        //Duyệt các eles trong HashMap
        //System.out.printf("%-20s%-20s%-20s","FullName","MSSV","Telephone");
        
        //Cách 1
        listHS.forEach((mssv, stu) -> {
            System.out.println("\nMssv: "+mssv+", we have:"); stu.display();
        });
        
        System.out.println("--------------------------------------------");
        
        //Cách 2
        Set<String> se = listHS.keySet();
        se.forEach((keys) -> {
            System.out.print("\nMSSV: "+keys+" ,we have: "); listHS.get(keys).display(); System.out.println("");
        });
        
        
        
        
        //Tìm Kiếm thông tin SV based on MSSV vì MSSV mỗi hs là different.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's MSSV: ");
        String id = sc.nextLine();
        if(!listHS.get(id).getMssv().equals(id))
            System.out.println("MSSV not exist!");
        else{
            System.out.printf("%-20s%-20s%-20s","FullName","MSSV","Telephone");
            listHS.get(id).display();
        }
    }
        
    
}
