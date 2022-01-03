package edu.javablinov.tasks.chapter1.option_a;

public class Task2 {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0 ; i--) {
            System.out.println("Argument [" + i + "]: " + args[i]);
        }

    }
}
