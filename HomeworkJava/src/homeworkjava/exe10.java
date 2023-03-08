/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

/**
 *
 * @author DELL
 */
public class exe10 {
    public static double average(double arr[]){
        double sum = 0;
        if(arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0 && arr[i] <=10){
                sum += arr[i];
            }else{
                return -1;
            }
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        double[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println("This array includes: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        
        System.out.println("\nValue average of elements in array is: "+average(arr));
    }
}
