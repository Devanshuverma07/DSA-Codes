package Basics.Patterns;

import java.util.Scanner;

/*
Output:

Enter Number: 3

1         1 
1 2     2 1 
1 2 3 3 2 1 

 */

public class Pattern17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Loop through each row (from 1 to n)
        for (int i = 1; i <= n; i++) {
            // Print the left part: numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print the middle spaces: 2 * (n - i) spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  "); // Two spaces for proper alignment
            }

            // Print the right part: numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line after printing one row
            System.out.println();
        }

        sc.close();
    }
}
