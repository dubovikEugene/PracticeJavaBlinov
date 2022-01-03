package edu.javablinov.tasks.chapter1.option_a;

import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = ConsoleUtil.getStringFromConsole(scanner, "Please, enter your name -> ");
        System.out.println("Hello, " + username);
    }
}
