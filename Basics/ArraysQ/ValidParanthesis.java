package Basics.ArraysQ;

import java.util.Stack;

public class ValidParanthesis {

    // Brute Force Approach (commented out)
    /*
    public boolean isValidBruteForce(String s) {
        for (int i = 0; i < s.length(); i++) {
            char openBracket = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                char closeBracket = s.charAt(j);
                if (openBracket == '(' && closeBracket == ')') {
                    s = s.substring(0, i) + s.substring(j + 1);
                    break;
                } else if (openBracket == '{' && closeBracket == '}') {
                    s = s.substring(0, i) + s.substring(j + 1);
                    break;
                } else if (openBracket == '[' && closeBracket == ']') {
                    s = s.substring(0, i) + s.substring(j + 1);
                    break;
                }
            }
        }
        return s.isEmpty();
    }
    */

    // Stack Approach (Implemented)
    public boolean isValid(String s) {
        // Using a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the character is an opening bracket, push it onto the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            // If the character is a closing bracket, check for matching opening bracket
            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // If the stack is empty or the top of the stack doesn't match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                // Check if the popped character matches the current closing bracket
                if (currentChar == ')' && top != '(') {
                    return false;
                } else if (currentChar == '}' && top != '{') {
                    return false;
                } else if (currentChar == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        // If the stack is empty, it means all brackets matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis solution = new ValidParanthesis();

        // Test case for Stack approach (Implemented)
        String s = "([]){}"; // Valid case
        System.out.println("Is valid parentheses (Stack): " + solution.isValid(s));

        // Test case for Brute Force approach (commented out in code)
        /*
        String s2 = "([)]"; // Invalid case
        System.out.println("Is valid parentheses (Brute Force): " + solution.isValidBruteForce(s2));
        */
    }
}
