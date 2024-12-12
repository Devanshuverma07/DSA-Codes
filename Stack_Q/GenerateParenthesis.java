package Stack_Q;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis {

    // Brute Force Approach
    public List<String> generateParenthesisBruteForce(int n) {
        List<String> result = new ArrayList<>();
        char[] current = new char[2 * n];
        generateAllCombinations(current, 0, result, n);
        return result;
    }

    // Helper method for Brute Force to generate all combinations
    private void generateAllCombinations(char[] current, int position, List<String> result, int n) {
        if (position == current.length) {
            if (isValid(current)) {
                result.add(new String(current));
            }
        } else {
            current[position] = '(';
            generateAllCombinations(current, position + 1, result, n);
            current[position] = ')';
            generateAllCombinations(current, position + 1, result, n);
        }
    }

    // Helper method to check if a combination is valid
    private boolean isValid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }

    // Backtracking Approach
    public List<String> generateParenthesisBacktrack(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisRec("", 0, 0, n, result);
        return result;
    }

    // Helper method for Backtracking to generate valid combinations
    private void generateParenthesisRec(String current, int left, int right, int n, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (left < n) {
            generateParenthesisRec(current + "(", left + 1, right, n, result);
        }

        if (right < left) {
            generateParenthesisRec(current + ")", left, right + 1, n, result);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis solution = new GenerateParenthesis();

        // Test with n = 3 for Brute Force
        int n = 3;
        List<String> bruteForceResult = solution.generateParenthesisBruteForce(n);
        System.out.println("Brute Force Result for n = " + n + ": " + bruteForceResult);

        // Test with n = 3 for Backtracking
        List<String> backtrackResult = solution.generateParenthesisBacktrack(n);
        System.out.println("Backtracking Result for n = " + n + ": " + backtrackResult);
    }
}
