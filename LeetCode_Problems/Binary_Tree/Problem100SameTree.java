package LeetCode_Problems.Binary_Tree;

public class Problem100SameTree {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            // Base Case: Both are null (same)
            if (p == null && q == null) return true;
            
            // If one is null and the other is not, they are not same
            if (p == null || q == null) return false;
            
            // If values are different, trees are not same
            if (p.val != q.val) return false;
    
            // Recursively check left and right subtrees
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    
    }
}