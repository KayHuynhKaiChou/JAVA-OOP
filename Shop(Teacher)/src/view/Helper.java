package view;

import java.util.Scanner;

public class Helper {
    public static String getString(String msg){
        System.out.print(msg+" : ");
        return new Scanner(System.in).nextLine();
    }
//---------------------------------------------
    public static int getInt(String msg){
        System.out.print(msg+" : ");
        return new Scanner(System.in).nextInt();
    }
//---------------------------------------------
    public static double getDouble(String msg){
        System.out.print(msg+" : ");
        return new Scanner(System.in).nextDouble();
    }
    
}
