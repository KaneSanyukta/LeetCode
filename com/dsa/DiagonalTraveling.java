package com.dsa;

public class DiagonalTraveling {
    public static void diagonalTraveling(){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {8,9,12}
        };
        for(int col = 0; col<arr[0].length; col++){
            int r = 0;
            int c = col;

            while(c>=0 && r<arr.length){
                System.out.print(arr[r][c]+" ");
                r++;
                c--;
            }
            System.out.println();
        }

        for(int row = 0; row<arr.length; row++){
            int r = row;
            int c = arr[0].length-1;

            while(c>=0 && r<arr.length){
                System.out.print(arr[r][c]+" ");
                r++;
                c--;
            }
            System.out.println();
        }
    }
}
