package Basics.ArraysQ;

import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSumII {

    // HashMap Approach
    public int[] twoSumWithHashMap(int[] numbers, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i]; // Calculate complement
            if (mp.containsKey(tmp)) {
                // If complement is found, return the indices (1-indexed)
                return new int[] { mp.get(tmp), i + 1 };
            }
            // Store the number and its 1-indexed position in the map
            mp.put(numbers[i], i + 1);
        }
        return new int[0]; // Return an empty array if no solution is found
    }

    // Binary Search Approach
    public int[] twoSumWithBinarySearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int l = i + 1, r = numbers.length - 1; // Set pointers for binary search
            int tmp = target - numbers[i]; // Calculate complement
            
            while (l <= r) {
                int mid = l + (r - l) / 2; // Calculate middle index
                if (numbers[mid] == tmp) {
                    // If complement is found, return the indices (1-indexed)
                    return new int[] { i + 1, mid + 1 };
                } else if (numbers[mid] < tmp) {
                    l = mid + 1; // Move the left pointer to the right
                } else {
                    r = mid - 1; // Move the right pointer to the left
                }
            }
        }
        return new int[0]; // Return an empty array if no solution is found
    }

    // Optimized Two Pointer Approach
    public int[] twoSumWithTwoPointers(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 }; // Return the 1-indexed positions
            } else if (sum < target) {
                i++; // Increase left pointer to increase the sum
            } else {
                j--; // Decrease right pointer to decrease the sum
            }
        }
        return new int[] {}; // Return empty array if no solution is found
    }

    // Main method to test all three approaches
    public static void main(String[] args) {
        TwoIntegerSumII solution = new TwoIntegerSumII();

        // Example test case 1
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;

        System.out.println("Testing HashMap Approach:");
        int[] result1 = solution.twoSumWithHashMap(numbers1, target1);
        System.out.println("Indices: " + result1[0] + ", " + result1[1]);  // Expected output: [1, 2]
        
        System.out.println("\nTesting Binary Search Approach:");
        int[] result2 = solution.twoSumWithBinarySearch(numbers1, target1);
        System.out.println("Indices: " + result2[0] + ", " + result2[1]);  // Expected output: [1, 2]
        
        System.out.println("\nTesting Two Pointer Approach:");
        int[] result3 = solution.twoSumWithTwoPointers(numbers1, target1);
        System.out.println("Indices: " + result3[0] + ", " + result3[1]);  // Expected output: [1, 2]

        // Example test case 2 (to test with different inputs)
        int[] numbers2 = {1, 2, 3, 4};
        int target2 = 5;

        System.out.println("\nTesting HashMap Approach (Case 2):");
        int[] result4 = solution.twoSumWithHashMap(numbers2, target2);
        System.out.println("Indices: " + result4[0] + ", " + result4[1]);  // Expected output: [1, 4]
        
        System.out.println("\nTesting Binary Search Approach (Case 2):");
        int[] result5 = solution.twoSumWithBinarySearch(numbers2, target2);
        System.out.println("Indices: " + result5[0] + ", " + result5[1]);  // Expected output: [1, 4]
        
        System.out.println("\nTesting Two Pointer Approach (Case 2):");
        int[] result6 = solution.twoSumWithTwoPointers(numbers2, target2);
        System.out.println("Indices: " + result6[0] + ", " + result6[1]);  // Expected output: [1, 4]
    }
}
