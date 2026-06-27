package com.dsa;

import java.util.Scanner;

public class LiniarSearch {
    private int arr[],size;
    private  int search(int ele){
        int index=-1;
        for(int i=0;i<size;i++){
            if(arr[i]==ele){
                index= i+1;
            }
        }
        return index;
    }

    public void getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        size = sc.nextInt();
        arr= new int[size];
        System.out.println("Enter array elements");

        for(int i=0;i<size;i++){
            System.out.print("Element No "+(i+1)+": ");
             arr[i] = sc.nextInt();
        }

        System.out.print("Enter Search Element:");
        int e = sc.nextInt();
        if(search(e)==-1){
            System.out.print("Element not found!");
        }else{
            System.out.print("Element found at "+search(e)+" index.");
        }
    }
}
