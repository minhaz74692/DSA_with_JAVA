package recursion;


public class Factorial {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
     int result =  factorialN( 5);
     System.out.println(result);

    }

     static int factorialN( int n ) {
        // Base case
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorialN(n-1);
        
    }

}
