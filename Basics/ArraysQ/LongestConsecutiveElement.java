package Basics.ArraysQ;

// import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveElement {

    // Brute Force Approach (commented out)
    /*
    public int longestConsecutiveBruteForce(int[] nums) {
        int maxLength = 0;

        // Iterate through each number in the array
        for (int num : nums) {
            int currentNum = num;
            int length = 1;

            // Check for the next consecutive numbers
            while (contains(nums, currentNum + 1)) {
                currentNum += 1;
                length++;
            }

            // Update the maxLength if the current sequence is longer
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    // Helper method to check if the array contains a target number
    private static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    */

    // Sorting Approach (commented out)
    /*
    public int longestConsecutiveSorting(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums); // Sort the array
        int maxLength = 1, currentLength = 1;

        // Iterate through the sorted array to find consecutive sequences
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // Skip duplicate elements
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                // If numbers are consecutive, increase the sequence length
                currentLength++;
            } else {
                // Reset the current length for a new sequence
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        // Return the maximum length of the sequence
        return Math.max(maxLength, currentLength);
    }
    */

    // HashSet Approach
    public int longestConsecutiveHashSet(int[] nums) {
        if (nums.length == 0) return 0;

        // Using a HashSet to store all unique elements from the array
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0; // Variable to store the maximum length of the consecutive sequence

        // Iterate through each number in the array
        for (int num : nums) {
            // Check if this number is the start of a potential sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1; // Start with a sequence length of 1

                // Check for the next consecutive numbers and count the length of the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum += 1; // Move to the next number in the sequence
                    length++; // Increase the length of the sequence
                }

                // Update the maxLength if the current sequence is longer
                maxLength = Math.max(maxLength, length);
            }
        }

        // Return the maximum length of consecutive sequence found
        return maxLength;
    }

    public static void main(String[] args) {
        LongestConsecutiveElement solution = new LongestConsecutiveElement();

        // Test case for HashSet approach
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length (HashSet): " + solution.longestConsecutiveHashSet(nums));

        // Test case for Sorting approach (commented out in code)
        /*
        int[] nums2 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length (Sorting): " + solution.longestConsecutiveSorting(nums2));
        */

        // Test case for Brute Force approach (commented out in code)
        /*
        int[] nums3 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length (Brute Force): " + solution.longestConsecutiveBruteForce(nums3));
        */
    }
}
