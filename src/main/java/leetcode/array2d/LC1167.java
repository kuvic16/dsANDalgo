package leetcode.array2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LC1167 {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] result = new int[12];
        
        return result;
    }
}

class LC1167Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1167 lc1167 = new LC1167();
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] result = lc1167.findDiagonalOrder(mat);
        System.out.println();
        for(int r : result) System.out.print(r + " ");
    }
}
