package DSA.Stack;

public class StackWithLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
                head = node;
                return;
            }
            node.next = head;
            head = node;

        }

        public Node pop() {
            if (isEmpty()) {
                return null;
            }
            head = head.next;
            return head;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(2);
        stack.push(6);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

        System.out.println(stack.peek());
    }
}
