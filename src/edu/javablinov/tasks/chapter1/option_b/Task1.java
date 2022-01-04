package edu.javablinov.tasks.chapter1.option_b;

import edu.javablinov.tasks.Util.ArrayUtil;
import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfIntegers = ConsoleUtil.getIntFromConsole(scanner, "Please, enter number of Integers you are going to enter -> ");
        int[] arrayIntegers = new int[numbersOfIntegers];
        arrayIntegers = ArrayUtil.setIntArray(numbersOfIntegers, scanner);

        printEvenNumbers(arrayIntegers);
        printUnevenNumbers(arrayIntegers);

    }

    static void printEvenNumbers(int[] array) {
        System.out.print("Even numbers -->\t");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    static void printUnevenNumbers(int[] array) {
        System.out.print("Uneven numbers -->\t");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
