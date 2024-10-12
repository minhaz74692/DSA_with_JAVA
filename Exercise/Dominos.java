public class Dominos {
    public static void main(String args[]) {

        int[][] arr = { { 1, 2}, { 1, 2 }, { 1, 2 },  {1,2 }};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j + 1 < arr[i].length && i+1 < arr.length) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
