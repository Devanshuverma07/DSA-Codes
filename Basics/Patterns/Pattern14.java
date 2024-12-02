package Basics.Patterns;
import java.util.Scanner;

/*
Output:
Enter the value of N:
4

   *
  ***
 *****
*******
*******
 *****
  ***
   *

*/
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for N
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        // Upper triangle
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower triangle
        for (int i = n - 1; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}