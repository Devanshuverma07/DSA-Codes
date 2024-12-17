package Trees;

import java.util.*;

public class DiameterOfBinaryTree {

    // Definition for a binary tree node
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // BRUTE FORCE APPROACH
    public static int diameterBruteForce(TreeNode root) {
        if (root == null) return 0;

        int diameterThroughRoot = height(root.left) + height(root.right);
        int leftDiameter = diameterBruteForce(root.left);
        int rightDiameter = diameterBruteForce(root.right);

        return Math.max(diameterThroughRoot, Math.max(leftDiameter, rightDiameter));
    }

    private static int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // OPTIMIZED APPROACH
    private static int diameter = 0;

    public static int diameterOptimized(TreeNode root) {
        calculateHeight(root);
        return diameter;
    }

    private static int calculateHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // ITERATIVE APPROACH (DFS USING STACK)
    public static int diameterIterative(TreeNode root) {
        if (root == null) return 0;

        Map<TreeNode, Integer> heightMap = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();
        int diameter = 0;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();

            if (node.left == null && node.right == null || visited.contains(node)) {
                stack.pop();

                int leftHeight = node.left == null ? 0 : heightMap.get(node.left);
                int rightHeight = node.right == null ? 0 : heightMap.get(node.right);
                int height = 1 + Math.max(leftHeight, rightHeight);
                heightMap.put(node, height);

                diameter = Math.max(diameter, leftHeight + rightHeight);
            } else {
                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
                visited.add(node);
            }
        }

        return diameter;
    }

    // MAIN FUNCTION TO TEST
    public static void main(String[] args) {
        // Creating the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Testing Brute Force
        System.out.println("Diameter (Brute Force): " + diameterBruteForce(root));

        // Testing Optimized
        diameter = 0; // Reset global variable
        System.out.println("Diameter (Optimized): " + diameterOptimized(root));

        // Testing Iterative
        System.out.println("Diameter (Iterative): " + diameterIterative(root));
    }
}
