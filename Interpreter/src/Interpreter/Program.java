/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author DELL
 */
public class Program implements InterpreterInterface{
    private Command[] cmds;
    public static final int[] vars = new int[26]; // vì A-->Z

    public Program(String[] cmds) {
        this.cmds = new Command[cmds.length];
        for(int i=0; i<cmds.length; i++){
            this.cmds[i]= new Command(cmds[i]);
        }
    }

    public Command[] getCmds() {
        return cmds;
    }

    public void setCmds(Command[] cmds) {
        this.cmds = cmds;
    }
    
    public boolean isValid(){
        if(cmds[0].checkBegin() && cmds[cmds.length-1].checkEnd()){
            for(int i=1; i<cmds.length-1; i++)
                if(!cmds[i].isValid()) return false;
        }else return false;
        
        return true;
    }
    
    public void execute(){
        for(int i=1; i< cmds.length - 1; i++) cmds[i].execute();
    }
}
