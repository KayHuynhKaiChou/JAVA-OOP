/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_KT;

/**
 *
 * @author DELL
 */
public class Test2 extends Test3{
    int sp = 50;
    //public Test2(){}
    private void mesi(){}

    @Override
    default void mm() {
    }
    
    public void divide(int a, int b) {
 try { int c = a / b; System.out.print(c); }
 catch (Exception e) { System.out.print("Exception "); }
 finally { System.out.println("Finally"); }
}
    void printt(){
        System.out.println("50");
    }
    
    public static void main(String[] args) {
        int a[] = new int[5];
        Test2 te = new Test2();
        te.divide(1, 4);
        te.mm();
    }
    protected class lalaa{
        
    }
}

