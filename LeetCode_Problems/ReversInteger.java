package LeetCode_Problems;

public class ReversInteger {
    public static void main(String args[]) {
       
        
        System.out.println(reverse(21));
    }

    public static int reverse(int x) {
        String str = Integer.toString(x);
        String newString = "";
        for(int i = str.length() -1; i>=0; i--){
            newString+= str.charAt(i);
        }

        long max = (long) Math.pow(2, 31) -1;
        long min = - (long) Math.pow(2, 31);
        int finalInt = Integer.valueOf(newString);
        if(finalInt>=min && finalInt <=max){
            return finalInt;
        }
        return 0;
    }

}
