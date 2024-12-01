package Basics.Strings;

import java.util.Scanner;

/** 
String input = aabbbcccc
output:a2b3c4
*/

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String n = scanner.nextLine();

        String pattern = Pattern(n);
        System.out.println(pattern);
        scanner.close();
    }

     public static String Pattern(String n) {

    //     //Optimized Two-Pointer Approach
        StringBuilder result = new StringBuilder();
        int i = 0;
        int length = n.length();

        while (i < length) {
            char currentChar = n.charAt(i);
            int countOccurrences = 0;

            // Count consecutive occurrences of currentChar
            while (i < length && n.charAt(i) == currentChar) {
                i++;
                countOccurrences++;
            }

            // Append character and its count to the result
            result.append(currentChar).append(countOccurrences);
        }

        return result.toString();
    }

    /*
    // Brute Force Approach
    public static String PatternBruteForce(String n) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < n.length(); i++) {
            if (i < n.length() - 1 && n.charAt(i) == n.charAt(i + 1)) {
                count++;
            } else {
                result.append(n.charAt(i)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }
    */

    /*
    // HashMap Approach (Not suitable for counting consecutive characters)
    import java.util.HashMap;

    public static String PatternHashMap(String n) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : n.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : n.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                result.append(ch).append(charCountMap.get(ch));
                charCountMap.remove(ch);
            }
        }

        return result.toString();
    }
    */



    // public static String Pattern(String n) {
    //     StringBuilder result = new StringBuilder();
    //     int count = 1;
    
    //     for (int i = 0; i < n.length(); i++) {
    //         // Check if the next character is the same as the current character
    //         if (i < n.length() - 1 && n.charAt(i) == n.charAt(i + 1)) {
    //             count++;
    //         } else {
    //             // Append character and its count
    //             result.append(n.charAt(i)).append(count);
    //             count = 1;  // Reset count
    //         }
    //     }
    
    //     return result.toString();
    // }
    
}
    
// }