package Basics.ArraysQ;

// BRUTE FORCE
// public class SecondLargestElement {
//     public static int SecondLargest(int[] arr){
//         int n = arr.length-1;
//         int res = 0;
//         Arrays.sort(arr);
//         for(int i = n-1; i >= 0; i--){
//             res += arr[i];
//             break;
//         }

//         return res;
//     }
    

//     public static void main(String[] args){
//         int[] arr = {3,9,13,1,27};
//         System.out.println("Second Largest Element is: " + SecondLargest(arr));
//     }
// }



//optimal approach
//Single pass array approach
public class SecondLargestElement {
    public static int SecondLargest(int[] arr){
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
    
    public static void main(String[] args){
        int[] arr = {3, 9, 13, 1, 27};
        System.out.println("Second Largest Element is: " + SecondLargest(arr));
    }
}
