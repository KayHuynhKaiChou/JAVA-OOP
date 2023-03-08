/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.JPanel_draw;
import controller.Me_controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.Me_model;

/**
 *
 * @author DELL
 */
public class Me_view extends JFrame{
    private Me_model mo;
    private JTextArea jte1;
    private JTextArea jte2;
    private JPanel_draw jp;
    public Me_view(){
        this.mo = new Me_model();
        this.swing();
        this.setVisible(true);
    }
    
    public void swing(){
        this.setTitle("Simple Menu");
        this.setSize(600,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font f0 = new Font("Arial",Font.BOLD,50);
        Me_controller ac = new Me_controller(this);
        
        JMenuBar jmb = new JMenuBar();
        JMenu jm1 = new JMenu("Word Eng");
        JMenuItem jmi1 = new JMenuItem("Controversy");
        jmi1.addActionListener(ac);
        JMenuItem jmi2 = new JMenuItem("Curious");
        jmi2.addActionListener(ac);
        JMenuItem jmi3 = new JMenuItem("Deep");
        jmi3.addActionListener(ac);
        JMenuItem jmi4 = new JMenuItem("Modest");
        jmi4.addActionListener(ac);
        
        jm1.add(jmi1); jm1.addSeparator();
        jm1.add(jmi2); jm1.addSeparator();
        jm1.add(jmi3); jm1.addSeparator();
        jm1.add(jmi4); jm1.addSeparator();
        JMenu jm2 = new JMenu("Word Ja");
        JMenuItem jmi5 = new JMenuItem("ikura");
        jmi5.addActionListener(ac);
        JMenuItem jmi6 = new JMenuItem("owarimasu");
        jmi6.addActionListener(ac);
        jm2.add(jmi5); jm2.addSeparator();
        jm2.add(jmi6); jm2.addSeparator();
        jmb.add(jm1);
        jmb.add(jm2);
        this.setJMenuBar(jmb);
        
        JButton jb = new JButton("New Swing");
        jb.addActionListener(ac);
        jte1 = new JTextArea(30,30); jte1.setFont(f0);
        jte2 = new JTextArea(30,30); jte2.setFont(f0);
        JScrollPane js1 = new JScrollPane(jte1,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JScrollPane js2 = new JScrollPane(jte2,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jp = new JPanel_draw();
        
        this.setLayout(new GridLayout(1,4,10,10));
        this.add(jb);
        this.add(js1);
        this.add(js2);
        this.add(jp);
    }
    
    public void con(){
        this.mo.contro();
        this.jte1.setText(this.mo.getEng());
    }
    
    public void cu(){
        this.mo.curious();
        this.jte1.setText(this.mo.getEng());
    }
    
    public void de(){
        this.mo.deep();
        this.jte1.setText(this.mo.getEng());
    }
    
    public void mo(){
        this.mo.modest();
        this.jte1.setText(this.mo.getEng());
    }
    
    public void bntien(String s){
        this.jte2.setText(s);
    }
    
    public void end(String s){
        this.jte2.setText(s);
    }
}
