package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    //BRUTE FORCE
        // int n = s.length();
        // int maxLength=0;

        // for(int i =0; i<n;i++){
        //     Set<Character> set = new HashSet<>();
        //     for(int j = 0; j<n; j++){
        //         char currentChar = s.charAt(j);

        //         if(set.contains(currentChar)){
        //             break;
        //         }
        //         set.add(currentChar);

        //         maxLength = Math.max(maxLength, j-i+1);
        //     }
        // }
        // return maxLength;

    // Method to find the length of the longest substring without repeating characters
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();           // Length of the string
        int maxLength = 0;            // To store the maximum length of substring found
        int left = 0;                 // Left pointer for the sliding window

        Map<Character, Integer> mp = new HashMap<>();  // Map to store the character and its index

        // Iterate with the right pointer of the sliding window
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);  // Current character at the right pointer

            // If the character is already in the map, adjust the left pointer
            if (mp.containsKey(currentChar)) {
                left = Math.max(left, mp.get(currentChar) + 1); // Move left pointer to avoid duplicates
            }

            // Update or add the character's index in the map
            mp.put(currentChar, right);

            // Update the maximum length of substring without repeating characters
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;  // Return the length of the longest substring without repeating characters
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        // Test case 1
        String s1 = "zxyzxyz";
        int result1 = solution.lengthOfLongestSubstring(s1);
        System.out.println("Length of longest substring without repeating characters in \"" + s1 + "\": " + result1);

        // Test case 2
        String s2 = "xxxx";
        int result2 = solution.lengthOfLongestSubstring(s2);
        System.out.println("Length of longest substring without repeating characters in \"" + s2 + "\": " + result2);

        // Test case 3
        String s3 = "abcabcbb";
        int result3 = solution.lengthOfLongestSubstring(s3);
        System.out.println("Length of longest substring without repeating characters in \"" + s3 + "\": " + result3);

        // Test case 4: Edge case (empty string)
        String s4 = "";
        int result4 = solution.lengthOfLongestSubstring(s4);
        System.out.println("Length of longest substring without repeating characters in \"" + s4 + "\": " + result4);
    }
}
