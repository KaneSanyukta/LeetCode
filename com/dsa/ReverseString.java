package com.dsa;

public class ReverseString {
    public static String reverseString(String str){
        // less optimal because every time it creates a new string when we use rev+= str.charAt[i]
//        String revStr ="";
//        int i = str.length()-1;
//
//        while(i>=0){
//            revStr += str.charAt(i);
//            i--;
//        }
//        return revStr;

        // Optimal one

//        char[] strArr = str.toCharArray();
//
//        int left = 0;
//        int right = str.length() - 1;
//
//        while(right>left){
//            char temp = strArr[left];
//            strArr[left] = strArr[right];
//            strArr[right] = temp;
//
//            right--;
//            left++;
//        }
//        return new String(strArr);

        // Using string builder

        StringBuilder revStr = new StringBuilder();

        for(int i = str.length()-1; i>=0; i--){
            revStr.append(str.charAt(i));
        }

        return new String(revStr);
    }
}
