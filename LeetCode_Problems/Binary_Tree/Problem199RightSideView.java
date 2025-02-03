package LeetCode_Problems.Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem199RightSideView {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<Integer>();
            if (root == null)
                return list;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            TreeNode lastSeen = null;

            while (!q.isEmpty()) {
                TreeNode currNode = q.poll();
                if (currNode == null) {
                    if (lastSeen != null) {
                        list.add(lastSeen.val);
                        // lastSeen = null; //While try to find Left Side View
                    }
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    lastSeen = currNode;
                    // if(lastSeen == null) lastSeen = currNode; //While try to find Left Side View

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
