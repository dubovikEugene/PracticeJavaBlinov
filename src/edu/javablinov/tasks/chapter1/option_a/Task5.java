package edu.javablinov.tasks.chapter1.option_a;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Argumets sum = " + getArgsSum(args));
        System.out.println("Argumets multiplay = " + getArgsMultiplay(args));
    }

    private static int getArgsSum(String[] args){
        int argsSum = 0;
        for (int i = 0; i <args.length; i++) {
            argsSum += Integer.parseInt(args[i]);
        }
        return argsSum;
    }
    private static int getArgsMultiplay(String[] args){
        int argsMultiplay = Integer.parseInt(args[0]);
        for (int i = 0; i <args.length; i++) {
            argsMultiplay *= Integer.parseInt(args[i]);
        }
        return argsMultiplay;
    }

}
