/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

import java.util.Scanner;

/*14.Viết hàm nhận đối số là một điểm số từ 0 đến 10, chuyển đổi điểm số này thành điểm chữ 
theo qui tắc điểm A: 8,5-10, B: 7-8.4, C:5.5 – 6.9, D: 4-5.4 F: 0-3.9*/

public class exe14 {
    static char convert(double score){
        if(score >= 8.5 && score <=10){
            return 'A';
        }else if(score >= 7 && score <=8.4){
            return 'B';
        }else if(score >= 5.5 && score <=6.9){
            return 'C';
        }else if(score >= 4 && score <=5.4){
            return 'D';
        }else if(score <0 || score >10){
            return '\0';
        }
        return 'F';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score;
        do{
            System.out.print("Enter a score: ");
            score = sc.nextDouble();
        }while(score < 0 && score >10);
        char result = convert(score);
        
        System.out.println("\nYour score is: "+convert(score));
    }
}
