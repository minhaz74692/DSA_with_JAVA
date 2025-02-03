package DSA.Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTPreOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        public Node buildTree(int nums[]) {
            idx++;
            if (nums[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nums[idx]);
            newNode.left = buildTree(nums);
            newNode.right = buildTree(nums);
            return newNode;
        }
    }

    static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);

        List<Integer> tempList = new ArrayList<>();
        list.add(tempList);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                 tempList.clear();
                if (q.isEmpty()) {
                    break;
                } else {
                    list.add(tempList);
                    q.add(null);
                }
            } else {
                tempList.add(currNode.data);
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }

        }

        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nums);
        System.out.println(root.data);
        levelOrder(root);
    }
}
