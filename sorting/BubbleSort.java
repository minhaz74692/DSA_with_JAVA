package sorting;

public class BubbleSort {
    static void printArray(int[] arrlist) {
        for (int i = 0; i < arrlist.length; i++) {
            System.out.print(arrlist[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 5, 1, 8 };

        //outer array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j];

                //Swap
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        printArray(arr);
        System.out.println();
    }
}
