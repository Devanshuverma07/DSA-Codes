package Basics.Patterns;

import java.util.Scanner;

/*
 Output:
 
 Enter the value of N: 3

*
**
***
**
*

 */

class Pattern15{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Take input for N
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        //Upper Half
        for(int i =0; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half
        for(int i = n-1; i>0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}