/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class GakuseiFPT {
    private String Mssv,fullname,email,sdt,sex,address;
    private byte[] image;

    public GakuseiFPT() {
    }

    public GakuseiFPT(String Mssv, String fullname, String email, String sdt, String sex, String dc) {
        this.Mssv = Mssv;
        this.fullname = fullname;
        this.email = email;
        this.sdt = sdt;
        this.sex = sex;
        this.address = dc;
    }
    
    
    
    public String getMssv() {
        return Mssv;
    }

    public void setMssv(String Mssv) {
        this.Mssv = Mssv;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
    public String getLine(){
        return Mssv+","+fullname+","+email+","+sdt+","+sex+","+address;
    }
    
    public void parse(String s){
        String[] arr = s.split(",");
        Mssv = arr[0];
        fullname = arr[1];
        email = arr[2];
        sdt = arr[3];
        sex = arr[4];
        address = arr[5];
    }
}
