package LeetCode_Problems;

/**
 * UglyNumber
 */
public class UglyNumber {

    public static void main(String args[]) {
        System.out.println(isUglyNumber(12));
        ;
    }

    public static boolean isUglyNumber(int num) {
        if (num <=0) {
            return false;
        }
        while(num>=2 && num%2==0){ 
            num/=2;
        }
        while(num>=3 && num%3==0){ 
            num/=3;
        }
        while(num>=5 && num%5==0){ 
            num/=5;
        }
        
        return num==1;
    }

    
}