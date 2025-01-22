package DSA.Queue_DS;

import java.util.*;

public class QueueWithCollectionFramework {

    public static void main(String args[]) {
        // Here Queue is an interface and LinkedList and ArrayDeque is an class.
        // Queue<Integer>q = new LinkedList<Integer>();

        Queue<Integer> q = new ArrayDeque<Integer>();
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
