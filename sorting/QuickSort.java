package sorting;


// Time Complexity: 0(n^2) -- Worst case: while pivot is always the smallest or the largest element
public class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++; // creating place for actual data
                // Swap position
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        i++; // Create position for pivot's actual location
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int arr[], int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Quick sort first half
            quicksort(arr, low, pivotIndex - 1);

            // Quick sort last half
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quicksort(arr, 0, n - 1);

        // System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

}
