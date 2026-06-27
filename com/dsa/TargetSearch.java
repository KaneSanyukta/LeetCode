package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSearch {
    int arr[],size;
    public int[] search(int target){
        int ans[] = new int[2];
        for(int i=0;i<size;i++){
            for(int j = i+1;j<size; j++){
                if(arr[i]+arr[j]==target){
                    ans[0] =i+1;
                    ans[1] =j+1;
                    break;
                }
            }
        }
        return ans;
    }

    public  void getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        this.size = sc.nextInt();
        this.arr= new int[this.size];
        System.out.println("Enter array elements");

        for(int i=0;i<this.size;i++){
            System.out.print("Element No "+(i+1)+": ");
            this.arr[i] = sc.nextInt();
        }

        System.out.print("Enter target:");
        int e = sc.nextInt();
        System.out.print("Indies:"+ Arrays.toString(search(e)));
    }
}
