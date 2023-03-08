/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanel_Circle extends JPanel{

    public JPanel_Circle() {
        this.setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.BLUE);
        // HCN full color
        g.fillOval(100, 100, 100, 200);
    }
    
    
}
