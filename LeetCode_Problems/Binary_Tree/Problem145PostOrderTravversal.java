package LeetCode_Problems.Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class Problem145PostOrderTravversal {

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
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<Integer>();
            list = preOrderHelper(root, list);
            return list;
        }

        static List<Integer> preOrderHelper(TreeNode node, List<Integer> list) {
            if (node == null) {
                return list;
            }
            preOrderHelper(node.left, list);
            preOrderHelper(node.right, list);
            list.add(node.val);
            return list;
        }
    }
}
