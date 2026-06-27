package com.dsa;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
//        PrimeNo.isPrime(num);
        System.out.println("Sum of digits of number "+num+": "+DigitSum.sum(num));
    }
}
