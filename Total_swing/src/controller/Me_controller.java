/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import test.Me_test;
import view.Me_view;
import view.NewSwing;

/**
 *
 * @author DELL
 */
public class Me_controller implements ActionListener{
    private Me_view vi;

    public Me_controller(Me_view vi) {
        this.vi = vi;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String src = e.getActionCommand();
        
        if(src.equals("Controversy")){
           this.vi.con();
        }else if(src.equals("Curious")){
           this.vi.cu();
        }else if(src.equals("Deep")){
            this.vi.de();
        }else if(src.equals("Modest")){
            this.vi.mo();
        }else if(src.equals("ikura")){
            String s = "Bao nhiêu tiền \n ex: Sore kutsu wa ikura desuka? ";
            this.vi.bntien(s);
        }else if(src.equals("owarimasu")){
            String s = "end,finish \n ex: Ashita Conan anime wa nanji ni owarimasu ka?";
            this.vi.end(s);
        }else if(src.equals("Red Swing")){
            new NewSwing(Color.RED);
        }else if(src.equals("Pink Swing")){
            new NewSwing(Color.PINK);
        }else if(src.equals("Green Swing")){
            new NewSwing(Color.GREEN);
        }else if(src.equals("Help")){
            this.vi.help();
        }else if(src.equals("Table")){
            this.vi.table();
        }else if(src.equals("Exit")){
            System.exit(0);
        }else if(src.equals("Ban")){
            String s = "Ban : buổi tối";
            this.vi.evening(s);
        }else if(src.equals("Yoru")){
            String s = "Yoru : buổi tối";
            this.vi.evening(s);
        }else if(src.equals("Kimasu")){
            String s = "đi + kara,...";
            this.vi.diden(s);
        }else if(src.equals("Ikimasu")){
            String s = "đến + kara,...";
            this.vi.diden(s);
        }
    }
    
    
    
}
