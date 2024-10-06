import java.util.Scanner;
public class Team {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int result  = 0;
        
        for(int i = 0; i < n ; i++){
            
        int k1 =  sc.nextInt();
        int k2 =  sc.nextInt();
        int k3 =  sc.nextInt();

            if(k1 + k2 + k3 >= 2){
                result++;
            }
        }
        System.out.println(result);
    }
}
