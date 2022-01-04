package edu.javablinov.tasks.chapter1.option_b;

import edu.javablinov.tasks.Util.ArrayUtil;
import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfIntegers = ConsoleUtil.getIntFromConsole(scanner, "Please, enter number of Integers you are going to enter -> ");
        int[] arrayIntegers = new int[numbersOfIntegers];
        arrayIntegers = ArrayUtil.setIntArray(numbersOfIntegers, scanner);

        printMinNumber(arrayIntegers);
        printMaxNumber(arrayIntegers);
    }
    static void printMinNumber(int[] array) {
        System.out.print("Min number is -->\t");
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
               minNumber = array[i];
            }
        }
        System.out.println(minNumber);
    }

    static void printMaxNumber(int[] array) {
        System.out.print("Max number is -->\t");
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println(maxNumber);
    }
}
