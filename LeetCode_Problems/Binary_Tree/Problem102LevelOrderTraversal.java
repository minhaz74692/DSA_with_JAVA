package LeetCode_Problems.Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem102LevelOrderTraversal {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            q.add(root);
            q.add(null);

            List<Integer> tempList = new ArrayList<>();
            list.add(tempList);
            while (!q.isEmpty()) {
                TreeNode currNode = q.remove();
                if (currNode == null) {
                    tempList = new ArrayList<>();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        list.add(tempList);
                        q.add(null);
                    }
                } else {
                    tempList.add(currNode.val);
                    if (currNode.left != null)
                        q.add(currNode.left);
                    if (currNode.right != null)
                        q.add(currNode.right);
                }

            }

            return list;
        }
    }
}
