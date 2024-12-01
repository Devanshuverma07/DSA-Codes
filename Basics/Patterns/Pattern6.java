package Basics.Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 9, num = 1; 
        int mid = n / 2; 
        
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check conditions for each row and column
                if (i == 0 && j == mid ||               
                    i == 1 && (j == mid - 1 || j == mid + 1) || // Second row
                    i == 2 && (j == mid - 2 || j == mid || j == mid + 2) || // Middle row
                    i == 3 && (j == mid - 3 || j == mid - 1 || j == mid + 1 || j == mid + 3) || // Fourth row
                    i == 4 && (j == mid - 4 || j == mid - 2 || j == mid || j == mid + 2 || j == mid + 4)   // Bottom row
                ) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print("  "); // Empty space for non-matching cells
                }
            }
            System.out.println(); // New line after each row
        }
    }
}


// Pattern: 

//         1
//       2   3       
//     4   5   6     
//   7   8   9   10   
// 11   12   13   14   15 
