/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.JCD;
import java.util.ArrayList;
import java.util.Vector;
import java.util.function.Predicate;

/**
 *
 * @author DELL
 */
public class ShopBook {
    private ArrayList<Book> ShopSach;

    public ShopBook() {
    /*
        ShopSach = new ArrayList<Book>();
        ShopSach.add(new Book("9-786041-150294","Mắt biết","Nguyễn Nhật Ánh","Romantic",296,10,110000,"C:\\Users\\DELL\\Documents\\NetBeansProjects\\BookShopOnline\\src\\ImageBook\\MatBiec.jpg"));
        ShopSach.add(new Book("9-709239-213294","Mỗi Lần Vấp Ngã Là Một Lần Trưởng Thành","Liêu Trí Phong","Life",376,20,230000,"C:\\Users\\DELL\\Documents\\NetBeansProjects\\BookShopOnline\\src\\ImageBook\\MoiLanVap.jpg"));
        ShopSach.add(new Book("9-344841-150294","Harry Potter và chiếc cốc lửa","Nguyễn Nhật Ánh","Action",296,15,490000,"C:\\Users\\DELL\\Documents\\NetBeansProjects\\BookShopOnline\\src\\ImageBook\\HarryChiecCoc.jpg"));
        ShopSach.add(new Book("9-112041-147934","Conan: Nàng dâu Halloween","Okura Takahiro","Romantic",225,37,70000,"C:\\Users\\DELL\\Documents\\NetBeansProjects\\BookShopOnline\\src\\ImageBook\\ConanHalloween.jpg"));
        ShopSach.add(new Book("9-786041-152351","Nghĩa địa ma quái","Stephen King","Horror, Mystery",396,12,150000,"C:\\Users\\DELL\\Documents\\NetBeansProjects\\BookShopOnline\\src\\ImageBook\\NghiaDia.jpeg"));
        ShopSach.add(new Book("9-222041-029131","Mật mã Da Vinci","Dan Brown","Novel",278,32,350000,"C:\\Users\\DELL\\Documents\\NetBeansProjects\\BookShopOnline\\src\\ImageBook\\Davinci.jpg"));
    */
    ShopSach = new JCD().takeDataFromSQL();
    
    }

    public ShopBook(ArrayList<Book> ShopSach) {
        this.ShopSach = ShopSach;
    }

    public ArrayList<Book> getShopSach() {
        return ShopSach;
    }

    public void setShopSach(ArrayList<Book> ShopSach) {
        this.ShopSach = ShopSach;
    }
    
    public void buyBook(Book sach, Cart gh){
        sach.setQuantity(sach.getQuantity()-1);
//        if(sach.getQuantity()==0) {
//            ShopSach.remove(sach);
//            new JCD().deleteBook(sach);
//        }
        Book sachCopy = new Book(sach);
        if(gh.getBasket().contains(sach)){
            for (Book bo : gh.getBasket()) {
                if(bo.equals(sach)) bo.setQuantity(bo.getQuantity()+1);
            }
        }else{
            sachCopy.setQuantity(1);
            gh.getBasket().add(sachCopy);
        }
        
    }
    
    public void removeBook(Book sach, Cart gh){
        sach.setQuantity(sach.getQuantity()-1);
        if(sach.getQuantity()==0) {
            gh.getBasket().remove(sach);
        }
        for (Book bo : ShopSach) {
            if(bo.equals(sach)) bo.setQuantity(bo.getQuantity()+1);
            new JCD().updateBook(bo);
        }
    }
    
    public void readFile(String fname){
        
    }
    
    public void writeFile(String fname){
        
    }
    
    public Vector<Vector> getData (ArrayList<Book> sh){
        Vector<Vector> v = new Vector<>();
        for (Book bo : sh) {
            v.add(bo.toVector());
        }
        return v;
    }
    
    public ArrayList<Book> searchBookbyPrice(ArrayList<Book> sh, Predicate<Book> p){
        ArrayList<Book> bookSearched = new ArrayList<>();
        for (Book bo : sh) {
            if(p.test(bo)) bookSearched.add(bo);
        }
        return bookSearched;
    }
}
