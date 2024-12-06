package Basics.Patterns;

import java.util.Scanner;

/* 
 
Enter the number of rows: 3 

A 
A B 
A B C 


 */

public class Pattern19 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        
        // Call the method to print the pattern
        nLetterTriangle(n);

        // Close the Scanner
        sc.close();
    }

    public static void nLetterTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }
    }
}
