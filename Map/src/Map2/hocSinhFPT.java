/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map2;

/**
 *
 * @author DELL
 */
public class hocSinhFPT {
    private String name;
    private String mssv;
    private String sdt;
    
    public hocSinhFPT(){};

    public hocSinhFPT(String name, String mssv, String sdt) {
        this.name = name;
        this.mssv = mssv;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public void display(){
        System.out.printf("\n%-20s%-20s%-20s",name,mssv,sdt);

    }
}
