package com.dsa;

public class ZikZakMatrix {
    public static void printMatrix(){
        int[][] arr = {
                {1, 2, 3}, {1, 2, 3}, {1, 2, 3}
        };

        for(int row=0; row< arr.length; row++){
            if(row%2==0){
                for(int col = 0; col<arr[0].length; col++ ){
                    System.out.print(arr[row][col]+" ");
                }
            }else{
                for(int col = arr[0].length-1; col>=0; col-- ){
                    System.out.print(arr[row][col]+" ");
                }
            }
            System.out.println();
        }
    }
}
