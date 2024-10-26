package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class ConstructtheRectangle {
    public static void main(String arg[]) {
        int area = 35;
        int w = 1;
        int l = area;
        for (int i = 1; i <= area / 2; i++) {
            if (area % i == 0) {
                int width = i;
                int length = area / i;
                if (width > length || (length - width) > (l - w)) {
                    continue;
                }
                l = length;
                w = width;
            }
        }
        int[] result = new int[2];
        result[0] =l;
        result[1] =w;
        System.out.println(Math.sqrt(area));
    }
}
