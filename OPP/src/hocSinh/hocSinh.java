/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hocSinh;

import Test_KT.Test3;

/**
 *
 * @author DELL
 */
public class hocSinh extends Test3{

    private String name;
    private int age;

    public hocSinh(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "hocSinh{" + "name=" + name + ", age=" + age + '}';
    }
    
    

    public void setAge(int age) {
        this.age = age;
    }
    
    static void update(int newAge){
        newAge += 1;
    }
    
    static void update1(hocSinh hcs){
        hcs.age += 1;
    }
    
    static void update2(hocSinh hcs, int newAge){
        hocSinh newHS = new hocSinh(hcs.name, newAge);
        hcs = newHS; // gán địa chỉ của newHS cho hcs
        //Nếu muốn print ra 20 age thì phải gõ : //System.out.println(hcs);
    }
    public static void main(String[] args) {
        hocSinh hs = new hocSinh("Sơn", 19);
        //update(hs.age); System.out.println(hs);  // 19
        //update2(hs,20); System.out.println(hs);  // 19
        //update1(hs); System.out.println(hs); // 20
        //hs.setAge(20); System.out.println(hs); // 20
        hs.mm();
    }
    
    
}
