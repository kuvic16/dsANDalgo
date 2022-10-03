package leetcode.array2d;

import java.util.ArrayList;
import java.util.List;

public class LC1168 {
    public enum direction{TOP, RIGHT, BOTTOM, LEFT};
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        String cd = direction.TOP.toString();
        int x1=0, x2= matrix.length-1, y1=0, y2 = matrix[0].length;
        int i=0, j=0;
        int m=matrix.length-1, n=matrix[0].length;
        while(x1 != x2 && y1 != y2){
            result.add(matrix[i][j]);
            if(cd.equalsIgnoreCase(direction.TOP.toString())){
                if(j < n) j++;
                if(j == n-1){
                    cd = direction.LEFT.toString();
                }
            }else if(cd.equalsIgnoreCase(direction.LEFT.toString())){
                if(i < m) i++;
                if(i == m-1){
                    cd = direction.BOTTOM.toString();
                }
            }else if(cd.equalsIgnoreCase(direction.BOTTOM.toString())){
                if(j >= 0) j--;
                if(j == 0){
                    cd = direction.RIGHT.toString();
                }
            }else if(cd.equalsIgnoreCase(direction.RIGHT.toString())){
                if(j >= 0) j--;
                if(j == 0){
                    cd = direction.RIGHT.toString();
                }
            }
        }

        return result;
    }
}

class LC1168Test {
    public static void main(String[] args){
        LC1168 lc1168 = new LC1168();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = lc1168.spiralOrder(matrix);
        System.out.println();
        for(Integer r : result) System.out.print(r + " ");
    }
}
