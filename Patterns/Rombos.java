public class Rombos {
    public static void main(String[] args) {

        int n = 8;

        for (int i = 1; i <= n; i++) {

            int spaces = n - i;
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {

                System.out.print(" 9");

            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            int spaces = n - i;
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print(" 9");
                }
            }
            System.out.println();
        }
    }

}
