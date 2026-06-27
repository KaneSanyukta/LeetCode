package com.dsa;

import java.util.Scanner;

public class ReverseArray {
    private static int arr[],size;
    public static int[] revereArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        size = sc.nextInt();
        arr = new int[size];
//        int revArr[] = new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
//        int j=0;
//        for(int i=size-1;i>=0;i--){
//            revArr[j++] = arr[i];
//        }
//
        int start = 0;
        int end = size-1;
        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }
}
