package Basics.Patterns;

import java.util.Scanner;

class Patten2{
    public static void main(String[] args){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner2.nextInt();

        for(int i = 0; i<=n; i++){
            for(int j=0;j<=n;j++){
            System.out.print("* ");
            }
            System.out.println();
        }

        scanner2.close();

    }
}

// Pattern: it depends on user input you give mine is 3

// * * * * 
// * * * * 
// * * * * 
// * * * *