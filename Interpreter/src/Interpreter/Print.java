/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;



/**
 *
 * @author DELL
 */
public class Print extends Command implements InterpreterInterface{

    public Print(String cmd) {
        super(cmd);
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }
    
    

    private int getValue(){
      return vars[(int) (getCmd().charAt(6)) - 65];
        
    }
    
    @Override
    public void execute() {
        System.out.println(getValue());
        
    }

    @Override
    public boolean isValid() {
        return cmd.matches("PRINT [A-Z]");
    }
    
    
}
