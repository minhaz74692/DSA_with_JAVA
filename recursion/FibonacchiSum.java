package recursion;

public class FibonacchiSum {

    public static void main(String args[]) {

        int fibSum = printFib(3);
        System.out.println(fibSum);
    }

    public static int printFib(int n) {
        
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i =0; i < n; i++){
            sum = a + b;
            a= b;
            b= sum;
        }
        return sum;
    }
}
