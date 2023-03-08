/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author DELL
 */
public class MyQueueByArray {
    private int first , last , size;
    private Object[] storage;
    
    public MyQueueByArray(){  //(1)
        this(10);
    }
    
    public MyQueueByArray(int kt) {  //(2)
        this.size = kt;              // (1) phải trước (2) , nếu ngược lại thì (1) sẽ hiểu là recrusive
        first = last = -1;
        storage = new Object[size];
    }
    
    public boolean isFull(){
        return (first==0 && last == size -1 || last == first -1);
    }
    
    public boolean isEmpty(){
        return first == -1;
    }
    
    public void enqueue(Object el){
        if(isFull()) System.out.println("Queue is Full");
        else if(isEmpty() || last == size - 1){
            storage[0] = el;
            last = 0;
            if(first==-1) first = 0;
        }else storage[++last] = el;
    }
    
    public Object dequeue() throws Exception{
        Object result = storage[first];
        if(isEmpty()) throw new Exception();
        else if(first == size - 1) first = 0;
        else if(first == last) first = last = -1;
        else first++;

        return result;
    }
    
    public Object front() throws Exception{
        if(isEmpty()) throw new Exception();
        else return storage[first];
    }
}
