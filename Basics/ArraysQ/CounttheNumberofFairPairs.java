package Basics.ArraysQ;

import java.util.Arrays;

public class CounttheNumberofFairPairs {

    public static void main(String[] args) {    
    CounttheNumberofFairPairs solution = new CounttheNumberofFairPairs();
    // Test case 1
    int[] nums1 = {0, 1, 7, 4, 4, 5};
    int lower1 = 3;
    int upper1 = 6;
    System.out.println("Output for Test Case 1: " + solution.countFairPairs(nums1, lower1, upper1));
    // Expected output: 6

    // Test case 2
    int[] nums2 = {1, 7, 9, 2, 5};
    int lower2 = 11;
    int upper2 = 11;
    System.out.println("Output for Test Case 2: " + solution.countFairPairs(nums2, lower2, upper2));
    // Expected output: 1
    }

    public long countFairPairs(int[] nums, int lower, int upper){
        Arrays.sort(nums);
        return countLess(nums, upper) - countLess(nums, lower-1);
    }

    private long countLess(int[] nums, int sum) {
        long res = 0;
        for (int i = 0, j = nums.length - 1; i < j; ++i) {
            while (i < j && nums[i] + nums[j] > sum)
                --j;
            res += j - i;
        }
        return res;
    }
}
