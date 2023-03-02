package com.bridgelabz.Day5.BasicCoreProblem;

public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 0 || n >= 31) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i <= n; i++) {
            System.out.println((int) Math.pow(2, i));
        }
    }
}

