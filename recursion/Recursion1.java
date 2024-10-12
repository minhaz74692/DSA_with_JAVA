package recursion;

public class Recursion1 {
    public static void main(String args[]) {
        System.out.println("hello");
        factorial(5);

    }

    static void factorial(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        System.err.println(n);
        factorial(n - 1);
        // System.out.println(n);
        
    }

}
