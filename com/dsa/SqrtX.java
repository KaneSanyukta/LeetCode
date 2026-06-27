package com.dsa;

public class SqrtX {
    public int mySqrt(int x) {
        int left = 1 , right = x, ans = 0;

        while(left<=right){
            int mid = (left + right) / 2;

            if(mid * mid == x){
                return mid;
            } else if (mid * mid > x) {
                right = mid - 1;
            }else{
                ans = mid;
                left = mid + 1;
            }
        }

        return ans;
    }
}
