/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

//12.Viết hàm trả về các ước số của 1 số nguyên dương tùy ý – truyền qua đối số của hàm.  Gọi hàm này và in kết quả ra màn hình

import java.util.Scanner;

public class exe12 {
    public static void UocSo(int num){
        System.out.print("So U("+num+") = {");
        for(int i = 1; i<= num; i++ ){
            if(num%i==0){
                System.out.print(i+"; ");
            }
        }
        System.out.print("}");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter a positive integer: ");
            num = sc.nextInt();
            if(num <= 0) System.out.println("Negative integer is invalid, please enter again!");
        }while(num <= 0);
        
        UocSo(num);
    }
}
