/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrange;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class WaySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a1 = {1,8,3,2,0,6};
        int[] a2 = {2,4,5,3,1,0};
        int[] a3 = {8,2,4,6,1,0};
        int[] a4 = {5,2,1,3,6,4};
    
    //----Linear Search---------------//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ele need to search: ");
        int se = sc.nextInt();
        int ch = 0;
        for (int i = 0; i < a1.length; i++) {
            
            if(a1[i] == se){
                System.out.println("This ele exist in array");
                ch = 1;
            }
            
        }
        if(ch == 0) System.out.println("NOT exist in array");
    //----Binary Search----------------//
   
    int left, right, mid; left=0; right=a2.length-1;
    do{
        mid=(left+right)/2;
        if(a2[mid]==se){
            ch = 1;
            System.out.println("This ele exist in array");//found x in array
        }
        else if(a2[mid]<se){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }while(left<=right);
    if(ch == 0) System.out.println("NOT exist in array");//not found x in array

        
    //----Bubble Sort ---------------------//
    int tempt = 0;
    for(int i=0; i<a3.length - 1; i++){
        for(int j=0; j<a3.length - i - 1; j++){
            if(a3[j]>a3[j+1]){
                tempt = a1[j];
                a3[j] = a3[j+1];
                a3[j+1] = tempt;
            }
        }
    }
    for (int i = 0; i < a3.length; i++) {
        System.out.print(a3[i]+", ");
    }
        System.out.println("");
    //----Insertion Sort----------------------//
    int j, element;
    for (int i = 1; i < a4.length; i++) { 
            element = a4[i]; 
            j = i - 1; /* Move elements of arr[0..i-1], that are greater than key by one position */ 
            while (j >= 0 && a4[j] > element) { 
                a4[j + 1] = a4[j]; 
                j = j - 1; 
            } 
        a4[j + 1] = element; 
    }
    for (int i = 0; i < a4.length; i++) {
        System.out.print(a4[i]+", ");
    }
    
    }
    
}
