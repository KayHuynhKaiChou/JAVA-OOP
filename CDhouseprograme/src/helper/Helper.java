package helper;

import java.util.Scanner;

public class Helper {

    public static String getString(String message) {
        notice(message + " : ");
        return new Scanner(System.in).nextLine();
    }

    public static boolean getBoolean(String message) {
        String value = getString(message + "(y/n)");
        return value.equals("y");
    }

    public static void notice(String message) {
        System.out.println(message);
    }

    public static String forcedMatchesRegex(String message, String regrex) {
        boolean a = true;
        String value = null;
        while (a) {
            value = getString(message);
            a = !value.matches(regrex);
        }
        return value;
    }

}
