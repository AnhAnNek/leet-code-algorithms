package com.vanannek.longestincreasingsubsequence;

import java.util.Arrays;

public class NormalSolver implements LongestIncreasingSub {
    @Override
    public int lengthOfLIS(int[] nums) {
        final int[] standard = standard(nums);
        int[] subSize = new int[standard.length];
        subSize[0] = 1;
        subSize[1] = 2;

        for (int i = 2; i < standard.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (standard[i] > standard[j]) {
                    subSize[i] = Math.max(subSize[i], subSize[j] + 1);
                }
            }
        }

        return subSize[standard.length - 1] - 2;
    }

    public int[] standard(int[] nums) {
        int[] result = new int[nums.length + 2];
        result[0] = Integer.MIN_VALUE;
        result[nums.length + 1] = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++)
            result[i + 1] = nums[i];
        return result;
    }
}
