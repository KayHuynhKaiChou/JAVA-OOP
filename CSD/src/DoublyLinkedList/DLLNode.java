/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList;

/**
 *
 * @author DELL
 */
public class DLLNode<T> {
    T info;
    DLLNode<T> prev , next;

    public DLLNode(T info) {
        this.info = info;
        prev = next = null;
    }

    public DLLNode(T info, DLLNode<T> prev, DLLNode<T> next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }
    
}
