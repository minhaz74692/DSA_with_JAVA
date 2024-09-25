// import java.util.Scanner;
public class InvertedHalfPyramid {
        public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        int n = 5;

        // Half Pyramid
        System.out.println("\nHalf Pyramid:");
        for(int i = 1 ; i <= n; i++){
            // for (int k = n - i; k >= 1; k--) {  // This for loop is for Full Pyramid
            //     System.out.print(" ");
            // }
            
            for(int j = 1; j <= i; j++){
                System.out.print(" 9");
            }

            System.out.println();
        }

        //Inverted Half Pyramid
        System.out.println("\nInverted Half Pyramid:");
        for(int i = n ; i >=1; i--){
            

            for(int j = 1; j<=i; j++){
                System.out.print(" 9");
            }

            System.out.println();
        }
        
        //Rotate 180 Degree
        System.out.println("\n180 Degree Rotated Half Pyramid:");
        for(int i =1 ; i<=n ; i++ ){
            for(int k = 1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Floyed's Triangle

        int num = 1;
        System.out.println("\nFloyed's Triangle");
        for(int i  = 1; i<= n ; i++){
            for (int j = 1; j<= i ; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }


        //Zero-One Triangle

        System.out.println("\n zero - One Triangle");
        for(int i  = 1; i<= n ; i++){
            for (int j = 1; j<= i ; j++){
                System.out.print((i+j)%2 == 0?1:0);
               
            }
            System.out.println();
        }
    }
}
