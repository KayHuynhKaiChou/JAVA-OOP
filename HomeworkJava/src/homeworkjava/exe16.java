/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkjava;

//16.Viết hàm biến đổi số thập phân thành chuỗi nhị phân 8 bít

import java.util.Scanner;

public class exe16 {

    /**
     * @param args the command line arguments
     */
    public static void convert(int dec){
        int r; int i=0; 
        int[] arr = new int[8];
        do{
            r = dec % 2;
            arr[i++] = r;
            dec /= 2;
        }while(dec != 0);
        
        for(int k = 7; k>=0; k--){
            System.out.print(arr[k]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec ;
        do{
            System.out.print("Enter a number decimal: ");
            dec = sc.nextInt();
        }while(dec < 0);
        System.out.print("Binary number: ");
        convert(dec);
    }
    
}
