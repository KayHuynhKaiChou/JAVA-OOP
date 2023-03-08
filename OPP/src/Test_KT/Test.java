/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_KT;

/**
 *
 * @author DELL
 */
class A {
    public static void method(String str){
        System.out.println("Method 1");
    }
    
    public static int method(int i){
        System.out.println("Method 2");
        return 0;
    }
    
}

class Base{
    public Base(){
        System.out.println("Base");
    }
}
public class Test extends Base{
    
    
    public Test(String s){  // luôn có super(); ngầm
        //this();
        System.out.println(s);
    }
    
     public Test(){ // luôn có super(); ngầm
        this("kay");
        System.out.println("bi");
    }
    public static void main(String[] args) {
        //A.method(5);  // Method 2
        new Test();  // chỉ in ra 1 super() ngầm
        
    }
}
