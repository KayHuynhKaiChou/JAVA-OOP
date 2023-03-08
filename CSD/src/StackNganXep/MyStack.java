/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackNganXep;

import java.util.EmptyStackException;

/**
 *
 * @author DELL
 */
public class MyStack <T>{
    protected Node<T> head;
    private int size;

    public MyStack() {
        head=null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void push(T gt){
        head = new Node(gt,head);
        size++;
    }
    
    public T top() throws EmptyStackException{
        if(isEmpty()) throw new EmptyStackException();
        return head.info;
    }
    
    public T pop() throws EmptyStackException{
        if(isEmpty()) throw new EmptyStackException();
        T takenEle = head.info;
        head = head.nextEle;
        size--;
        return takenEle;
        
    }
    

}
