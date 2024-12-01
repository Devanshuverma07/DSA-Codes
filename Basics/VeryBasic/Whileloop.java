package Basics.VeryBasic;

public class Whileloop {
    // Method to print the reverse multiplication table of a given number
    public static void printReverseTable(int n) {
        int i = 10; // Start from the 10th multiple
        while (i > 0) {
            System.out.print(n * i + " "); // Print the current multiple
            i--; // Decrement to the next multiple
        }
        System.out.println(); // Print a newline for better output formatting
    }
}
