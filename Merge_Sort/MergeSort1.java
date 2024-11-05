package Merge_Sort;

// Time Complexity O(nlogn)
public class MergeSort1 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 1, 9, 12, 3 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si; // This index tracking first array
        int idx2 = mid + 1; // This index tracking second array
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // this loop is for merging the existing all element in array 1
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // this loop is for merging the existing all element in array 2
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid); // Devide first half
        divide(arr, mid + 1, ei); // Devide Second half
        conquer(arr, si, mid, ei);
    }

}
