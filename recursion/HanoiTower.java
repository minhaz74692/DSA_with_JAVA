package recursion;


// Time Complexity = O(2^n -1) or O(2^n)
public class HanoiTower {
    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");

    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n ==1){
            System.out.println("Transfer disk "+n+" from "+ src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+ src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);

    }
}
