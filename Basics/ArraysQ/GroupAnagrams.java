package Basics.ArraysQ;

import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagramsUsingSorting(String[] strs) {
        // Sorting approach
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public List<List<String>> groupAnagramsUsingHashTable(String[] strs) {
        // HashTable approach
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();

        // Example inputs
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs2 = {"abc", "cba", "bca", "xyz", "yxz", "zxy"};
        String[] strs3 = {"a"};

        // Test sorting approach
        System.out.println("Using Sorting Approach:");
        System.out.println("Input: " + Arrays.toString(strs1));
        System.out.println("Output: " + solution.groupAnagramsUsingSorting(strs1));
        System.out.println("Input: " + Arrays.toString(strs2));
        System.out.println("Output: " + solution.groupAnagramsUsingSorting(strs2));
        System.out.println("Input: " + Arrays.toString(strs3));
        System.out.println("Output: " + solution.groupAnagramsUsingSorting(strs3));

        // Test hash table approach
        System.out.println("\nUsing HashTable Approach:");
        System.out.println("Input: " + Arrays.toString(strs1));
        System.out.println("Output: " + solution.groupAnagramsUsingHashTable(strs1));
        System.out.println("Input: " + Arrays.toString(strs2));
        System.out.println("Output: " + solution.groupAnagramsUsingHashTable(strs2));
        System.out.println("Input: " + Arrays.toString(strs3));
        System.out.println("Output: " + solution.groupAnagramsUsingHashTable(strs3));
    }
}
