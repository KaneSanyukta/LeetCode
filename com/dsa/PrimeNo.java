package com.dsa;

import java.util.Scanner;

class PrimeNo {
//    public static void isPrime(int n) {
//        for (int i = 2; i <= n; i++) {
//            boolean temp = true;
//            for (int j = 2; j <= i - 1; j++) {
//                if (i % j == 0) {
//                    temp = false;
//                }
//            }
//            if (temp) {
//                System.out.println(i + " is Prime.");
//            } else {
//                System.out.println(i + " is not Prime.");
//            }
//        }
//    }
    public static void isPrime() {
        for (int i = 2; i <= 10000; i++) {
            boolean temp = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = false;
                    break;
                }
            }
            if (temp) {
                System.out.println(i);
            }
        }
    }
}