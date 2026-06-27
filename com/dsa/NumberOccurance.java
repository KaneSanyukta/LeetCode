package com.dsa;

import java.util.Scanner;

class NumberOccurance {
    public static void function() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + ":" + count);
        }
    }
}