package com.dsa;

public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int sum,maxSum=Integer.MIN_VALUE;

        for(int row = 0; row<accounts.length;row++){
            sum = 0;
            for(int col = 0; col<accounts[0].length; col++){
                sum+=accounts[row][col];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
