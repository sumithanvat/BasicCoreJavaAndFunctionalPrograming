package com.bridgelabz.Day5.BasicCoreProblem;
import java.util.Scanner;
        public class LeapYear {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a year: ");
                int year = sc.nextInt();

                if (year < 1000) {
                    System.out.println("Invalid year: Year should be greater than or equal to 1582.");
                } else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }

                sc.close();
            }
        }
