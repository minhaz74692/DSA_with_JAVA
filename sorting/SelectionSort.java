package sorting;

public class SelectionSort {
    static void printArray(int[] arrlist) {
        for (int i = 0; i < arrlist.length; i++) {
            System.out.print(arrlist[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 5, 1, 8 };

        // Time Complexity = O(n^2)
        // outer array
        for (int i = 0; i < arr.length - 1; i++) {

            int smallest = arr[i];
            int swapLocation = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    swapLocation = j;
                }
            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[swapLocation] = temp;

        }
        printArray(arr);
        System.out.println();
    }
}
