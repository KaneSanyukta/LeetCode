package com.dsa;

import java.util.Scanner;

public class ArraySum {
    int arraySum(int arr[],int size){
        int sum=0;
        for(int i =0;i<size;i++) {
            sum += arr[i];
        }
        return sum;
    }

    int getLargestEle(int arr[],int size){
        int largest=0;
        for(int i =0;i<size;i++) {
            largest = Math.max(largest,arr[i]);
        }
        return largest;
    }

    int getSmallestEle(int arr[],int size){
        int smallest=0;
        for(int i =0;i<size;i++) {
            smallest = Math.min(smallest,arr[i]);
        }
        return smallest;
    }

    public void getArray(){
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        do{
            System.out.print("1.Sum array element\t2. Found largest element 3. Found minimum element 4. Exit \nEnter choice:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Array Sum:"+ arraySum(arr,size));
                    break;
                case 2:
                    System.out.println("Largest Element:"+getLargestEle(arr,size));
                    break;
                case 3:
                    System.out.println("Smallest Element:"+getSmallestEle(arr,size));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice!=4);

    }
}
