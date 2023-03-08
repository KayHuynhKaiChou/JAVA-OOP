/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arraylist;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class StringToken {
    public static void main(String[] args) {
//        String str = "1 2 * 3 4 * + 5 6 * + 2 *";
        String str = "+ * + 5 2 2 / - 5 4 3";
        System.out.println(evaluatePrefix(str));
//        StringTokenizer s = new StringTokenizer(str, "() ");
//        while(s.hasMoreTokens()) System.out.println(s.nextToken());
//        String[] stk = str.split(" ");
//        for(int i=stk.length-1;i>=0;i--){
//            System.out.println(stk[i]);
//        }
        System.out.println(Character.forDigit(3, 16));
    }
    
    static double evaluatePrefix(String exp){
        double result = 0; double n1=0,n2=0;
        String[] stk = exp.split(" ");
        Stack<Double> stack = new Stack<>();
        for(int i=stk.length-1;i>=0;i--){
            String s = stk[i];
            if(s.equals("+") || s.equals("*") || s.equals("/") || s.equals("-")){
                n1=stack.pop(); n2=stack.pop();
            }
            switch(s){
                case "+":
                    //n1=stack.pop(); n2=stack.pop();
                    result=n1+n2; stack.push(result); break;
                case "-":
                    //n1=stack.pop(); n2=stack.pop();
                    result=n1-n2; stack.push(result); break;
                case "*":
                    //n1=stack.pop(); n2=stack.pop();
                    result=n1*n2; stack.push(result); break;
                case "/":
                    //n1=stack.pop(); n2=stack.pop();
                    if(n2==0.0) throw new RuntimeException("Divide by 0!");
                    else result=n1/n2; stack.push(result);
                    break;
                default:
                    try {
                        stack.push(Double.valueOf(s));
                    } catch (Exception e) {
                        throw new RuntimeException("This Operator is not supported!");
                    }                    
            }
        }
        return result;
    }
    
    void takeToanHang(Stack<Double> stack){
        
    }
}
