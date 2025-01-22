package DSA.Stack;

import java.util.*;

public class StackWithCollectionFramework {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(2);
        stack.push(6);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
