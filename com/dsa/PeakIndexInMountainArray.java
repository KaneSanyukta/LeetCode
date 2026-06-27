package com.dsa;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1,peak=0;

        while(left<=right){
            int mid = (left + right)/2;

            if(arr[mid]<arr[mid+1]){
                left = mid + 1;
            } else if(arr[mid]<arr[mid-1]){
                right = mid - 1;
            }else{
                peak = mid;
                break;
            }
        }
        return peak;
    }
}
