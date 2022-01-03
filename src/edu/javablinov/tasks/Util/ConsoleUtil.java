package edu.javablinov.tasks.Util;

import java.util.Scanner;

public class ConsoleUtil {
    public static String getStringFromConsole(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntFromConsole(Scanner scanner, String prompt) {
        System.out.print(prompt);
        int counter = 4;
        while (!scanner.hasNextInt()) {
            scanner.next();
            counter--;
            if(counter != 0) {
                System.out.print("it`s not integer number,\n you have: " + counter + " tries -> ");
            } else {
                System.out.println("Sorry, try next time");
                System.exit(1);
            }
        }
        return scanner.nextInt();
    }

}
