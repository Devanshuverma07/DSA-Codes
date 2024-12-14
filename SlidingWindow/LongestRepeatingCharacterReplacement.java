package SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    
    // Brute Force Approach (Commented Out)
    public int characterReplacementBruteForce(String s, int k) {
        int n = s.length();
        int maxLength = 0;

        // Brute force all substrings
        for (int start = 0; start < n; start++) {
            // Initialize frequency array for each new starting point
            int[] freq = new int[26];
            int maxFreq = 0;
            int replacements = 0;

            for (int end = start; end < n; end++) {
                // Update frequency of the current character
                char currentChar = s.charAt(end);
                freq[currentChar - 'A']++;

                // Update the maximum frequency of the most frequent character
                maxFreq = Math.max(maxFreq, freq[currentChar - 'A']);

                // Calculate the number of replacements needed to make all characters the same
                replacements = (end - start + 1) - maxFreq;

                // If the replacements exceed k, break out of the loop early
                if (replacements > k) {
                    break;
                }

                // Update maxLength if the current window is valid
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
    }

    // Optimized Sliding Window Approach
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLength = 0;
        int[] freq = new int[26];  // Frequency array for 'A' to 'Z'
        int maxFreq = 0;  // Max frequency of the most frequent character in the current window
        int start = 0;  // Left pointer of the sliding window

        // Iterate with the right pointer 'end'
        for (int end = 0; end < n; end++) {
            freq[s.charAt(end) - 'A']++;  // Increase the count of the current character

            maxFreq = Math.max(maxFreq, freq[s.charAt(end) - 'A']);  // Update the max frequency in the window

            // Calculate how many replacements are needed to make all characters in the window the same
            int replacement = (end - start + 1) - maxFreq;

            // If the replacements exceed 'k', shrink the window from the left
            if (replacement > k) {
                freq[s.charAt(start) - 'A']--;  // Decrease the frequency of the character at 'start'
                start++;  // Move the 'start' pointer to the right
            }

            // Update the maxLength with the current valid window length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    // Main function to test the code
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();

        // Brute Force Approach Test Case (commented out in the code)
        // System.out.println(solution.characterReplacementBruteForce("XYYX", 2));  // Expected output: 4
        // System.out.println(solution.characterReplacementBruteForce("AAABABB", 1));  // Expected output: 5

        // Optimized Sliding Window Approach Test Cases
        System.out.println(solution.characterReplacement("XYYX", 2));  // Expected output: 4
        System.out.println(solution.characterReplacement("AAABABB", 1));  // Expected output: 5
        System.out.println(solution.characterReplacement("ABAB", 2));  // Expected output: 4
        System.out.println(solution.characterReplacement("AABABBA", 1));  // Expected output: 4
    }
}
