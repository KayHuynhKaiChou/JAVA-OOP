/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import SinglyLinkedList.MyLinkedList;

/**
 *
 * @author DELL
 */
public class MyQueueByLinkedList<T> {
    MyLinkedList<T> mll = new MyLinkedList<>();

    public MyQueueByLinkedList() {
    }
    
    public void enqueue(T el){
        mll.addLast(el);
    }
    
    public void dequeue(){
        mll.removeFirst();
    }
    
    public boolean isEmpty(){
        return mll.isEmpty();
    }
    
    public T front(){
        return mll.getFirst();
    }
}
