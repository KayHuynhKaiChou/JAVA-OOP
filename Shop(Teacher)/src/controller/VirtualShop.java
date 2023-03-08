package controller;

import java.util.ArrayList;
import model.Basket;
import model.Customer;
import model.Order;
import model.Product;
import view.*;

public class VirtualShop extends Menu<String>{
    static String[] mc={"Buy product","View Cart","Create Order","Searching","Exit"};
    private ShopView sv;
    private BasketView bv;
    
    public VirtualShop(ShopView sv, BasketView bv){
        super("VIRTUAL SHOP",mc);
        //sv.getShop().readData();
        this.sv=sv;
        this.bv=bv;
        
    }
    
    public static void main(String[] args) {
        ShopView sv=new ShopView();
        BasketView bv=new BasketView(sv.getCart());
        new VirtualShop(sv,bv).run();
    }
/** Execute task base on user choice
 * 
 * @param n : number represent user choice
 */
    @Override
    public void execute(int n) {
        switch(n){
            case 1:sv.run(); break;
            case 2:bv.run(); break;
            case 3: break;
            case 4: doSearching();break;
            case 5: //sv.getShop().saveData();System.exit(0);
        }
    }
//----------------------------------------------------
    private void doSearching(){
        String[] ms={"Search by Cust Name","Search by Cust Tel","Search by Cust Addr"};
        new Menu<String>("Search Option",ms){
            @Override
            public void execute(int n) {
             switch(n){
                case 1: searchByName(); break; 
                case 2: break;
                case 3: break;
                }
            }
        }.run();
       
    }
//----------------------------------------------------
    private void searchByName(){
         String s=Helper.getString("Enter cust name");;
         ArrayList<Order> kq=sv.getShop().search((Customer c)->c.getCustName().equals(s));
         System.out.println(kq);
    }
//----------------------------------------------------
    private static class BasketView extends Menu<Product>{
    private Basket cart;

    public BasketView(Basket cart) {
        this.cart = cart;
        mChon=cart.getCart();
    }

    @Override
    public void execute(int n) {
        if(n>mChon.size()) return;
        cart.removeItem(mChon.get(n-1));
    }
    
    
}

}
