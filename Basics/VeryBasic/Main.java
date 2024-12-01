package Basics.VeryBasic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number whose table is to be printed
        System.out.println("Enter a number between 1 and 1000:");
        int n = sc.nextInt();

        // Validate the input to ensure it is within the range
        if (n < 1 || n > 1000) {
            System.out.println("Invalid input! Please enter a number between 1 and 1000.");
        } else {
            // Call the method from whileloop class
            Whileloop.printReverseTable(n);
        }

        // Close the scanner
        sc.close();
    }
}
