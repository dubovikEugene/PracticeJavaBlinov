package edu.javablinov.tasks.Util;

import java.util.Scanner;

public class ConsoleUtil {
    public static String getStringFromConsole(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

}
