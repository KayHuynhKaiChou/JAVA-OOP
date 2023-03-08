/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Cart;
import Model.Order;
import Model.Product;
import Model.ShopProduct;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SearchView {
    private ShopProduct sp;
    
    public SearchView(ShopProduct sp){
        this.sp = sp;
        //or = this.inputInformClient();
        //System.out.println(or);
    }

    public Product searchSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id product need to search in shop:");
        String id = sc.nextLine();
        return sp.searchSP(id,this.sp.getShop());
    }
}
