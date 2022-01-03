package edu.javablinov.tasks.chapter1.option_a;

import edu.javablinov.tasks.Util.ConsoleUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String developerFullName = ConsoleUtil.getStringFromConsole(scanner, "Please, enter Full Name: -> \t");
        System.out.println("Developer Full Name: " + developerFullName);

        Date dateReceivingTask = getDateReceivingTask();
        System.out.println("Date of receiving task: " + dateReceivingTask);
        Date dateFinishTask = new Date();
        System.out.println("Date of finish task: " + dateFinishTask);
    }
    static Date getDateReceivingTask (){
        Calendar calendar = new GregorianCalendar(2022, 0, 2);
        Date dateReceivingTask = calendar.getTime();
        return dateReceivingTask;
    }

}
