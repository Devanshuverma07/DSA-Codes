package Basics.ArraysQ;

public class ReverseArray {
    
    public static void reverse(int[] arr){
        int n = arr.length;
        System.out.print("Reverse Order of Array is: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " "); 
        }
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 5, 6, 8};
        reverse(arr);
    }
}
