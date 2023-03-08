/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author DELL
 */
public class Let extends Command implements InterpreterInterface{
    

    public Let(String cmd) {
        super(cmd);
    }
    

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }
    private int getVar(){ // vd : LET A, LET B , lấy index của A or B,... trong String cmd
        return ((int)getCmd().charAt(4)) - 65;
    }
    
    private int calculateExpr(){
        switch(getOperator()){
            case '+': return getOperand(8) + getOperand(12);
            case '-': return getOperand(8) - getOperand(12);
            case '*': return getOperand(8) * getOperand(12);
            case '/': return getOperand(8) / getOperand(12);
            default: return getOperand(8);
            
        }
    }
    
    private char getOperator(){
        return cmd.charAt(10);
        
    }
    
    private int getOperand(int pos){
       
        return vars[((int)getCmd().charAt(pos)) - 65];
    }
    @Override
    public void execute() {
        if(cmd.length()==9){
            vars[getVar()] = Integer.parseInt(cmd.charAt(8)+"");
            
        }else{
            vars[getVar()] = calculateExpr();
        }
    }

    @Override
    public boolean isValid() {
        return cmd.matches("LET [A-Z] = ([0-9]+|[A-Z] [*-/] [A-Z])");
    }
    
    
}
