package LeetCode_Problems.Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class Problem637AverageOfLevels {
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
        public List<Double> averageOfLevels(TreeNode root) {
            List<TreeNode> nodes = new ArrayList<>();
            List<Double> result = new ArrayList<>();
            nodes.add(root);
            while (!nodes.isEmpty()) {
                int n = nodes.size();
                List<TreeNode> childs = new ArrayList<>();
                double sum = 0;
                for (int i = 0; i < n; i++) {
                    TreeNode curr = nodes.get(i);
                    sum += curr.val;
                    if (curr.left != null) {
                        childs.add(curr.left);
                    }
                    if (curr.right != null) {
                        childs.add(curr.right);
                    }
                }
                result.add(sum / n);
                nodes = childs;
            }
            return result;
        }
    }
}
