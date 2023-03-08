/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTree;

/**
 *
 * @author DELL
 */
public class BSTNode<T extends Comparable<T>> {
    protected T info;
    protected BSTNode<T> left, right;

    public BSTNode(){}
    
    public BSTNode(T info) {
        this(info,null,null);
    }

    public BSTNode(T info, BSTNode<T> left, BSTNode<T> right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public BSTNode<T> getRight() {
        return right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }
    
    
}
