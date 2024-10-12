package recursion;

public class Fibonacchi {
    public static void main(String args[]){
        int a = 0; 
        int b =1 ;
        int n =7;
        System.out.print(a);
        System.out.print(b);
        printFib(a, b, n-2);
    }

    public static void printFib(int a, int b, int n){
        if(n ==0){
            return ;
        }

        int c = a+b;
        System.out.print(c);
        printFib(b, c, n-1);

    }
}
