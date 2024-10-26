package recursion;

public class PlaceTiles {
    public static int placeCount(int n, int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalPlaceCount = placeCount(n-m, m);
        int horizontalPlaceCount = placeCount(n-1, m);
        return verticalPlaceCount+horizontalPlaceCount;
    }
    public static void main(String args[]){
        int n = 4;
        int m = 3;
     int totalPlaceCount =   placeCount(n, m);
     System.out.println(totalPlaceCount);
    }


}
