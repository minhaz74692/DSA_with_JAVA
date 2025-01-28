import java.util.ArrayDeque;
import java.util.Queue;

public class StackByTwoQueue{
    static class MyStack {
        static Queue<Integer> s1 = new ArrayDeque<Integer>();
        static Queue<Integer> s2 = new ArrayDeque<Integer>();

        static boolean isEmpty() {
            return s1.isEmpty();
        }

        static void add(int data) {

            while (!isEmpty()) {
                s2.add(s1.remove());
            }
            s1.add(data);
            
            while (!s2.isEmpty()) {
                s1.add(s2.remove());
            }
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.remove();
        }

        static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }


    public static void main(String args[]) {
        MyStack q = new MyStack();
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