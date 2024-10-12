package recursion;

public class LogNStack {
    public static void main(String[] args) {
        int result = printResult(2, 3);
        System.out.println(result);
    }

    public static int printResult(int x, int n) {
        // Base case 1
        if (n == 0) {
            return 1;
        }

        // Base case 2
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {

            return printResult(x, n / 2) * printResult(x, n / 2);
        } else {
            return printResult(x, n / 2) * printResult(x, n / 2) * x;
        }
    }
}
