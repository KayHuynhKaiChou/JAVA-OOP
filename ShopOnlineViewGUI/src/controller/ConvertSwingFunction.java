/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Cart;
import Model.ShopProduct;
import View.FunctionJP;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import View.CartJP;
import View.OrderJP;
import View.SearchJP;
import View.ShopJP;
import View.newProductJP;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class ConvertSwingFunction {
    private JPanel root;
    private String kindSelected = "";
    private List<FunctionJP> listItem = null;
    public static ShopProduct shop = new ShopProduct();
    public static Cart ca = new Cart();
    

    public ConvertSwingFunction(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(){
        ImageIcon imageShop = new ImageIcon("shopImage.png");
        JLabel jl = new JLabel();
        jl.setIcon(imageShop);
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(jl,BorderLayout.CENTER);
        root.validate();
        root.repaint();
        
    }
    
    public void setEvent(List<FunctionJP> listItem){
        this.listItem = listItem;
        
        for (FunctionJP item : listItem) {
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "Shop":
                    node = new ShopJP(); break;
                case "Cart":
                    node = new CartJP(); break;
                case "Add new product":
                    node = new newProductJP(); break;
                case "Search product":
                    node = new SearchJP(); break;
                case "Print Order":
                    node = new OrderJP(); break;
                case "Exit":
                    shop.saveShop("shopp.txt");
                    System.exit(0); break;
              
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node,BorderLayout.CENTER);
            root.validate();
            root.repaint();
            setChangeBackGround(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
    
        }

        @Override
        public void mouseExited(MouseEvent e) {
            jpnItem.setBackground(new Color(76,175,80));
            jlbItem.setBackground(new Color(76,175,80));
    
        }
        
        private void setChangeBackGround(String kind){
            for (FunctionJP item : listItem) {
                if(item.getKind().equalsIgnoreCase(kind)){
                   item.getJlb().setBackground(new Color(96,100,191));
                   item.getJpn().setBackground(new Color(96,100,191));
                }else{
                   item.getJlb().setBackground(new Color(76,175,80));
                   item.getJpn().setBackground(new Color(76,175,80));
               
                }
            }
        }
        
    }
}
