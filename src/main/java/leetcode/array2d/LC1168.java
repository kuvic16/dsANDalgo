package leetcode.array2d;

import java.util.ArrayList;
import java.util.List;

public class LC1168 {
    public enum direction{TOP, RIGHT, BOTTOM, LEFT};
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        String cd = direction.TOP.toString();
        int t=0, b= matrix.length-1, l=0, r=matrix[0].length-1;
        int i=0, j=0;
        int m=matrix.length, n=matrix[0].length;
        while(result.size() < m*n && (t != b || l != r)){
            result.add(matrix[i][j]);
            if(cd.equalsIgnoreCase(direction.TOP.toString())){
                if(j < r) j++;
                else if(j == r){
                    cd = direction.RIGHT.toString();
                    t++;
                    i++;
                }else break;
            }else if(cd.equalsIgnoreCase(direction.RIGHT.toString())){
                if(i < b) i++;
                else if(i == b){
                    cd = direction.BOTTOM.toString();
                    r--;
                    j--;
                }else break;
            }else if(cd.equalsIgnoreCase(direction.BOTTOM.toString())){
                if(j > l) j--;
                else if(j == l){
                    cd = direction.LEFT.toString();
                    b--;
                    i--;
                }else break;
            }else if(cd.equalsIgnoreCase(direction.LEFT.toString())){
                if(i > t) i--;
                else if(i == t){
                    cd = direction.TOP.toString();
                    l++;
                    j++;
                }else break;
            }
        }
        if(result.size() < m*n && i<=m && j<=n){
            result.add(matrix[i][j]);
        }

        return result;
    }
}

class LC1168Test {
    public static void main(String[] args){
        LC1168 lc1168 = new LC1168();
//        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result = lc1168.spiralOrder(matrix);
        System.out.println();
        for(Integer r : result) System.out.print(r + " ");
    }
}
