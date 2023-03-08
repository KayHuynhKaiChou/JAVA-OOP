/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author DELL
 */
public class MixNumber extends Fraction {
    private int pNguyen;
    
    public MixNumber(){};

    public MixNumber(int pNguyen, int t, int m) {
        //If ko dùng super() , ta use : this.mauSo = t; this.mauSo = m;
        super(t,m); // super() = constructor ở lớp cha
        this.pNguyen = pNguyen;
    }

    public MixNumber(int pNguyen, Fraction p) {
        super(p);
        this.pNguyen = pNguyen;
    }
    
    

    public int getpNguyen() {
        return pNguyen;
    }

    public void setpNguyen(int pNguyen) {
        this.pNguyen = pNguyen;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return pNguyen + "("+super.toString()+ ")";
    }
    
    public Fraction reduce(){  //or MixNumber reduce() 
        this.pNguyen = this.pNguyen + this.tuSo/this.mauSo;
        this.tuSo %= this.mauSo;
        return this;
    }
    
    MixNumber add(MixNumber m){
        
      return new MixNumber(this.pNguyen + m.pNguyen, super.add(m));
      /*
      MixNumber tong = new MixNumber(0, 1, 1);
      tong.pNguyen = this.pNguyen*m.pNguyen;
      tong.tuSo = this.tuSo*m.mauSo + this.mauSo*m.tuSo;
      tong.mauSo = this.mauSo*m.mauSo;
      return tong;
    */
    }
    
    public static void main(String[] args) {
        MixNumber mix = new MixNumber(1,8,3);
        System.out.println(mix);
        System.out.println(mix.add(new MixNumber(2,4,3)));
        System.out.println(mix.reduce());
    }
}
