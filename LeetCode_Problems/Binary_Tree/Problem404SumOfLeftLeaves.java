package LeetCode_Problems.Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem404SumOfLeftLeaves {
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
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) {
                return 0;
            }
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            q.add(root);

            List<Integer> list = new ArrayList<>();
            int sum = 0;
            while (!q.isEmpty()) {
                TreeNode currNode = q.poll();

                if (currNode.left != null) {
                    if (currNode.left.left == null && currNode.left.right == null)
                        sum += currNode.left.val;
                    q.add(currNode.left);
                }
                if (currNode.right != null)
                    q.add(currNode.right);

            }
            return sum;
        }
    }
}
