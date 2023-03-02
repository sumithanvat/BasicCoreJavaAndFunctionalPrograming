package com.bridgelabz.Day5.BasicCoreProblem;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a alphabet");
        char alphabet=input.next().charAt(0);
        switch (alphabet){
            case 'a':
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println("given alphabet is vowel");
                break;
            default:
                System.out.println("given alphabet is cansonant");


        }


    }
}
