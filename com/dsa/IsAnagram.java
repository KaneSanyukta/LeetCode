package com.dsa;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String s, String t){
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar); Arrays.sort(tChar);
        return s.length() == t.length() && new String(sChar).equals(new String(tChar));

        // Optimal approach


    }
}
