package Basics.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 9; 
        int mid = n / 2; 
        
        for (int i = 0; i < n; i++) {
            int num = i + 1;  
            
            for (int j = 0; j < n; j++) {
                
                if (i == 0 && j == mid ||                
                    i == 1 && (j == mid - 1 || j == mid + 1) || 
                    i == 2 && (j == mid - 2 || j == mid || j == mid + 2) || 
                    i == 3 && (j == mid - 3 || j == mid - 1 || j == mid + 1 || j == mid + 3) || 
                    i == 4 && (j == mid - 4 || j == mid - 2 || j == mid || j == mid + 2 || j == mid + 4) 
                ) {
                    System.out.print(num + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}

// Pattern:

//         1
//       2   2       
//     3   3   3     
//   4   4   4   4   
// 5   5   5   5   5 