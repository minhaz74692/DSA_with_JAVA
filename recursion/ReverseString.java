package recursion;

public class ReverseString {

    //Traditional
    public static void reversStirng(String str){
        String result = "";
        for(int i = str.length()-1 ; i>=0; i--){
            result += str.charAt(i);

        // System.out.println(str.charAt(i));
        }
        System.out.println(result);
    }

    // By recursive Function
    public static void reverseStringRecursive(String str, int index){
        if(index ==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseStringRecursive(str, index-1);
    }
    public static void main(String args[]){
        reversStirng("Hello");
        String str = "Minhaz";
        reverseStringRecursive(str,str.length()-1 );
    }
}
