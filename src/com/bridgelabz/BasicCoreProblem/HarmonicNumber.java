package com.bridgelabz.Day5.BasicCoreProblem;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        double harmonic = 0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }
        System.out.printf("The %dth harmonic number is %.2f\n", n, harmonic);
    }
}
