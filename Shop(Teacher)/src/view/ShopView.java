package view;

import model.*;

public class ShopView extends Menu<Product> {
    private Shop shop= new Shop();
    private Basket cart = new Basket();

    public ShopView() {
        title="List of Product.";
        mChon=shop.getProducts();
    }
//-----------------------------------------
    @Override
    public void execute(int n) {
        if(n>mChon.size()) return;
        cart.addItem(mChon.get(n-1));
    }

    public Shop getShop() {
        return shop;
    }

    public Basket getCart() {
        return cart;
    }
    
}
