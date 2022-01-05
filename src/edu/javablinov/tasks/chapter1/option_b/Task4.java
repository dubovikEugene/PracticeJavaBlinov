package edu.javablinov.tasks.chapter1.option_b;

import edu.javablinov.tasks.Util.ArrayUtil;
import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfIntegers = ConsoleUtil.getIntFromConsole(scanner, "Please, enter number of Integers you are going to enter -> ");
        int[] arrayIntegers = new int[numbersOfIntegers];
        arrayIntegers = ArrayUtil.setIntArray(numbersOfIntegers, scanner);

        printNumbersMultiplies3or9(arrayIntegers);
    }
    static void printNumbersMultiplies3or9(int[] array) {
        System.out.print("Numbers multiplies of 5 and 7 -->\t");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] % 7 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
