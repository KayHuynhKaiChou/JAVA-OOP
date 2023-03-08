/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BP_controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.BP_model;

/**
 *
 * @author DELL
 */
public class BP_view extends JFrame{
    private BP_model mo;
    private JTextArea jta;
    private JLabel jlimage;
    private ImageIcon i1;
    //private ImageIcon i2;
    
    public BP_view(){
        this.mo = new BP_model();
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
        JLabel jl = new JLabel("Information BlackPink members",JLabel.CENTER);
        jl.setFont(f0); jl.setBackground(Color.PINK); jl.setOpaque(true);
        
        URL urlIconNotepad = MainView.class.getResource("Pinkicon.png");
        Image img = Toolkit.getDefaultToolkit().createImage(urlIconNotepad);
        this.setIconImage(img);
        
        ActionListener ac = new BP_controller(this);
        JButton j1 = new JButton("Jisoo"); j1.addActionListener(ac);
        j1.setFont(f1); j1.setBackground(new Color(255, 137, 252));
        JButton j2 = new JButton("Jennie"); j2.addActionListener(ac);
        j2.setFont(f1); j2.setBackground(new Color(255, 137, 252));
        JButton j3 = new JButton("Rose"); j3.addActionListener(ac);
        j3.setFont(f1); j3.setBackground(new Color(255, 137, 252));
        JButton j4 = new JButton("Lisa"); j4.addActionListener(ac);
        j4.setFont(f1); j4.setBackground(new Color(255, 137, 252));
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(2,2));
        jp.add(j1); jp.add(j2); jp.add(j3); jp.add(j4);
        
        jta = new JTextArea(30,30); jta.setFont(f1);
        JScrollPane jsc = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        
        
        i1 = new ImageIcon(new ImageIcon("me1.jpg").getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
        //i1 = new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("me1.jpg")));
        //i1.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT);
        //i2 = new ImageIcon(me2.jpg);
        jlimage = new JLabel("");
        jlimage.setIcon(i1);
        
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(1,2));
        jp1.add(jlimage);
        jp1.add(jsc);
        
        this.setLayout(new BorderLayout());
        this.add(jl,BorderLayout.NORTH);
        this.add(jp,BorderLayout.WEST);
        this.add(jp1,BorderLayout.CENTER);
        
    }
    
    public void m1(){
        this.mo.member1();
        this.jta.setText(this.mo.getContent());
    }
    
    public void m2(){
        this.mo.member2();
        this.jta.setText(this.mo.getContent());
    }
    
    public void m3(){
        this.mo.member3();
        this.jta.setText(this.mo.getContent());
    }
    
    public void m4(){
        this.mo.member4();
        this.jta.setText(this.mo.getContent());
    }

    private static class MainView {

        public MainView() {
        }
    }
}
