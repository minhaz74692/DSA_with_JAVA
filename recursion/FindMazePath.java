package recursion;

public class FindMazePath {
    public static int findPath(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;

        }

        int countDownPath = findPath(i, j + 1, m, n);
        int countRightPath = findPath(i + 1, j, m, n);

        return countDownPath + countRightPath;
    }

    public static void main(String args[]) {
        int m = 4;
        int n = 4;
       int totalMazePath = findPath(0, 0, m, n);
        System.out.println(totalMazePath);
    }
}