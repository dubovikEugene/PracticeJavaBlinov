package edu.javablinov.tasks.chapter1.option_a;

import edu.javablinov.tasks.Util.ArrayUtil;
import edu.javablinov.tasks.Util.ConsoleUtil;

import java.sql.Array;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountNumbers = ConsoleUtil.getIntFromConsole(scanner, "Please, enter amount of random numbers ");
        int[] arrayRandomNumbers = new int[amountNumbers];
        for (int i = 0; i < arrayRandomNumbers.length; i++) {
            arrayRandomNumbers[i] = (int) (Math.random() * 1000000);
        }
        ArrayUtil.printArray(arrayRandomNumbers);
        ArrayUtil.printlnArray(arrayRandomNumbers);
    }


}
