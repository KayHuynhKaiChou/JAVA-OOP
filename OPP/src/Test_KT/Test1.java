/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_KT;

/**
 *
 * @author DELL
 */
public class Test1 {
    public static void main(String[] args) {
        // viết hoa các chữ cái đầu
        String s = "huynh gia khoi";
        String s1 = (s.charAt(0)+"").toUpperCase();
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i)==' ') s1 = s1 + s.charAt(i) + (s.charAt(++i)+"").toUpperCase();
            else s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);
    }
}
