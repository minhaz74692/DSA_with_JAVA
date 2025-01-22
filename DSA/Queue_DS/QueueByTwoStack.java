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
            if (isEmpty()) {
                s1.add(data);
                return;
            }

            while (!isEmpty()) {
                s2.add(s1.peek());
                s1.pop();
            }
            s1.add(data);
            while (!s2.isEmpty()) {
                s1.add(s2.peek());
                s2.pop();
            }
        }

        static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int top = s1.peek();
            s1.pop();
            return top;
        }

        static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String args[]){
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
