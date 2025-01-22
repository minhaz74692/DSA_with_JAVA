package DSA.Queue_DS;

import java.util.Stack;;

public class QueueByTwoStack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        static boolean isEmpty() {
            return s1.isEmpty();
        }

        static void add(int data) {

            while (!isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }

        static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
