/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author DELL
 */
public class Command implements InterpreterInterface{
    protected String cmd;

    public Command(String cmd) {
        this.cmd = cmd;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }
    
    public boolean checkBegin(){
        return cmd.equals("BEGIN");
    }
    
    public boolean checkEnd(){
        return cmd.equals("END");
    }
    
    public boolean isValid(){
        Let l = new Let(cmd);
        Print p = new Print(cmd);
        return l.isValid() || p.isValid();
    }
    
    public void execute(){
        
        if(cmd.startsWith("LET")){
            Let l1 = new Let(cmd); l1.execute();
            
        }else{
            Print p1 = new Print(cmd); p1.execute();
        }
    }
}
