package com.dsa;

import java.util.Arrays;

public class RevereStringWords {
    public static String revereStringWords(String str){
        String[] strArr = str.split(" ");
        int left = 0;
        int right = strArr.length-1;
        while (left<right){
            String temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;
//            for(int j=strArr[i].length()-1; j>=0;j--){
//                result.append(strArr[i].charAt(j));
//            }
//            result.append(" ");
            right--;
            left++;
        }
        return Arrays.toString(strArr);
    }
}
