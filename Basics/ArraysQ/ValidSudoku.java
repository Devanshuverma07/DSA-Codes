package Basics.ArraysQ;

// import java.util.HashSet;

public class ValidSudoku {


    //BRUTE FORCE
    // public boolean isValidSudoku(char[][] board) {
    //     // Check all rows
    //     for (int i = 0; i < 9; i++) {
    //         if (!isUnique(board[i])) {
    //             return false;
    //         }
    //     }

    //     // Check all columns
    //     for (int j = 0; j < 9; j++) {
    //         char[] column = new char[9];
    //         for (int i = 0; i < 9; i++) {
    //             column[i] = board[i][j];
    //         }
    //         if (!isUnique(column)) {
    //             return false;
    //         }
    //     }

    //     // Check all 3x3 sub-boxes
    //     for (int boxRow = 0; boxRow < 3; boxRow++) {
    //         for (int boxCol = 0; boxCol < 3; boxCol++) {
    //             char[] box = new char[9];
    //             int index = 0;
    //             for (int i = 0; i < 3; i++) {
    //                 for (int j = 0; j < 3; j++) {
    //                     box[index++] = board[boxRow * 3 + i][boxCol * 3 + j];
    //                 }
    //             }
    //             if (!isUnique(box)) {
    //                 return false;
    //             }
    //         }
    //     }

    //     return true;
    // }

    // // Helper function to check if an array has unique values
    // private boolean isUnique(char[] array) {
    //     HashSet<Character> set = new HashSet<>();
    //     for (char c : array) {
    //         if (c != '.') {
    //             if (set.contains(c)) {
    //                 return false;
    //             }
    //             set.add(c);
    //         }
    //     }
    //     return true;
    // }

    // // Main method for testing
    // public static void main(String[] args) {
    //     ValidSudoku solver = new ValidSudoku();

    //     char[][] board = {
    //             {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
    //             {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
    //             {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
    //             {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
    //             {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
    //             {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    //             {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
    //             {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
    //             {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    //     };

    //     System.out.println("Is the Sudoku board valid? " + solver.isValidSudoku(board));
    // }

    //OPTIMIZED CODE
    public boolean isValidSudoku(char[][] board) {
        // Arrays to track the presence of digits in rows, columns, and sub-boxes using bitmasking
        int[] rowMask = new int[9];
        int[] colMask = new int[9];
        int[] boxMask = new int[9];

        // Traverse the board
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char num = board[row][col];

                // Skip empty cells
                if (num == '.') continue;

                // Calculate the bit position for the number (1-9)
                int numBit = 1 << (num - '1'); // Convert '1' to 0th bit, '2' to 1st bit, etc.

                // Calculate the index for the sub-box
                int boxIndex = (row / 3) * 3 + (col / 3);

                // Check if the number already exists in the row, column, or sub-box
                if ((rowMask[row] & numBit) != 0 || (colMask[col] & numBit) != 0 || (boxMask[boxIndex] & numBit) != 0) {
                    return false; // Invalid board
                }

                // Mark the number as seen by setting the corresponding bit
                rowMask[row] |= numBit;
                colMask[col] |= numBit;
                boxMask[boxIndex] |= numBit;
            }
        }

        // If no conflicts, the board is valid
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        ValidSudoku solver = new ValidSudoku();

        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Is the Sudoku board valid? " + solver.isValidSudoku(board));
    }
}
