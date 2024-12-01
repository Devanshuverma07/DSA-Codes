package Basics.ArraysQ;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfaNumber {

    public static Map<Integer, Integer> occurrences(int[] arr){
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        return countMap;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 5, 5, 4, 4, 4, 4, 3, 3};
        Map<Integer, Integer> result = occurrences(arr);
        System.out.println("Occurrences of numbers: " + result);
    }
}
