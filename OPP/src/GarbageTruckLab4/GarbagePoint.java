/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarbageTruckLab4;

/**
 *
 * @author DELL
 */
public class GarbagePoint {
    private int garbageLoad;
    private String address;
    
    public GarbagePoint(){}

    public GarbagePoint(int garbageLoad, String address) {
        this.garbageLoad = garbageLoad;
        this.address = address;
    }

    public int getGarbageLoad() {
        return garbageLoad;
    }

    public void setGarbageLoad(int garbageLoad) {
        this.garbageLoad = garbageLoad;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "GarbagePoint{" + "garbageLoad=" + garbageLoad + ", address=" + address + '}';
    }
    
    
}
