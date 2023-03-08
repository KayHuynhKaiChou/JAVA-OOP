/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Mo_controller;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.Mo_model;

/**
 *
 * @author DELL
 */
public class Mo_view extends JFrame{
    private Mo_model mo;
    private JLabel Jl3;
    private JLabel Jl4;
    private JLabel Jl6;
    private JLabel Jl8;
    
    public Mo_view(){
        this.mo = new Mo_model();
        this.swing();
        this.setVisible(true);
    }
    
    public void swing(){
        this.setTitle("App BlackPink");
        this.setSize(500,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font f0 = new Font("Arial",Font.BOLD,50);
        Font f1 = new Font("Arial",Font.BOLD,30);
        Mo_controller mo = new Mo_controller(this);
        
        JLabel Jl1 = new JLabel("Check Action Mouse",JLabel.CENTER);
        Jl1.setFont(f0); Jl1.addMouseListener(mo); Jl1.addMouseMotionListener(mo);
        
        JLabel Jl2 = new JLabel("Position Mouse"); Jl2.setFont(f1);
        Jl3 = new JLabel("x = ",JLabel.CENTER); Jl3.setFont(f1);
        Jl4 = new JLabel("y = ",JLabel.CENTER); Jl4.setFont(f1);
        JLabel Jl5 = new JLabel("Click mouse times"); Jl5.setFont(f1);
        Jl6 = new JLabel("",JLabel.CENTER); Jl6.setFont(f1);
        JLabel Jl7 = new JLabel("Whether mouse's in the component");
        Jl7.setFont(f1);
        Jl8 = new JLabel("",JLabel.CENTER); Jl8.setFont(f1);
        JLabel empty1 = new JLabel();
        JLabel empty2 = new JLabel();
        
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3,3));
        jp.add(Jl2); jp.add(Jl3); jp.add(Jl4); jp.add(Jl5); jp.add(Jl6); jp.add(empty1);
        jp.add(Jl7); jp.add(Jl8); jp.add(empty2);
         
        this.setLayout(new BorderLayout());
        this.add(Jl1,BorderLayout.CENTER);
        this.add(jp,BorderLayout.SOUTH);
    }
    
    public void clickMouse(){
        this.mo.click();
        this.Jl6.setText(this.mo.getCount()+" times ");
    }
    
    public void inSwing(){
        this.mo.in();
        this.Jl8.setText(this.mo.getCheck());
    }
    
    public void outSwing(){
        this.mo.out();
        this.Jl8.setText(this.mo.getCheck());
    }
    
    public void updateXY(int x, int y){
        this.mo.setX(x);
        this.mo.setY(y);
        this.Jl3.setText(this.mo.getX()+"");
        this.Jl4.setText(this.mo.getY()+"");
    }
}
