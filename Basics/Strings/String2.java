package Basics.Strings;

//Input: a2b3c4
//Output: aabbbcccc

//Optimized Solution
//TC: O(n+m)
//SC:O(m)

// public class String2 {
//     public static String expandStringOptimized(String input) {
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < input.length(); i++) {
//             char ch = input.charAt(i);
//             // Check if current character is a letter
//             if (Character.isLetter(ch)) {
//                 char letter = ch;
//                 // Move to the next character (should be a digit)
//                 i++;
//                 if (i < input.length() && Character.isDigit(input.charAt(i))) {
//                     int repeatCount = Character.getNumericValue(input.charAt(i));
//                     // Append letter repeatCount times to result
//                     result.append(String.valueOf(letter).repeat(repeatCount));
//                 }
//             }
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String input = "a2b3c4";
//         System.out.println("Optimized output: " + expandStringOptimized(input)); // Output: aabbbcccc
//     }
// }


//Brute Force
//TC: O(n^2)
//SC:O(m)
public class String2 {
    public static String expandStringBruteForce(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if current character is a letter
            if (Character.isLetter(ch)) {
                char letter = ch;
                // Move to the next character (should be a digit)
                i++;
                if (i < input.length() && Character.isDigit(input.charAt(i))) {
                    int repeatCount = Character.getNumericValue(input.charAt(i));
                    // Append letter repeatCount times to result
                    for (int j = 0; j < repeatCount; j++) {
                        result += letter;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "a2b3";
        System.out.println("Brute-force output: " + expandStringBruteForce(input)); // Output: aabbbcccc

        long startTime = System.currentTimeMillis();
 
        // Your code that you want to measure
        String result = expandStringBruteForce(input);
        System.out.println("Compressed String: " + result); // Output: "a3b2c2"
 
        // Record the end time
        long endTime = System.currentTimeMillis();
 
        // Calculate and print the time taken
        long timeTaken = endTime - startTime;
        System.out.println("Time taken: " + timeTaken + " milliseconds");
    }
}
