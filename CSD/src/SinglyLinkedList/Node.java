/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinglyLinkedList;

/**
 *
 * @author DELL
 */
public class Node<T> {
    T info;
    Node next;
    
    Node(){}
    Node(T x,Node p){
        this.info = x;
        this.next = p;
    }
}
