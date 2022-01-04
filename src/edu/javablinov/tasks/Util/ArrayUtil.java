package edu.javablinov.tasks.Util;

import java.util.Scanner;

public class ArrayUtil {
    public static void printlnArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] setIntArray(int arrayLength, Scanner scanner) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = ConsoleUtil.getIntFromConsole(scanner, "Please, enter integer -> ");
        }
        return array;
    }
}
