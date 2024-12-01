package Basics.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5; 
        int mid = n / 2;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                if (i == 0 && j == mid ||  
                    i == 1 && (j == mid - 1 || j == mid + 1 || j == mid + 2) ||  
                    i == 2 && (j == mid - 2 || j == mid) ||  
                    i == 3 && (j == mid - 1 || j == mid + 1 || j == mid + 2) ||  
                    i == 4 && j == mid) {  
                    System.out.print(". ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}

// Pattern :

//     .     
//   .   . . 
// .   .     
//   .   . . 
//     .     