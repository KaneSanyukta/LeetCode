package com.dsa;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long left = 1 , right = num;

        while(left<=right){
            long mid = (left + right) / 2;
            if(mid * mid == num){
                return mid % 10 == 0 || mid % 1 == 0;
            } else if (mid * mid > num) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}
