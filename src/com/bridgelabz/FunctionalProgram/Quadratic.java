package com.bridgelabz.Day5.FunctionalProgram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Enter values of a, b and c to find roots of  a*x*x + b*x + c: ");
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int delta = (b*b)-(4*a*c);
        double root1 = (-b + Math.sqrt(delta))/(2*a);
        double root2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("Root 1 of x: "+root1);
        System.out.println("Root 2 of x: "+root2);
    }
}
