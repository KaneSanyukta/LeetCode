package com.dsa;

public class RowWiseData {
    public static void rowWiseData() {
        int[][] arr = {
                {1, 2, 3}, {1, 2, 3}, {1, 2, 3}
        };

        for(int col=0; col< arr[0].length; col++){
            for (int[] ints : arr) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
    }
}
