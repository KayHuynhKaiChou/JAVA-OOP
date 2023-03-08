/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOTools;
import java.util.*;
/**
 *
 * @author DELL
 */
public class IOkeyboard {
    static final Scanner sc = new Scanner(System.in);
    
    public static int inputInteger(String inputCont, String errorCont) {
        while (true) {
            System.out.print(inputCont);
            String input = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e) {
                System.err.println(errorCont);
            }
        }
    }
    
    // ND : nội dung
    public static double inputDouble(String inputND, String errorND) {
        while (true) {
            System.out.print(inputND);
            String str = sc.nextLine().trim();
            if (str.isEmpty()) {
                return 0;
            }
            try {
                double n = Double.parseDouble(str);
                return n;
            } catch (NumberFormatException e) {
                System.err.println(errorND);
            }
        }
    }
    
    public static String inputString(String inputND) {
        System.out.print(inputND);
        String str = sc.nextLine().trim();
        return str;
    }
    
    public static String inputNoneEmptyString(String inputND, String errorAboutEmpty) {
        while (true) {
            String str = inputString(inputND);
            if (str.length() == 0 || str.isEmpty()) {
                System.err.println(errorAboutEmpty);
            }else return str;
        }
    }
    
    
     public static boolean confirm(String inputND, String errorND) {
        String input;
        do {
            input = inputString(inputND + " (Y/N): ");
            if (!input.equals("Y") && !input.equals("y") && !input.equals("N") && !input.equals("n")) {
                System.out.println(errorND);
            }
        } while (!input.equals("Y") && !input.equals("y") && !input.equals("N") && !input.equals("n"));
        return (input.equals("Y") || input.equals("y"));
    }
}
