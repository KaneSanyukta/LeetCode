package com.dsa;

public class UpperBound {
    public int upperBound(int[] arr,int target){
        int left = 0, right = arr.length -1;
        int mid = -1;

        while(left<=right){
            mid = (left +right)/2;

            if(arr[mid] == target){
                left = mid + 1;
            }else if(arr[mid]>target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return mid;
    }
}
