package com.bridgelabz.Day5.FunctionalProgram;

import java.util.Scanner;

public class DistanceJava {
    public static void main(String[] args) {
        System.out.println("Enter x and y coordinates of a point: ");
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        int y= input.nextInt();
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("Length of line between ("+x+", "+y+") and (0, 0) is: "+String.format("%.3f", distance));
    }
}
