package Basics.ArraysQ;

import java.util.Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                // Swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            
            // Move pointers
            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }
        
        return nums;
    }

    public static void main(String[] args) {
        SortArrayByParity sorter = new SortArrayByParity();
        
        int[] nums = {3, 1, 2, 4};
        int[] sortedArray = sorter.sortArrayByParity(nums);
        
        System.out.print("Sorted array by parity: ");
        System.out.println(Arrays.toString(sortedArray)); // Output: [2, 4, 3, 1]
    }
}
