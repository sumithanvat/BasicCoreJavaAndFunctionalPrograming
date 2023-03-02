package com.bridgelabz.Day5.FunctionalProgram;

import java.util.Scanner;

public class SumOfThreeAddZero {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner input=new Scanner(System.in);
        int arraySize= input.nextInt();
        System.out.println("Enter "+arraySize+" elements of array: ");
        int arr[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = input.nextInt();
        }
        findTriplets(arr, arraySize);
    }
    public static void findTriplets(int arr[], int arraySize){
        boolean tripletFound = false;
        for (int i = 0; i < arraySize-2; i++) {
            for (int j = i+1; j < arraySize-1; j++) {
                for (int k = j+1; k < arraySize; k++) {
                    if (arr[i]+arr[j]+arr[k] == 0){
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.println();
                        tripletFound = true;
                    }
                }
            }
        }
        if (tripletFound == false)
            System.out.println("Such triplet does not exist ");
    }
}
