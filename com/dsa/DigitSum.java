package com.dsa;

class DigitSum {
    public static int sum(int num) {
        int digit,sum=0;
        while(num!=0){
            digit = num%10;
            num = num/10;
            sum += digit;
        }
        return sum;
    }
}
