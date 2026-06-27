package com.dsa;

class NumberPrimeFactor {
    public static void primeFactors(int num){
        int div = 2;
        while(num!=1){
            if(num%div==0){
                System.out.print(div+" ");
                num/=div;
            }else{
                div+=1;
            }
        }
    }
}
