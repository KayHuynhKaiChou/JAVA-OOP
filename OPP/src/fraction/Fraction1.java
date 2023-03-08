/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class Fraction1 /*implements Comparable<Fraction>*/{     
    protected int tuSo, mauSo;

//=============Constructor===============//
    Fraction1(int t, int m){
        tuSo=t; mauSo=m;
    }
//=============Copy constructor==========//
    Fraction1(Fraction1 p){
        this(p.tuSo,p.mauSo);
    }
    
    Fraction1(int m){
        this(m,1); // same new Fraction1(m,1);
    }
//=============Default constructor=======//
    Fraction1(){
        this(0,1);
    }
        
//==============================Mutiply====================================//    
    Fraction1 mutiply(Fraction1 ps){ // return a Fraction1
        //cách 1:
        /*
        Fraction1 kq = new Fraction1(0, 1);
        kq.tuSo = this.tuSo* ps.tuSo;
        kq.mauSo = this.mauSo* ps.mauSo;
        return kq;*/
        
        //cách 2:
        return new Fraction1(this.tuSo* ps.tuSo, this.mauSo* ps.mauSo);
        
    }
    
    static Fraction1 mutiply(Fraction1 p, Fraction1 q){
        /*
        Fraction1 kq = new Fraction1(0, 1);
        kq.tuSo = p.tuSo* q.tuSo;
        kq.mauSo = p.mauSo* q.mauSo;
        return kq;*/
        return p.mutiply(q);
    }
//==========================Add=========================================    
    Fraction1 add(Fraction1 ps){
        int ts = this.tuSo*ps.mauSo + this.mauSo*ps.tuSo;
        int ms = this.mauSo*ps.mauSo;
        return new Fraction1(ts, ms);
    }
    
    static Fraction1 add(Fraction1 ps1 , Fraction1 ps2){
        return ps1.add(ps2);
    }
//==========================Subtract====================================
    Fraction1 subtract (Fraction1 ps){
        int ts = this.tuSo*ps.mauSo - this.mauSo*ps.tuSo;
        int ms = this.mauSo*ps.mauSo;
        return new Fraction1(ts, ms);
    }
    
    static Fraction1 subtract(Fraction1 ps1 , Fraction1 ps2){
        return ps1.subtract(ps2);
    }
//===========================Reverse======================================
    Fraction1 reverse(){
        int t = tuSo; tuSo = mauSo; mauSo = t;
        return this;
    }
//===========================Divide========================================
    Fraction1 divide(Fraction1 ps){
        int ts = this.tuSo*ps.mauSo;
        int ms = this.mauSo*ps.tuSo;
        return new Fraction1(ts, ms);
        
        //cách 2:
        // return this.
    }
    
    static Fraction1 divide(Fraction1 ps1, Fraction1 ps2){
        return ps1.divide(ps2);
    }
//===========================Rút Gọn Fraction1 ================================    
    int UCLN(Fraction1 p){
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
    
    Fraction1 rutGon(){
        int gt = UCLN(this);
        this.tuSo = this.tuSo / gt;
        this.mauSo = this.mauSo / gt;
        return this;
    }
    
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
    
     Fraction1[] generate(int n){
         Fraction1[] p = new Fraction1[n];
         for(int i=0; i<n;i++){
             p[i] = new Fraction1();
         }
         return p;
    }   
    
    /*
        Fraction1 add(Fraction1[] p){
            Fraction1 sum = new Fraction1(0,1);
            for(Fraction1 f:p) sum = sum.add(f);
            return sum;
    */
    
     /*
     double valueOf(){
        return 1.0*this.tuSo/this.mauSo;
     }
     */
    /* 
     @Override
    public int compareTo(Fraction1 f) {
        if(this.valueOf()>f.valueOf()) return 1;
        else if(this.valueOf()< this.valueOf()) return -1;
    }
     */
    public static void main(String[] args) {
        //Fraction fractions[] = generate(10);
        
        //Arrays.sort(fractions);
        
        Fraction1 ps1 = new Fraction1(2,5);
        Fraction1 ps2 = new Fraction1(4,2);
        Fraction1 ps3 = new Fraction1(3,9);
//==========Create an array includes fraction===========
        Fraction1[] arrPS = {ps1,ps2,ps3};
        
//==========ADD========================================        
        Fraction1 sum = new Fraction1();
        for(int i =0; i< arrPS.length; i++){         
            sum = sum.add(arrPS[i]);        
            if(i != arrPS.length - 1){
                System.out.print(arrPS[i]+" + ");
            }else
                System.out.print(arrPS[i]+" = "+sum.rutGon()+"\n");
                
        }
//==========Subtract=====================================
        Fraction1 sub = new Fraction1(arrPS[0]);
        System.out.print(arrPS[0]+" - ");
        for(int i =1; i< arrPS.length; i++){   
            sub = sub.subtract(arrPS[i]);             
            if(i != arrPS.length - 1){
                System.out.print(arrPS[i]+" - ");
            }else
                System.out.print(arrPS[i]+" = "+sub.rutGon()+"\n");
              
        }
//==========Mutiply====================================
        Fraction1 muti = new Fraction1(arrPS[0]);
        System.out.print(arrPS[0]+" x ");
        for(int i =1; i< arrPS.length; i++){   
            muti = muti.mutiply(arrPS[i]);             
            if(i != arrPS.length - 1){
                System.out.print(arrPS[i]+" x ");
            }else
                System.out.print(arrPS[i]+" = "+muti.rutGon()+"\n");
              
        }
//===========Divide==============================================        
        Fraction1 div = new Fraction1(arrPS[0]);
        System.out.print(arrPS[0]+" : ");
        for(int i =1; i< arrPS.length; i++){   
            div = div.divide(arrPS[i]);             
            if(i != arrPS.length - 1){
                System.out.print(arrPS[i]+" : ");
            }else
                System.out.print(arrPS[i]+" = "+div.rutGon()+"\n");
              
        }
        
//============Arrange================================================
        for(int i =0; i< arrPS.length - 1; i++){ 
            for(int k = i+1 ; k< arrPS.length ; k++){
                if(1.0*arrPS[i].tuSo/arrPS[i].mauSo  > 1.0*arrPS[k].tuSo/arrPS[k].mauSo){
                    Fraction1 tempt = new Fraction1(arrPS[i]);
                    arrPS[i] = arrPS[k];
                    arrPS[k] = tempt;
                }
            }
        }
        
        System.out.print("Fraction ascending: ");
        for(int i =0; i< arrPS.length; i++){
            System.out.print(arrPS[i]+", ");
        }
        
        System.out.print("\nFraction descending: ");
        for(int i = arrPS.length -1; i>=0;i--){
            System.out.print(arrPS[i]+", ");
        }
        /*   
        System.out.println(ps1.toString()+" + "+ps2.toString()+" = "+ps1.add(ps2).rutGon());
        
        System.out.println(ps1.toString()+" - "+ps2.toString()+" = "+ps1.subtract(ps2).rutGon());
        
        System.out.println(ps1.toString()+" * "+ps2.toString()+" = "+ps1.mutiply(ps2).rutGon());
        
        System.out.println(ps1.toString()+" : "+ps2.toString()+" = "+divide(ps1,ps2).rutGon());
        
        System.out.println("Reverse of "+ps1.toString()+" is: "+ps1.reverse());
        */
    }

    
}
