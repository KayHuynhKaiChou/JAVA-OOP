/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import BinarySearchTree.BST;
import BinarySearchTree.BSTNode;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ListHSbyBST  {
    private BST<Student> listHS = new BST<>();

    public ListHSbyBST() {
    }

    public BST<Student> getListHS() {
        return listHS;
    }

    public void setListHS(BST<Student> listHS) {
        this.listHS = listHS;
    }
    
    public void addStudent(Student hs){
        listHS.insert(hs);
    }
    
    public boolean removeStudent(Student hs){
        return listHS.remove(hs);
    }
    
    public Student updateMark(String code){
        
        BSTNode<Student> hsNode = listHS.search(new Student(code, "", 0.0));
        if(hsNode==null) return null;
        return hsNode.getInfo();
    }
    
    public boolean check(Student hs){
        
        if(!hs.getCode().matches("P[0-9][0-9]")) return false;
        if(hs.getName().length()<5 && hs.getName().isBlank()) return false;
        if(hs.getMark()<0 || hs.getMark()>10) return false;
        return true;
    }
    
    public void printList(){
        listHS.inOrder(listHS.getRoot());
    }
}
