package BackTracking;

//Time Complexity: O(n.n!)
public class BackTracking2 {
    public static void printPermutation(String str, String perm) {
        if( str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPermutation(newStr, perm + currentChar);
        }
    }
      public static void main(String[] args) {
        printPermutation("abc", "");
      }
}
