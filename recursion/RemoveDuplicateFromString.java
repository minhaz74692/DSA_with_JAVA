package recursion;

public class RemoveDuplicateFromString {
    public static void removeDuplicat(String str, int index, boolean[] listOfBool, String newString) {
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        int alphabetIndex = str.toLowerCase().charAt(index)-'a';
        if(listOfBool[alphabetIndex] == false){
            newString += str.charAt(index);
            listOfBool[alphabetIndex] = true;
        }

        removeDuplicat(str, index+1, listOfBool, newString);
    }

    public static void main(String arg[]) {
        boolean[] boolList = new boolean[26];

        removeDuplicat("Hello", 0, boolList, "");
    }

}
