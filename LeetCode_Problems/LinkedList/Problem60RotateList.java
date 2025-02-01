package LeetCode_Problems.LinkedList;

public class Problem60RotateList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null) {
                return head;
            }

            ListNode result = head;

            int rotation = k % findSize(result);
            for (int i = 0; i < rotation; i++) {
                result = this.singleRotate(result);
            }
            return result;
        }

        public static int findSize(ListNode head) {
            int size = 0;
            if (head == null) {
                return size;
            }

            ListNode current = head;
            while (current != null) {
                current = current.next;
                size++;
            }
            return size;
        }

        public ListNode singleRotate(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode result = head;
            ListNode first = head;
            ListNode second = head.next;

            while (second.next != null) {
                first = first.next;
                second = second.next;
            }

            first.next = second.next;
            second.next = result;
            result = second;
            return result;
        }
    }
}
