public class Palindromic {
    public static void main(String[] args) {

        int n = 8;


        for (int i = 1; i <= n; i++) {

            int spaces = n - i;
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j = n; j >= 1 ; j--) {
                if (i >= j) {
                    System.out.print(j);
                }
            }
            for (int j = 2; j <= n; j++) {
                if (i >= j) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

}
