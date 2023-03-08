/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList;

/**
 *
 * @author DELL
 */
public class MyDoublyLinkedList<T> {
    DLLNode<T> head , tail;

    public MyDoublyLinkedList() {
        head = tail = null;
    }
    
    boolean isEmpty(){
        return head==null;
    }
    
    void removeAll(){
        head = tail = null;
    }
    
    void addToHead(T el){
        if(isEmpty()) head = tail = new DLLNode<T>(el);
        else{
            head = new DLLNode<>(el,head,null);
            head.next.prev = head;        
        }
    }
    
    void addToTail(T el){
        if(isEmpty()) head = tail = new DLLNode<T>(el);
        else {
            tail = new DLLNode<T(el,null,tail);
            tail.prev.next = tail;
        }
    }
    
    T RemoveFromHead(){
        if(isEmpty()) System.out.println("DoublyLinkedList is Empty !");
        else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        return head.info;
    }
    
    T RemoveFromTail(){
        if(isEmpty()) System.out.println("DoublyLinkedList is Empty !");
        else if(head == tail){
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
        return tail.info;
    }
    
    void printAll(){
        DLLNode<T> tmp;
        for(tmp = head; tmp != null; tmp=tmp.next){
            System.out.println(tmp.info+" ");
        }
    }
    
    boolean CheckExist(T el){
        for(DLLNode<T> tmp = head; tmp!=null && !el.equals(tmp.next); tmp = tmp.next);
        return tmp != null;
    }
}
