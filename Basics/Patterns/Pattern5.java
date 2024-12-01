package Basics.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        char letter = 'a';
        int row = 1; 

        while (letter <= 'j') {
            for (int i = 0; i < row; i++) {
                if (letter <= 'j') {
                    System.out.print(letter + " ");
                    letter++;
                }
            }
            System.out.println(); 
            row++; 
        }
    }
}

//Pattern: 
// a 
// b c 
// d e f 
// g h i j