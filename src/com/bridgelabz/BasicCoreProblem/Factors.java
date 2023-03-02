package com.bridgelabz.Day5.BasicCoreProblem;

import java.util.Scanner;

    public class Factors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();

        System.out.print("The prime factors of " + n + " are: ");

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 1) {
            System.out.print(n);
        }

    }

}
