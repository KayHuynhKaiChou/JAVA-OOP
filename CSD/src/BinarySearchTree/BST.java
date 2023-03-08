/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTree;

import StackNganXep.Node;

/**
 *
 * @author DELL
 */
public class BST<T extends Comparable<T>> {
    protected BSTNode<T> root;

    public BST() {
    }
    
    public void visit(BSTNode<T> p){
        System.out.print(p.info+" ");
    }
    
    public void PreOrder(BSTNode<T> p){
        if(p==null) return;
        visit(p);
        PreOrder(p.left);
        PreOrder(p.right);
    }
    
    public BSTNode<T> Search(BSTNode<T> p, T x){
        if(p==null) return null;
        else if(x==p.info) return p;
        else if(x.compareTo(p.info)>0) return Search(p.right,x);
        else return Search(p.left,x);
    }
    
    public BSTNode<T> Search(T x){
        BSTNode<T> p = root;
        while(p!=null){
            if(p.info==x) return p;
            else if(p.info.compareTo(x)>0) p = p.right;
            else p = p.left;
        }
        return null;
    }
    
//    public void insert(T x){
//       if(root==null) root.info=x;
//        BSTNode<T> p = new BSTNode<T>(x);
//        if(root.left==null && root.info.compareTo(x)>0) root.left=p;
//         
//    } 
    
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
            System.out.println(el+" already exists, no insertion");
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
//            else{
//                System.out.println(x+" already exists, no insertion");
//            }   vì đã có contain ở hàm insert(T el) để check ele trùng nên ko cần lệnh này 
        }
        
        return p;
    }
    
    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        tree.insert(7);
        tree.insert(10);
        tree.insert(3);
        tree.insert(10);
        tree.PreOrder(tree.root);
        
    }
}
