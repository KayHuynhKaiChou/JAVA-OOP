/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BP_view;

/**
 *
 * @author DELL
 */
public class BP_controller implements ActionListener {
    private BP_view vi;

    public BP_controller(BP_view vi) {
        this.vi = vi;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String src = e.getActionCommand();
       
       if(src.equals("Jisoo")){
           this.vi.m1();
       }else if(src.equals("Jennie")){
           this.vi.m2();
       }else if(src.equals("Rose")){
           this.vi.m3();
       }else{
           this.vi.m4();
       }
    }
    
    
}
