package Basics.Patterns;

import java.util.Scanner;

public class Pattern3 {

     public static void main(String[] args){
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner3.nextInt();

        for(int i = 0; i<=n; i++){
            for(int j =i; j>=0;j--){
                System.out.print("* ");
            }

            System.out.println();
        }
     
        scanner3.close();
    }
    
}

// Pattern:

// * 
// * * 
// * * * 
// * * * * 