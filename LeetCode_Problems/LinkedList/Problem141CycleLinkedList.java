package LeetCode_Problems.LinkedList;

public class Problem141CycleLinkedList {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false; // No cycle if the list is empty or has only one node
            }

            ListNode turtle = head; // Tortoise pointer
            ListNode hare = head; // Hare pointer

            while (hare != null && hare.next != null) {
                turtle = turtle.next; // Move turtle pointer one step
                hare = hare.next.next; // Move hare pointer two steps

                if (turtle == hare) {
                    return true; // Cycle detected
                }
            }

            return false; // No cycle detected
        }
    }
}
