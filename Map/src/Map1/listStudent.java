/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class listStudent {
    ArrayList<student> dssv ;
    
    public listStudent(){
        this.dssv = new ArrayList<>();
    }
    
    public void addHS(student st){
        dssv.add(st);
    }
    
    public void showAllInform(){
        System.out.println("========Student Information Block A0 in Quy Nhon city========");
        for (student hs : dssv) {
            hs.showEachInform();
        }
    }
    
    public HashMap<String,Double> getPercent(){
        HashMap<String,Double> hm = new HashMap<>();
        int countA = 0; int countB = 0; int countC = 0; int countD = 0;
        for (student hs : dssv) {
            if(hs.averageScore(hs)>7.5){
                countA ++;
            }else if(hs.averageScore(hs)>=6){
                countB ++;
            }else if(hs.averageScore(hs)>=4){
                countC ++;
            }else{
                countD ++;
            }
        }
        int totalHS = dssv.size();
        hm.put("A", 100.0*(1.0*countA/totalHS));
        hm.put("B", 100.0*(1.0*countB/totalHS));
        hm.put("C", 100.0*(1.0*countC/totalHS));
        hm.put("D", 100.0*(1.0*countD/totalHS));
        return hm;
    }
}
