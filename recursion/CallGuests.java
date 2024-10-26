package recursion;

public class CallGuests {
    public static int callGuests(int n){
        if(n <=1){
            return 1;
        }
        return callGuests(n-1) +((n-1)* callGuests(n-2));
    }
    public static void main(String arg[]){
        System.out.println(callGuests(3));
    }
}
