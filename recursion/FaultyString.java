package recursion;

public class FaultyString {
    // public static void main(String args[]){
    //     String str = "poiinter";
    //     String finalString = "";

    //     for(int i = 0; i<str.length(); i++){
    //         if(str.charAt(i) == 'i'){
    //            finalString =  reverseString(finalString);
    //         }else{
    //             finalString += str.charAt(i);
    //         }
    //     }
    //     System.out.println(finalString);
    // }
    // public static String reverseString(String str){
    //     String newString = "";
    //     for(int i = str.length()-1; i>=0; i--){
    //         char currentChar = str.charAt(i);
    //         newString+= currentChar;
    //     }
    //     return newString;
    // }

    public static void main(String args[]){
        System.out.println(finalString("Helilo"));
    }

    public static String finalString(String s) {

        StringBuilder sb = new StringBuilder();
         char[] ca = s.toCharArray();


        for(char c : ca){
            if(c == 'i')
             sb.reverse();
             else
             sb.append(c);
        }
        return sb.toString();
    }
}
