package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningArray {

    public static int[] runningSum(int[] nums) {
            int[] runningSum = new int[nums.length];
            int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            runningSum[i] = currentSum;
        }
        return runningSum;
    }

    public static void main(String[] args) {

        int[] nums1 = {5,7,8,9};
        System.out.println(Arrays.toString(runningSum(nums1)));
    }
}

