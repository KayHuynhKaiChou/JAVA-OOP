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
            Boolean check = shopProduct.checkInput(new Product(id, name, nsx, hsd, gia, sl),shopProduct.getShop() );
            System.out.print("Do you wanna input Volume or Weight Product(V/W): ");
            switch(sc.nextLine()){
                case "V":
                    System.out.print("Enter value Volume: ");
                    Double vo = Double.valueOf(sc.nextLine());
                    if(check == true && vo>0) shopProduct.addSP(new VolumnProduct(id,name,nsx,hsd,gia,sl,vo));
                    else System.out.println("Input value is Invalid or wrong format!");
                    break;
                case "W":
                    System.out.print("Enter value Weight: ");
                    Double kl = Double.valueOf(sc.nextLine());
                    if(check == true && kl>0) shopProduct.addSP(new WeightProduct(id,name,nsx,hsd,gia,sl,kl));
                    else System.out.println("Input value is Invalid or wrong format!");
                    break;
            }
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
