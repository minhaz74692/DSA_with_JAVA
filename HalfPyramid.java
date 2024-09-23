import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1 ; i <= row; i++){
            for (int k = col - i; k >= 1; k--) {  // This for loop is for Full Pyramid
                System.out.print(" ");
            }
            for(int j = 1; j <= col; j++){
                if(i >= j){
                    
                    System.out.print(" 9");
                }
            }

            System.out.println();
        }
    }
}
