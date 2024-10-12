package recursion;

public class XToThePowerN {
    public static void main(String[] args) {
     int result =    printXTTPn(3,2);
     System.out.println(result);
    }

    public static int printXTTPn(int x, int n) {
        if (n ==0) {
            return 1;
        }
        if(x==0 ){
            return 0;
        }
        return x * printXTTPn(x, n-1);
    }
}
