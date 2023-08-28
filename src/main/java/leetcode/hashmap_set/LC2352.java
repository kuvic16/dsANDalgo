package leetcode.hashmap_set;

public class LC2352 {
    public int equalPairs(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            int tmp = 0;
            for(int j=0; j<grid[i].length; j++){
                if(j == 0) tmp = grid[i][j];
                else if(tmp == grid[i][j]) count++;
                else tmp = grid[i][j];
            }
        }
        return count;   
    }
}

class LC2352Test{
    public static void main(String[] args){
        LC2352 lc2352 = new LC2352();
        //int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(lc2352.equalPairs(grid));
    }
}
