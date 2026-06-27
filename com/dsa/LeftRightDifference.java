package com.dsa;

import java.util.Arrays;

public class LeftRightDifference {
    public void leftRightDifference(int[] nums) {
//        int[] rightSum = new int[nums.length];
//        int[] leftSum = new int[nums.length];
        int[] result = new int[nums.length];
//        leftSum[0] = 0;
//        rightSum[nums.length-1] = 0;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            int rSum = 0;
//            for (int j = nums.length - 1; j > i; j--) {
//                rSum += nums[j];
//            }
//            rightSum[i] = rSum;
//        }
//
//        for (int i = 1; i < nums.length; i++) {
//            int lSum = 0;
//            for (int j = 0; j < i; j++) {
//                lSum += nums[j];
//            }
//            leftSum[i] = lSum;
//        }
//
//        for(int i = 0; i<nums.length; i++){
//            result[i] = Math.abs(leftSum[i] - rightSum[i]);
//        }

        int n = nums.length;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            result[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        System.out.println(Arrays.toString(result));

    }
}
