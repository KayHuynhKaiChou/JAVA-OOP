/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackNganXep;

/**
 *
 * @author DELL
 */
public class PrefixExpressionStack {
    
    public static void main(String[] args) {
        String str = "+ * + 5 2 2 / - 5 4 3";
        //String str = "- + * 2 3 * 5 4 9";
        System.out.println(evaluatePrefix(str));
    }
    
    
    static double evaluatePrefix(String exp){
        double result = 0; double n1=0,n2=0;
        String[] stk = exp.split(" ");
        MyStack<Double> stack = new MyStack<>();
        for(int i=stk.length-1;i>=0;i--){
            String s = stk[i];
            if(s.equals("+") || s.equals("*") || s.equals("/") || s.equals("-")){
                n2=stack.pop(); n1=stack.pop();
            }
            switch(s){
                case "+":
                    result=n1+n2; stack.push(result); break;
                case "-":
                    result=n1-n2; stack.push(result); break;
                case "*":
                    result=n1*n2; stack.push(result); break;
                case "/":
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
}
