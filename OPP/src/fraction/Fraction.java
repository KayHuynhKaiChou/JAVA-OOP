/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Predicate;

/**
 *
 * @author DELL
 */
public class Fraction implements Comparable<Fraction>{
   int tuSo, mauSo;

//=============Constructor===============//
    Fraction(int t, int m){
        tuSo=t; mauSo=m;
    }
//=============Copy constructor==========//
    Fraction(Fraction p){
        this(p.tuSo,p.mauSo);
    }
    
    Fraction(int m){
        this(m,1); // same new Fraction1(m,1);
    }
//=============Default constructor=======//
    Fraction(){
        this(0,1);
    }
        
//==============================Mutiply====================================//    
    Fraction mutiply(Fraction ps){ // return a Fraction1
        //cách 1:
        /*
        Fraction1 kq = new Fraction1(0, 1);
        kq.tuSo = this.tuSo* ps.tuSo;
        kq.mauSo = this.mauSo* ps.mauSo;
        return kq;*/
        
        //cách 2:
        return new Fraction(this.tuSo* ps.tuSo, this.mauSo* ps.mauSo);
        
    }
    
    static Fraction mutiply(Fraction p, Fraction q){
        /*
        Fraction1 kq = new Fraction1(0, 1);
        kq.tuSo = p.tuSo* q.tuSo;
        kq.mauSo = p.mauSo* q.mauSo;
        return kq;*/
        return p.mutiply(q);
    }
//==========================Add=========================================    
    Fraction add(Fraction ps){
        int ts = this.tuSo*ps.mauSo + this.mauSo*ps.tuSo;
        int ms = this.mauSo*ps.mauSo;
        return new Fraction(ts, ms);
    }
    
    static Fraction add(Fraction ps1 , Fraction ps2){
        return ps1.add(ps2);
    }
//==========================Subtract====================================
    Fraction subtract (Fraction ps){
        int ts = this.tuSo*ps.mauSo - this.mauSo*ps.tuSo;
        int ms = this.mauSo*ps.mauSo;
        return new Fraction(ts, ms);
    }
    
    static Fraction subtract(Fraction ps1 , Fraction ps2){
        return ps1.subtract(ps2);
    }
//===========================Reverse======================================
    Fraction reverse(){
        int t = tuSo; tuSo = mauSo; mauSo = t;
        return this;
    }
//===========================Divide========================================
    Fraction divide(Fraction ps){
        int ts = this.tuSo*ps.mauSo;
        int ms = this.mauSo*ps.tuSo;
        return new Fraction(ts, ms);
        
        //cách 2:
        // return this.mutiply(ps.reverse());
    }
    
    static Fraction divide(Fraction ps1, Fraction ps2){
        return ps1.divide(ps2);
    }
//===========================Rút Gọn Fraction1 ================================    
    int UCLN(Fraction p){
        int ts = Math.abs(p.tuSo); 
        int ms = Math.abs(p.mauSo);
    
        while(ts!=ms){
            if(ts > ms){
                ts -= ms;
            }else{
                ms -= ts;
            }
        }
        return ts;
    }
    
    Fraction rutGon(){
        int gt = UCLN(this);
        this.tuSo = this.tuSo / gt;
        this.mauSo = this.mauSo / gt;
        return this;
    }
    
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
    
    static Fraction[] generate(int n){
         Random ra = new Random();
         Fraction[] p = new Fraction[n];
         for(int i=0; i<n;i++){
             p[i] = new Fraction(ra.nextInt(10)+1,ra.nextInt(10)+1);
         }
         return p;
    }   
    
    
    static Fraction add(Fraction[] p){
            Fraction sum = new Fraction(0,1);
            for(Fraction f:p) sum = sum.add(f);
            return sum;
        }
    
    static Fraction subtract(Fraction[] p){
        Fraction dif = new Fraction(p[0]);
        for (int i = 1; i<p.length; i++) {
            dif = dif.subtract(p[i]);
        }
        return dif;
    }
    
    static Fraction mutiply(Fraction[] p){
        Fraction tich = new Fraction(1, 1);
        for (Fraction f : p) {
            tich = tich.mutiply(f);
        }
        return tich;
    }
    
    static Fraction divide(Fraction[] p){
        Fraction thuog = new Fraction(p[0]);
        for (int i = 1; i<p.length; i++) {
            thuog = thuog.divide(p[i]);
        }
        return thuog;
    }
    
//
     double valueOf(){
        return 1.0*this.tuSo/this.mauSo;
     }
     
     
     @Override
    public int compareTo(Fraction f) {
        if(this.valueOf()>f.valueOf()) return 1;
        else if(this.valueOf()< f.valueOf()) return -1;
        return 0;
    }
    
    public static ArrayList<Fraction> search(Fraction[] fr){
        ArrayList<Fraction> arr = new ArrayList<>();
        for (Fraction frac : fr) {
            if(frac.tuSo>5)
                arr.add(frac);
        }
        return arr;
    }
    
    public static ArrayList<Fraction> search(Fraction[] fr, Predicate<Fraction> pr){
        ArrayList<Fraction> arr = new ArrayList<>();
        for (Fraction frac : fr) {
            if(pr.test(frac)) arr.add(frac);
        }
        return arr;
    }
    
    public static ArrayList<Fraction> searchSort(Fraction[] ps,Predicate<Fraction> p, Comparator c){
        ArrayList<Fraction> arr = new ArrayList<>();
        for (Fraction frac : ps) {
            if(p.test(frac)) arr.add(frac);
        }
        Collections.sort(arr, c);
        return arr;
    }
    
    public static void main(String[] args) {
        Fraction[] fractions = generate(10);
        System.out.println("Array fraction includes: ");
        System.out.println(Arrays.toString(fractions));
        
        System.out.println("Sum = "+add(fractions).rutGon());
        System.out.println("Difference = "+subtract(fractions).rutGon());
        System.out.println("Product = "+mutiply(fractions).rutGon());
        System.out.println("Quotient = "+divide(fractions).rutGon());
        
        Arrays.sort(fractions);
        /* Nếu ko dùng Comparable hay not implements Comparable, ta có:
        Arrays.sort(fractions, (Fraction f1, Fraction f2)-> {if(f1.valueOf()>f2.valueOf()) return 1; else if(f1.valueOf()<f2.valueOf()) return -1 else return 0;};);
        */
        System.out.println("Array ascending: ");
        for (Fraction frac : fractions) {
            System.out.print(frac+", ");
        }
        
        
        System.out.println("\nFractions which has tuSo are greater than 5: ");
        //Cách 1:
        ArrayList arrF = search(fractions);
        System.out.println(arrF);
        
        //Cách 2:
        ArrayList arrF1 = search(fractions, t->t.tuSo>5);
        System.out.println(arrF1);
        
        //vừa Search combine Sort. Example : Search fraction has tuSo >5 ,afterward sort them
        ArrayList arrF2; 
        arrF2 = searchSort(fractions, k->k.tuSo>5, new Comparator<Fraction>(){
            @Override
            public int compare(Fraction o1, Fraction o2) {
                if(o1.valueOf()>o2.valueOf()) return -1;
                else if(o1.valueOf()< o2.valueOf()) return 1;
                return 0;
            }
        });  //(chưa ổn)
        System.out.println(arrF2);
    }

     
}
