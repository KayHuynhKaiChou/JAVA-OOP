/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class NewSwing extends JFrame{

    public NewSwing() {
        this.setTitle("Simple Menu");
        this.setSize(600,800);
        this.setBackground(Color.yellow);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
}
