package com.dsa;

public class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        int result = -1;
        for (int pile : piles) {
            if (right < pile) {
                right = pile;
            }
        }
        while(left<=right){
            int mid = (left+right)/2;
            int hr = getHours(mid,piles);
            if(hr>h){
                result = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }

    public int getHours(int mid,int[] arr){
        int hr = 0;
        for(int i =0;i< arr.length;i++){
            hr +=Math.ceil((double) arr[i]/mid);
        }
        return hr;
    }
}
