/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class NewSwing extends JFrame{
    
    public NewSwing(Color co) {
        this.setTitle("Simple Menu");
        this.setSize(600,800);
        this.setLocationRelativeTo(null);
        JPanel jco = new JPanel();
        jco.setBackground(co);
        jco.setOpaque(true);
        this.setLayout(new BorderLayout());
        this.add(jco,BorderLayout.CENTER);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

   

    
    
    
}
