package Basics.Patterns;

import java.util.Scanner;

/*
 Output:

 Enter Number: 3
 
1 
2 3 
4 5 6 

 */

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int number = 1;
        for(int i =1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
