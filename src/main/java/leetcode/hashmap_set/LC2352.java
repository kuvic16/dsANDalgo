package leetcode.hashmap_set;

public class LC2352 {
    public int equalPairs(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j = 0; j<grid.length; j++){                
                boolean matched = true;
                for(int k=0; k<grid.length; k++){
                    if(grid[i][k] != grid[k][j]) {matched = false; break;}                    
                }
                if(matched) count++;                            
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
