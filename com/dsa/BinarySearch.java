package com.dsa;

import java.util.Arrays;

public class BinarySearch {
    public int search(int target,int[] arr){
        Arrays.sort(arr);
        int left,right,mid;
        left = 0;
        right = arr.length-1;

        while(left<=right){
            mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid + 1;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
