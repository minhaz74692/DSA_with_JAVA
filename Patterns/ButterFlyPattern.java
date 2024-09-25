
public class ButterFlyPattern {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print(" 9");
                } else {
                    System.out.print("  ");
                }
                
            }
            for (int j = 1; j <= n; j++) {
                if ((n-i)< j) {
                    System.out.print(" 9");
                } else {
                    System.out.print("  ");
                }
                
            }

            System.out.println();
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j>=i) {
                    System.out.print(" 9");
                } else {
                    System.out.print("  ");
                }
                
            }
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    System.out.print(" 9");
                } else {
                    System.out.print("  ");
                }
                
            }

            System.out.println();
        }
    }
}
