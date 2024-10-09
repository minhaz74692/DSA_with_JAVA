package sorting;

public class IncertionSort {
    static void printArray(int[] arrlist) {
        for (int i = 0; i < arrlist.length; i++) {
            System.out.print(arrlist[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 5, 1, 8 };

        // Time Complexity = O(n^2)
        // outer array
        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current< arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
            
        }
        printArray(arr);
        System.out.println();
    }

}
