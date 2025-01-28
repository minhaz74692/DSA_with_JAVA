package LeetCode_Problems.String;

public class SumOfDigits_1945 {
    public static int sumOfDigits(String s, int k) {
        int  val ,ans= 0;

        for(int i = 0; i < s.length(); i++){
            val = s.charAt(i) - 96;
            while (val!=0) {
                ans = ans + (val%10);
                val = val/10;
            }
        }

        for(int i = 1; i<k; i++){
            int temp = 0;
            while(ans != 0 ){
                temp+= ans%10;
                ans = ans /10;
            }

            ans = temp;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println("The final sum is: " + sumOfDigits("iiii", 2));
        System.out.println('a' - 96);
        System.out.println('2' - 96);
    }
}
