/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.JPanel_Circle;
import controller.JPanel_HCN;
import controller.Me_controller;
import controller.MouseAc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import model.Me_model;

/**
 *
 * @author DELL
 */
public class Me_view extends JFrame{
    private Me_model mo;
    private JTextArea jte1;
    private JTextArea jte2;
    private JPanel jla;
    private JPanel_HCN hcn;
    private JPanel_Circle cir;
    private JTextArea jte3;
    public JPopupMenu jpo; // public vì để còn use ở bên class MouseAc
    
    
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
        /////////////////////////////////////////////////////////
        JMenu jm2 = new JMenu("Word Ja");
        JMenuItem jmi5 = new JMenuItem("ikura");
        jmi5.addActionListener(ac);
        JMenuItem jmi6 = new JMenuItem("owarimasu");
        jmi6.addActionListener(ac);
        
        jm2.add(jmi5); jm2.addSeparator();
        jm2.add(jmi6); jm2.addSeparator();
        ///////////////////////////////////////////////////////////
        JMenu jm3 = new JMenu("New Swing");
        JMenuItem jmi7 = new JMenuItem("Red Swing");
        jmi7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.ALT_DOWN_MASK));
        jmi7.addActionListener(ac);
        JMenuItem jmi8 = new JMenuItem("Pink Swing");
        jmi8.addActionListener(ac);
        jmi8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.ALT_DOWN_MASK));
        JMenuItem jmi9 = new JMenuItem("Green Swing");
        jmi9.addActionListener(ac);
        jmi9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.ALT_DOWN_MASK));
        
        jm3.add(jmi7); jm3.add(jmi8); jm3.add(jmi9);
        ///////////////////////////////////////////////////////////
        
        JMenu jm4 = new JMenu("Geometry");
        JToolBar toolBar = new JToolBar();
        JButton J1 = new JButton("Circle");
        J1.addActionListener(ac); 
        JButton J2 = new JButton("Rectangle");
        J2.addActionListener(ac);
        toolBar.add(J1); toolBar.add(J2);
        jm4.add(toolBar);
        //////////////////////////////////////////////////
        
        JMenu jm5 = new JMenu("Tools");
        JMenuItem jmi10 = new JMenuItem("Help");
        jmi10.addActionListener(ac);
        JMenuItem jmi11 = new JMenuItem("Table");
        jmi11.addActionListener(ac);
        JMenuItem jmi12 = new JMenuItem("Exit");
        jmi12.addActionListener(ac);
        jm5.add(jmi10); jm5.add(jmi11); 
        jm5.add(jmi12); 
        /////////////////////////////////////////////////
        //menu chuột phải chỉ hoạt động khi click vào JPanel , JTextArea ko đc
        jpo = new JPopupMenu(); 
        JMenu toi = new JMenu("Evening");
        JMenuItem ban = new JMenuItem("Ban");
        ban.addActionListener(ac);
        JMenuItem yoru = new JMenuItem("Yoru");
        yoru.addActionListener(ac);
        toi.add(ban); toi.add(yoru);
        JMenuItem ki = new JMenuItem("Kimasu");
        ki.addActionListener(ac);
        JMenuItem iki = new JMenuItem("Ikimasu");
        iki.addActionListener(ac);
        jpo.add(toi); jpo.addSeparator(); jpo.add(ki); jpo.add(iki);
        //this.add(jpo);
        MouseAc mac = new MouseAc(this);
        this.addMouseListener(mac);
        //////////////////////////////////////////////////
        
        jmb.add(jm3);
        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm4);
        jmb.add(jm5);
        this.setJMenuBar(jmb);
        
        ///////////////////////////////////////////////////////////
        
        jte1 = new JTextArea(30,30); jte1.setFont(f0);
        jte1.addMouseListener(mac);
        jte2 = new JTextArea(30,30); jte2.setFont(f0);
        jte2.addMouseListener(mac);
        JScrollPane js1 = new JScrollPane(jte1,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JScrollPane js2 = new JScrollPane(jte2,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        JPanel_Circle cir = new JPanel_Circle();
        JPanel_HCN hcn = new JPanel_HCN();
        jla = new JPanel();
        jla.setLayout(new GridLayout(1,2));
        jla.add(cir);
        jla.add(hcn);
        
        jte3 = new JTextArea(30,30); jte3.setFont(f0);
        jte3.addMouseListener(mac);
        JScrollPane js3 = new JScrollPane(jte3,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        JPanel total = new JPanel();
        
        total.setLayout(new GridLayout(2,2,10,10));
        total.add(js1);
        total.add(js2);
        total.add(js3);
        total.add(jla);
        //this.add(jb);
        
        this.add(total,BorderLayout.CENTER);
        
        
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
    
    public void help(){
        this.jte3.setText("Press 'Help' ");
    }
    
    public void table(){
        this.jte3.setText("Press 'Table' ");
    }
    
    public void evening(String s){
        if(s.equals("Ban : buổi tối")){
            this.jte2.setText(s);
        }else
            this.jte2.setText(s);
    }
    
    public void diden(String s){
        if(s.equals("đi + kara,...")){
            this.jte2.setText(s);
        }else
            this.jte2.setText(s);
    }
    
    
}
