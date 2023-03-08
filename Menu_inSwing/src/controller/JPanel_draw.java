/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class JPanel_draw extends JPanel{

    public JPanel_draw() {
        this.setBackground(Color.WHITE);
    }
    
    // Alt+Insert --> Override method ---> Jicomponent ---> paintComponent
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.red);
        g.drawOval(100, 100, 300, 100);
    }
    
}
