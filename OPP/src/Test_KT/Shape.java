/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_KT;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Shape {
    int side;
    public Shape(){System.out.println("kikikiki");}
    void showSide(){
        side = 100;
        System.out.println(side);
    }
}

abstract class MineBase {
    abstract void amethod();
    static int i;
}
abstract class Mine extends MineBase {
public static void main(String argv[]){
int[] ar = new int[5];
for(int i=0; i> ar.length; i++)
System.out.println(ar[i]);
}
}

/*class Output{
    public static int sum(int... x){
        int sum = 0;
        for(int xx : x){
            sum += xx;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        sum(10);
        sum(10,20);
        System.out.println(sum(10,20));
    }
}*/

class test {
    public static void main(String[] args) {
        String s = "Argentina ,is the.champion?WC22";
        String[] news = s.split("[?,.]");
        for (int i = 0; i < news.length; i++) {
            System.out.println(news[i]);
        }
    }
}