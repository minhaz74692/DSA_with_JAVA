package LeetCode_Problems.LinkedList;

public class Problem160 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }

            ListNode pointerA = headA;
            ListNode pointerB = headB;

            // Traverse both lists. If a pointer reaches the end of one list, switch to the
            // other list's head.
            // This ensures both pointers traverse the same total length (lengthA +
            // lengthB).
            while (pointerA != pointerB) {
                pointerA = (pointerA == null) ? headB : pointerA.next;
                pointerB = (pointerB == null) ? headA : pointerB.next;
            }

            // If they meet, pointerA (or pointerB) is the intersection node. Otherwise,
            // it's null.
            return pointerA;
        }
    }
}
