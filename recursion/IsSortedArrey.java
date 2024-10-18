package recursion;

public class IsSortedArrey {// Arrey Must Strictly Ascending
    public static void FindSotedStatus(int[] arr, int ind, int prev) {

        if (ind == arr.length) {

            System.err.println("This is a Strictly sorted integer arrey");
            return;
        }
        if (arr[ind] <= prev) {
            System.err.println("This is not a Strictly sorted integer arrey");
            return;
        }

        FindSotedStatus(arr, ind + 1, arr[ind]);


    }

    public static boolean FindSotedStatusByBoolean(int[] arr, int ind) {

        if (ind == arr.length - 1) {
            return true;
        }
        if (arr[ind] < arr[ind + 1]) {
            return FindSotedStatusByBoolean(arr, ind+1);
        } else {
            return false;
        }

        

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        FindSotedStatus(arr, 1, arr[0]);

        boolean isSorted = FindSotedStatusByBoolean(arr, 0);
        System.out.println(isSorted);
    }
}
