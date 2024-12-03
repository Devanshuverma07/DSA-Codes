package Basics.ArraysQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

class TwoSum {

    // Brute Force Approach
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // Sorting Approach
    public int[] twoSumSorting(int[] nums, int target) {
        int[][] A = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i];
            A[i][1] = i;
        }

        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = A[i][0] + A[j][0];
            if (cur == target) {
                return new int[]{Math.min(A[i][1], A[j][1]), Math.max(A[i][1], A[j][1])};
            } else if (cur < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }

    // HashMap Two Pass Approach
    public int[] twoSumHashMapTwoPass(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }
        return new int[0];
    }

    // Optimized HashMap (One Pass) Approach
    public int[] twoSumHashMapOnePass(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            // Check if the difference is already in the map
            if (indices.containsKey(diff)) {
                return new int[]{indices.get(diff), i};  // Return the indices
            }

            // Store the current number and its index
            indices.put(nums[i], i);
        }

        return new int[0];  // If no pair is found
    }

    // Main method to test all approaches
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

         // Test Case 1: nums = [3, 4, 5, 6], target = 7
         int[] nums1 = {3, 4, 5, 6};
         int target1 = 7;
         int[] result1 = solution.twoSumHashMapOnePass(nums1, target1);
         System.out.println("Test Case 1 - HashMap One Pass Indices: " + Arrays.toString(result1));
 
         // Test Case 2: nums = [4, 5, 6], target = 10
         int[] nums2 = {4, 5, 6};
         int target2 = 10;
         int[] result2 = solution.twoSumHashMapOnePass(nums2, target2);
         System.out.println("Test Case 2 - HashMap One Pass Indices: " + Arrays.toString(result2));
 
         // Test Case 3: nums = [5, 5], target = 10
         int[] nums3 = {5, 5};
         int target3 = 10;
         int[] result3 = solution.twoSumHashMapOnePass(nums3, target3);
         System.out.println("Test Case 3 - HashMap One Pass Indices: " + Arrays.toString(result3));

         int[] nums4 = {2,6,4,5,7};
         int target4 = 13;
         int[] result4 = solution.twoSumBruteForce(nums4, target4);
         System.out.println("Test Case 4 - Brute Force Indices: " + Arrays.toString(result4));
    }
}
