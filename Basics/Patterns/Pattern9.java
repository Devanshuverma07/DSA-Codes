package Basics.Patterns;

class Pattern9 {
    public static void main(String[] args){
    int N=5; 
     for (int i = 1; i <= N; i++)
     {
         for (int j = 1; j <= i; j++)
         {
             System.out.print(j+" ");
         }
 
         System.out.println();
     }
 }
}
 
// Pattern:

// 1
// 1 2
// 1 2 3
// 1 2 3 4 
// 1 2 3 4 5 