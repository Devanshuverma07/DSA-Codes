package Basics.Patterns;

import java.util.Scanner;

/*
 OUTPUT:

Enter the number of rows:
5
A B C D E 
A B C D 
A B C 
A B 
A

 */

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        
        // Call the method to print the pattern
        nLetterTriangleRev(n);

        // Close the Scanner
        sc.close();
    }

    public static void nLetterTriangleRev(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
