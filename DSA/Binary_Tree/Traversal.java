package DSA.Binary_Tree;

import java.util.ArrayList;
import java.util.List;

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

    // Pre-Order Traversal
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

    // In-Order Traversal
    static ArrayList<Integer> inOrderHelper(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return list;
        }

        inOrderHelper(node.left, list);
        System.out.print(node.data + " ");
        list.add(node.data);
        inOrderHelper(node.right, list);
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nums);
        System.out.println(root.data);
        ArrayList<Integer> nums2 = preOrderTraversal(root, new ArrayList<Integer>());
        System.out.println("");
        // System.out.println(nums2);

        inOrderHelper(root, new ArrayList<>());
        // System.out.println(inOrderList);

    }
}
