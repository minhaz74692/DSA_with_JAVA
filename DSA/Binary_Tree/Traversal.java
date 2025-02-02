package DSA.Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Traversal {
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

    // 1: Pre-Order Traversal
    public static ArrayList<Integer> preOrderTraversal(Node root, ArrayList<Integer> nums) {
        if (root == null) {
            System.out.print("");
            return null;
        }
        System.out.print(root.data + " ");
        nums.add(root.data);
        preOrderTraversal(root.left, nums);
        preOrderTraversal(root.right, nums);
        return nums;
    }

    // 2: In-Order Traversal
    static ArrayList<Integer> inOrderTraversal(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return list;
        }

        inOrderTraversal(node.left, list);
        System.out.print(node.data + " ");
        list.add(node.data);
        inOrderTraversal(node.right, list);
        return list;
    }

    // 3: Post-Order Traversal
    static ArrayList<Integer> postOrderTraversal(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return list;
        }

        inOrderTraversal(node.left, list);
        inOrderTraversal(node.right, list);
        System.out.print(node.data + " ");
        list.add(node.data);
        return list;
    }

    // 4: Level Order Traversal
    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node tempNode = q.remove();
            if (tempNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(tempNode.data + " ");
                if (tempNode.left != null)
                    q.add(tempNode.left);

                if (tempNode.right != null)
                    q.add(tempNode.right);
            }

        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nums);
        System.out.println(root.data);

        System.out.println("\n\nPre Order Traversal: ");
        preOrderTraversal(root, new ArrayList<Integer>());

        System.out.println("\n\nIn Order Traversal:");
        inOrderTraversal(root, new ArrayList<>());

        System.out.println("\n\nPost Order Traversal:");
        postOrderTraversal(root, new ArrayList<>());

        System.out.println("\n\nLevel Order Traversal: ");
        levelOrderTraversal(root);

    }
}
