package edu.javablinov.tasks.chapter1.option_b;

import edu.javablinov.tasks.Util.ArrayUtil;
import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfIntegers = ConsoleUtil.getIntFromConsole(scanner, "Please, enter number of Integers you are going to enter -> ");
        int[] arrayIntegers = new int[numbersOfIntegers];
        arrayIntegers = ArrayUtil.setIntArray(numbersOfIntegers, scanner);

        System.out.print("Ascending sort ->\t");
        ArrayUtil.printArray(ArrayUtil.bubbleSortAscending(arrayIntegers));
        System.out.print("Descending sort ->\t");
        ArrayUtil.printArray(ArrayUtil.bubbleSortDescending(arrayIntegers));
    }
}
