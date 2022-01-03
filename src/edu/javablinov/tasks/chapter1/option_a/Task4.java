package edu.javablinov.tasks.chapter1.option_a;

import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userPassord = "qwerty123";
        String passwordFromConsole = ConsoleUtil.getStringFromConsole(scanner, "Please, enter your password: ");
        if(userPassord.equals(passwordFromConsole)) {
            System.out.println("Correct password");
        } else {
            System.out.println("ERROR, WRONG PASSWORD");
        }

    }
}
