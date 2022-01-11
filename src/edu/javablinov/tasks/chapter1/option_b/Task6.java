package edu.javablinov.tasks.chapter1.option_b;

import edu.javablinov.tasks.Util.ArrayUtil;
import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfIntegers = ConsoleUtil.getIntFromConsole(scanner, "Please, enter number of Integers you are going to enter -> ");
        int[] arrayIntegers = new int[numbersOfIntegers];
        arrayIntegers = ArrayUtil.setIntArray(numbersOfIntegers, scanner);

        printPrimeNumbers(arrayIntegers);
    }
    static void printPrimeNumbers (int[] array){
        System.out.print("Prime numbers is --> ");
        for (int j : array) {
            if (isPrime(j)) {
                System.out.print(j + " ");
            }
        }
    }
    static boolean isPrime(int num) {
        double sqrt = Math.sqrt(num);
        if (num < 1){
            return false;
        }
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
