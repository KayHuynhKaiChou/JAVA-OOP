/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTree;

/**
 *
 * @author DELL
 */
public class BST<T extends Comparable<T>> {
    protected BSTNode<T> root;

    public BST() {
    }

    public BSTNode<T> getRoot() {
        return root;
    }
    
    
    public void visit(BSTNode<T> p){
        System.out.print(p.info+" ");
    }
    
    public void preOrder(BSTNode<T> p){
        if(p==null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    
    public void inOrder(BSTNode<T> p){
        if(p==null) return;
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }
    
//    public void breadthFirst(){
//        BSTNode<T> p = root;
//        MyQueueByLinkedList<BSTNode<T>> queue = new MyQueueByLinkedList<>();
//        if(p!=null){
//            queue.enqueue(p); // thêm root vào queue
//            while(!queue.isEmpty()){
//                p = queue.dequeue();
//                visit(p);
//                if(p.left!=null) queue.enqueue(p.left);
//                if(p.right!=null) queue.enqueue(p.right);
//            }           
//        }
//        System.out.println("");
//    }
    
    public BSTNode<T> search(BSTNode<T> p, T x){
        if(p==null) return null;
        else if(x==p.info) return p;
        else if(x.compareTo(p.info)>0) return search(p.right,x);
        else return search(p.left,x);
    }
    
    public BSTNode<T> search(T x){
        BSTNode<T> p = root;
        while(p!=null){
            if(p.info.compareTo(x)==0) return p;
            else if(p.info.compareTo(x)>0) p = p.left;
            else p = p.right;
        }
        return p;
    }
    
    
    public boolean contain(T el){
        return contain(root,el);
    }
    
    private boolean contain(BSTNode<T> p, T x){
        if(p==null) return false;
        else if(x.compareTo(p.info)<0) return contain(p.left,x);
        else if(x.compareTo(p.info)>0) return contain(p.right,x);
        else return true;
    }
    
    public void insert(T el){
        if(contain(el)){
            System.out.println("This Code already exists, no insertion");
            return;
        }
        root = insert(root, el);
    }
    
    private BSTNode<T> insert(BSTNode<T> p, T x){
        if(p==null){
            p = new BSTNode(x);
        }else{               
            if(x.compareTo(p.info)>0){
                p.right = insert(p.right,x);
            }else if(x.compareTo(p.info)<0){
                p.left = insert(p.left,x);
            }
        }
        
        return p;
    }
    
    public boolean remove(T el){
        if(!contain(el)) return false;
        else root = deleteCopying(root, el);
        return true;
    }
    
    private BSTNode<T> deleteCopying(BSTNode<T> node, T el){
        int result = el.compareTo(node.info);
        if(result>0) node.right = deleteCopying(node.right, el);
        else if(result<0) node.left = deleteCopying(node.left, el);
        else {
            // TH1: Delete Node is leaf or Node has a child
            if(node.left==null){
                node.info=null;
                return node.right;
            }else if(node.right==null){
                node.info=null;
                return node.left;
            }
            //TH2: Delete Node has two child . Way solve : phải nhất của cây con trái.
            else{
                T tmp = maxLeft(node.left);
                node.info = tmp;
                node.left = deleteCopying(node.left, tmp);
            } // we cx can use "Trái nhất của cây con phải"
        }
        return node;
    }
    
    private T maxLeft(BSTNode<T> node){
        while(node.right!=null) node = node.right;
        return node.info;
    }
    
    
}
