/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author DELL
 */
public class Mo_model {
    private int x;
    private int y;
    private int count;
    private String check;

    public Mo_model() {
        this.x =0;
        this.y = 0;
        this.count = 0;
        this.check = "";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
    
    public void click(){
        this.count++;
    }
    
    public void in(){
        this.check = "Yes";
    }
    
    public void out(){
        this.check = "No";
    }
    
    
}
