package leetcode.contest.Contest362;

public class LC100030 {
    public int minimumMoves(int[][] grid) {
        return 0;
    }
}

class LC100030Test{
    public static void main(String[] args){
        LC100030 lc100030 = new LC100030();
        // int[][] grid = new int[][]{{1,3,0},{1,0,0},{1,0,3}};
        int[][] grid = new int[][]{{1,1,0},{1,1,1},{1,2,1}};

        System.out.println(lc100030.minimumMoves(grid));
    }
}
