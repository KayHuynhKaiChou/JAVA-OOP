/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackNganXep;

/**
 *
 * @author DELL
 */
public class Node <T>{
    public T info;
    public Node nextEle;

    public Node(T info, Node nextEle) {
        this.info = info;
        this.nextEle = nextEle;
    }
    
    public Node(T giatri) {
        this(giatri,null);
    }
}
