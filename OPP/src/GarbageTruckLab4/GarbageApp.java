/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarbageTruckLab4;

/**
 *
 * @author DELL
 */
public class GarbageApp {
    public static void main(String[] args) {
        int[] gw = {1765,2808,952,4206,3102,3902,1292,3985,8324,1928,4426,397,3277};
        GarbagePoint[] gps = new GarbagePoint[gw.length];
        for(int i=0; i<gw.length;i++){
            gps[i] = new GarbagePoint(gw[i], "Point"+i);
        }
        GarbageTruck gt = new GarbageTruck(gps);
        gt.goNext(); 
        System.out.println(gt.getTotalFee());
        
        
    }
}
