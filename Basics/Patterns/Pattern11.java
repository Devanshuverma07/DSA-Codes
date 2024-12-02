package Basics.Patterns;
import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scanner.nextInt();
    
        for(int i =1; i <= n; i++){
            for(int j=n; j>=i ;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
    
}


/** 
 

Output: 
* * *
* *
*

*/