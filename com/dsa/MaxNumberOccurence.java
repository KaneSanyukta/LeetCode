package com.dsa;

import java.util.Scanner;

public class MaxNumberOccurence {
    public static void function() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount =0,maxEle=0;
        for (int i = 0; i < size; i++) {
            int count = 1;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                maxEle=arr[i];
            }
        }
        System.out.print(maxEle+" : "+maxCount);
    }
}
