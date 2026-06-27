package com.dsa;

class DigitCount {
    public static int count(int num){
        int digit=0;
        while(num!=0){
            num = num/10;
            digit+=1;
        }
        return digit;
    }
}
