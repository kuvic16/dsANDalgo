package leetcode.array2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * (0,0)
 * (0,1) (1,0)
 * (2,0) (1,1) (0,2)
 * (1,2) (2,1)
 * (2,2)
 */
public class LC1167 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int x = 0, y=0; boolean isUpper = true;
        int[] result = new int[m*n]; int p =0;
        while(x < m && y < n){
            result[p++] = mat[x][y];
            if(isUpper){
                if(x-1>=0 && y+1<n){
                    x = x-1;
                    y = y+1;
                }else{
                    if(y == n-1) x=x+1;
                    else y=y+1;
                    isUpper = false;
                }
            }else{
                if(x+1<m && y-1>=0){
                    x = x+1;
                    y = y-1;
                }else{
                    if(x == m-1) y=y+1;
                    else x=x+1;
                    isUpper = true;
                }
            }
        }
        return result;
    }
}

class LC1167Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1167 lc1167 = new LC1167();
        //int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat = new int[][]{{1,2},{3,4}};
        int[] result = lc1167.findDiagonalOrder(mat);
        System.out.println();
        for(int r : result) System.out.print(r + " ");
    }
}
