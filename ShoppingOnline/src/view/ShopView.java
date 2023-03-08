/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Cart;
import Model.Product;
import Model.ShopProduct;
import Model.VolumnProduct;
import Model.WeightProduct;

/**
 *
 * @author DELL
 */
public class ShopView extends MenuShop<Product>{ // xem để bỏ hàng vào giỏ
    public ShopProduct shopProduct = new ShopProduct();
    public Cart cart = new Cart();
    
    
    public ShopView(){
        
        title = "----->>> Shop Product <<<-----";
        mChon = shopProduct.getShop();
    }
    
    public void inputSP(){
        while(true){
            System.out.println("--->>>Enter Information: ");
            System.out.print("+ Enter ID:");
            String id = sc.nextLine();
            System.out.print("+ Enter Name:");
            String name = sc.nextLine();
            System.out.print("+ Enter NSX:");
            String nsx = sc.nextLine();
            System.out.print("+ Enter HSD:");
            String hsd = sc.nextLine();
            System.out.print("+ Enter Price:");
            Double gia = Double.valueOf(sc.nextLine());
            System.out.print("+ Enter First Quantity:"); // Nhap ve kho so luong bao nhieu
            int sl = Integer.parseInt(sc.nextLine());
            System.out.print("Do you wanna input Volume or Weight Product(V/W): ");
            if(sc.nextLine().equalsIgnoreCase("V")){
                System.out.print("Enter value Volume: ");
                Double vo = Double.valueOf(sc.nextLine());
                shopProduct.addSP(new VolumnProduct(id,name,nsx,hsd,gia,sl,vo));
            }else{
                System.out.print("Enter value Weight: ");
                Double kl = Double.valueOf(sc.nextLine());
                shopProduct.addSP(new WeightProduct(id,name,nsx,hsd,gia,sl,kl));
            }
            //shopProduct.addSP(new VolumnProduct("P2","Pepsi","120322","030922",12000,70,450));
            //shopProduct.addSP(new VolumnProduct("P3","7up","030322","150922",10000,30,350));
            System.out.print("Do you wanna input more products (Y/N): ");
            if(sc.nextLine().equalsIgnoreCase("N")) break;
        }
    }

    @Override
    public void execute(String n) {
        boolean check = false;
        for (int i=0; i<mChon.size();i++) {
            if(n.equals(mChon.get(i).getId())){ 
                cart.addItem(mChon.get(i),this.shopProduct);
                check = true;
                //break;
            } 
        }
        if(check == false) System.out.println("ID not exist");
       // if(n>mChon.size()) return;
        //cart.addItem(mChon.get(n-1));
    }
 
}
