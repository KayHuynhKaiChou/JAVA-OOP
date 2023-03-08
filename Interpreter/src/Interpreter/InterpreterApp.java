/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interpreter;

/**
 *
 * @author DELL
 */
public class InterpreterApp {
    public static void main(String[] args) {
        String[] array = {"BEGIN","LET A = 5","LET B = 9","LET M = A + A","PRINT A","PRINT M","LET D = M + B","PRINT D","END"};
        
        Program pro = new Program(array);
        if(pro.isValid()) pro.execute();
        else System.out.println("Error Syntax");
        
    }
}
