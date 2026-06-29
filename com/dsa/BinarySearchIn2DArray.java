package com.dsa;

public class BinarySearchIn2DArray {
    public static boolean binarySearchIn2DArray(){
        int[][] arr = {
                {-5}
        };
        int target = 3;
        // Linear search

//        for(int row = 0; row<arr.length; row++){
//            for(int col = 0; col<arr[0].length; col++){
//                if(arr[row][col]==target){
//                    return true;
//                }
//            }
//        }

        // Half Binary Search

//        for(int row = 0; row<arr.length; row++){
//            int left = 0;
//            int right = arr.length-1;
//
//            while (left<=right){
//                int mid = (left+right)/2;
//
//                if(arr[row][mid]==target){
//                    return true;
//                }else if(arr[row][mid]>target){
//                    right = mid -1;
//                }else{
//                    left = mid + 1;
//                }
//            }
//        }

        // Complete Binary Search

//        int left = 0;
//        int r = arr.length;
//        int c = arr[0].length;
//        int right = (r * c) - 1;
//
//        while(left<=right){
//
//            int mid = (left + right)/2;
//            int row = mid / c;
//            int col = mid % c;
//            if(arr[row][col]==target){
//                return true;
//            }else if(arr[row][col]>target){
//                right = mid -1;
//            }else{
//                left = mid + 1;
//            }
//
//        }

        // Search in sorted only rows and cols not complete matrix
        int row = 0;
        int col = arr[0].length - 1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return true;
            }else if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
