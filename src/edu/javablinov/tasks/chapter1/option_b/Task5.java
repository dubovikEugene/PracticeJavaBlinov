package edu.javablinov.tasks.chapter1.option_b;

import edu.javablinov.tasks.Util.ArrayUtil;
import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int temp1;
        int temp2;
        int temp3;
        for (int i = 100; i < 1000; i++) {
            temp1 = i / 100;
            temp2 = (i - (temp1 * 100)) / 10;
            temp3 = (i - (temp1 * 100) - (temp2 * 10));
            if (temp1 != temp2 && temp1 != temp3 && temp2 != temp3) {
                System.out.print(i + " ");
            }
        }

    }
}

