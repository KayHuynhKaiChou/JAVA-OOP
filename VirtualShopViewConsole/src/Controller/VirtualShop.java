/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Product;
import java.util.ArrayList;
import view.CartView;
import view.MenuShop;
import view.OrderView;
import view.SearchView;
import view.ShopView;


/**
 *
 * @author DELL
 */
public class VirtualShop extends MenuShop<String>{
    
    private ArrayList<String> menu = new ArrayList<>();
    CartView cv ;
    ShopView sv = new ShopView(); 
    SearchView sev; 
    OrderView ov ;
    public VirtualShop() {
        cv= new CartView(sv.cart,sv.shopProduct);
        sev = new SearchView(cv.getSp());
        ov = new OrderView(cv.getCart());
        
        menu.add("Buy Product");
        menu.add("Remove Product");
        menu.add("Add new product");
        menu.add("Search product in shop");
        menu.add("Print Order");
        menu.add("Exit");
        title = "--->>> Virtual Shopping <<<---";
        mChon = menu;
    }
    
    public static void main(String[] args) {
        new VirtualShop().run();
    }

    @Override
    public void execute(String str) {
        switch(str){
            case "1": 
                if(sv.shopProduct.getShop().isEmpty()) System.out.println("Shop is empty or not exist product, please add product");
                else sv.run(); 
                break; 
            case "2": 
                if(cv.getCart().getBasket().isEmpty()) System.out.println("Your Cart is empty, please fill it by product");
                else cv.run(); 
                break;
            case "3": 
                sv.inputSP(); 
                break;
            case "4":
                Product pr = sev.searchSP();
                if( pr == null) System.out.println("This product not Exist in shop");
                else System.out.println(pr);
                break;
            case "5":
                ov.inputInformClient();
                System.out.println(ov.getOr());
                ov.getCa().getBasket().clear(); // sau khi thanh toan xong thi cart is empty
                break;
            case "6":
                sv.shopProduct.saveData("shop.txt");
                System.exit(0);
        }
        //if(Integer.parseInt(str)<=4){run();}
    }
    
   

    
    
    
}
