package com.dsa;

class SecondLargest {
    public static int secondLargest(int num) {
        int largest = -1;
        int secondLargest = -1;

        while (num != 0) {
            int digit = num % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            num = num / 10;
        }

        return secondLargest;
    }
}