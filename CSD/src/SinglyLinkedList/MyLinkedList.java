/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinglyLinkedList;

/**
 *
 * @author DELL
 */
public class MyLinkedList<T> {
    Node<T> head,tail;
    
    public MyLinkedList(){
        head=tail=null;
    }
    
    public boolean isEmpty(){
        return(head==null);
    }
    
    public void clear(){
        head = tail = null;
    }
    
    public void addLast(T x){
        if(isEmpty()) head=tail=new Node(x,null);
        else{
            Node q = new Node(x,null);
            tail.next = q; tail = q;
        }
    }
    
    public void addFirst(T x){
        if(isEmpty()) head=tail=new Node(x,null);
        else{
            Node q = new Node(x, null);
            q.next = head;
            head = q;
        }
    }
    
    public void printLinkedList(){
        Node p = head;
        while(p!=null){
            if(p.next==null) System.out.println(p.info);
            else System.out.print(p.info+", ");
            p=p.next;
        }
        System.out.println("");
    }
    
    public T removeFirst(){
        if(isEmpty()) System.out.println("LinkedList is empty !");
        T ele = head.info;
        if(head==tail) head=tail=null;
        else head = head.next;
        return ele;
    }
    
    public T removeLast(){
        if(isEmpty()) System.out.println("LinkedList is empty !");
        T ele = tail.info;
        if(head==tail) head=tail=null;
        else{
            Node<T> tmp = head;
            for(; tmp.next!=tail; tmp=tmp.next);
            tail = tmp;
            tail.next = null;
        }
        return ele;
    }
    
    public int size(){
        Node<T> p = head; int i=0;
        while(p!=null){
            i++;
            p=p.next;
        }
        return i;
    }
    
    public boolean ExistEle(T el){
        Node<T> tmp = head;
        for(;tmp!=null && !tmp.info.equals(el);tmp=tmp.next); // nếu bỏ tmp!=null thì sẽ có error khi execute this method
        return tmp!=null; //nếu use tmp.info==el; sẽ happen error như trên
    }
    
    public T getFirst(){
        if(isEmpty()) return null;
        return head.info;
    }
    
    void delete(T el){
        
    }
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.addFirst(18);
        ml.addFirst(3);
        ml.addFirst(24);
        ml.addFirst(6);
        ml.addLast(9);
        //////////////////////////////////////////////
        System.out.println("First LinkedList: ");  ml.printLinkedList();
        //////////////////////////////////////////////
        System.out.println("You have removed First ele to be "+ml.removeFirst());
        System.out.println("You have removed Last ele to be "+ml.removeLast());
        //////////////////////////////////////////////
        System.out.println("Later LinkedList: ");  ml.printLinkedList();
        //////////////////////////////////////////////        
        System.out.println("lenght = "+ml.size());
        
        System.out.println("Element 6 exists in LinkedList : "+ml.ExistEle(6));
    }
}
