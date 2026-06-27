package com.dsa;

import java.util.Scanner;

public class SubArrayMax {
    private static int arr[],size;
    private static void getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size:");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static int maxSum(){
        getArray();
        int maxSum=0,sum=0;
        for(int i=0;i<size;i++){
            sum=0;
            for(int j =0;j<size;j++){
                sum+=arr[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    public static int optimizeMaxSum(){
        getArray();
        int sum=0,maxSum=Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            sum+=arr[i];
            maxSum = Math.max(sum,maxSum);

            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }

}
