/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Cart;
import Model.Order;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class OrderView {
    private Cart ca;
    private Order or = new Order();
    
    public OrderView(Cart car){
        this.ca = car;
    }

    public Order getOr() {
        return or;
    }

    public Cart getCa() {
        return ca;
    }
        
    public void inputInformClient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String ten = sc.nextLine();
        System.out.print("+ Enter Address:");
        String diachi = sc.nextLine();
        System.out.print("+ Enter Telephone:");
        String sdt = sc.nextLine();
        this.or = new Order(ca,ten,diachi,sdt);
    }
}
