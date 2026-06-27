package com.dsa;

public class ArmstrongNumber {
    public static boolean isArmstrong(int digit,int num){
        int d,sum=0,temp=num;
        while (num!=0){
            d = num %10;
            num = num / 10;
            sum += (int)Math.pow(d,digit);
        }
        return temp == sum;
    }
}
