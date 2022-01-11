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

    public static int[] bubbleSortAscending(int[] array) {
        boolean isSorted = false;
        int temp = array[0];
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 ; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSortDescending(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] > array[i - 1]) {
                    isSorted = false;
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
