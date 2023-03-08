package helper;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {

    private String title;
    private ArrayList<T> options;

    public Menu() {
    }

    public abstract void execute(int n);

    public Menu(String title, String[] options) {
        this.title = title;
        this.options = new ArrayList<>();
        for (String s : options) {
            this.options.add((T) s);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + "." + options.get(i));
        }
        System.out.println("--------------------------------");
    }

    public int getSelected() {
        System.out.print("Enter selection..");
        return new Scanner(System.in).nextInt();
    }

    public void run() {
        while (true) {
            display();
            int n = getSelected();
            execute(n);
            if (n == 0) {
                break;
            }
        }
    }

    public void runOnetime() {
        display();
        int n = getSelected();
        execute(n);
    }
}
