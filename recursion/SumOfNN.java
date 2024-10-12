package recursion;

public class SumOfNN {
    public static void main(String args[]) {
      calculateSum(1, 5, 0);

    }

     static void calculateSum(int i, int n , int sum) {
        // Base case
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        calculateSum(i+1, n, sum);
        
    }

}
