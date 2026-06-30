package com.dsa;

import static java.lang.Integer.parseInt;

public class StringSum {
    public static String stringSum(String num1,String num2){
        String result = "";

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;

            carry = sum / 10;
            int digit = sum % 10;

            result = digit + result;

            i--;
            j--;
        }
        return result;
    }
}
