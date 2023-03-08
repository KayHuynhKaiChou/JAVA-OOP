/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

/**
 *
 * @author DELL
 */
public class exe11 {
    public static double average(double arr[], int heso[]){
        double sum = 0; int hs = 0;
        if(arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0 && arr[i] <=10){
                hs += heso[i];
                sum += arr[i]*heso[i];
            }else{
                return -1;
            }
        }
        
        return sum/hs;
    }
    public static void main(String[] args) {
        double[] arr = {8.2 , 7.8 , 8.6 , 7.5, 8.1};
        int[] a = {1,2,1,1,2};
        System.out.println("This array includes: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        
        System.out.println("\nValue average of elements in array is: "+average(arr,a));
    }
}
