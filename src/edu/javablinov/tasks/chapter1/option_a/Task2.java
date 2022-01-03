package edu.javablinov.tasks.chapter1.option_a;

import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strIn = ConsoleUtil.getStringFromConsole(scanner, "Please, enter args -> ");
        StringBuilder newString = new StringBuilder(strIn);
        System.out.println("Reverse args is: " + newString.reverse());

    }
}
