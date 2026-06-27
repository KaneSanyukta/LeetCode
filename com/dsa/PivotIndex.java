package com.dsa;


public class PivotIndex {
    public void pivotIndex(int[] nums) {

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum += nums[i];
        }

        System.out.println(-1);
    }
}
