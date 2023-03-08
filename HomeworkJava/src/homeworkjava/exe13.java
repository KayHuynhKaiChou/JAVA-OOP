/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

/**
 *
 * @author DELL
 */
public class exe13 {
    static int countScore(double[] d){
        int c=0;
        for(double x:d){
            if(x>=5) c++;
        }
        return c;
    }
    static double[] check(double[] d){  //return an array
        // đếm số eles >= 5
        int n = countScore(d);
        
        // Khởi tạo mảng có num of eles >=5
        double[] kq = new double[n];
        // duyệt mảng điểm , lấy ele >=5 cho vào mảng kết quả
        int i; int j;
        for(i=0,j=0;i<d.length;i++){
            if(d[i]>=5) kq[j++] = d[i];
        }
        return kq;
    }
    public static void main(String[] args) {
        double[] arr = {2,6,3,7,9,8};
        check(arr);
    }
}
