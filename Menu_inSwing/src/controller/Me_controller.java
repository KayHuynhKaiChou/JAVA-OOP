/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        }else{
            
            new NewSwing();
        }
    }
    
    
}
