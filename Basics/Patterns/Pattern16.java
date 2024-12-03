package Basics.Patterns;

import java.util.Scanner;

/*
 Output:
 Enter the value of N: 3

1 
0 1 
1 0 1


 */

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for N
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        // Generate the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
