package leetcode.graph.bfs;

import java.util.*;

public class LC994 {
    int fresh = 0;
    int count = 0;
    int rotten = 0;
    int[][] level = {};
    int[][] grid = {};
    Queue<List<Integer>> queue = new LinkedList<>();

    public int orangesRotting(int[][] grid) {
        this.grid = grid;
        this.level = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1) fresh += 1;
                if(grid[i][j] == 2){
                    queue.offer(Arrays.stream(new Integer[]{i, j}).toList());
                }
            }
        }
        if(fresh == 0) return 0;
        if(queue.isEmpty()) return -1;

        while(!queue.isEmpty()){
            List<Integer> xy = queue.poll();
            int i = xy.get(0), j = xy.get(1);
            makeRotten(i, j, this.level[i][j]);
            if(fresh == rotten) break;
        }
        return fresh == rotten ? count : -1;
    }

    public void makeRotten(int i, int j, int level){
        grid[i][j] = 2;

        boolean hasRotted = false;
        if(j+1 < grid[i].length && grid[i][j+1] == 1 && !queue.contains(Arrays.stream(new Integer[]{i, j+1}).toList())) {
            rotten += 1;
            queue.offer(Arrays.stream(new Integer[]{i,j+1}).toList());
            this.level[i][j+1] = level + 1;
            hasRotted = true;
        }

        if(i+1 < grid.length && grid[i+1][j] == 1 && !queue.contains(Arrays.stream(new Integer[]{i+1, j}).toList())) {
            rotten += 1;
            queue.offer(Arrays.stream(new Integer[]{i+1,j}).toList());
            this.level[i+1][j] = level + 1;
            hasRotted = true;
        }

        if(j-1 >= 0 && grid[i][j-1] == 1 && !queue.contains(Arrays.stream(new Integer[]{i, j-1}).toList())) {
            rotten += 1;
            queue.offer(Arrays.stream(new Integer[]{i,j-1}).toList());
            this.level[i][j-1] = level + 1;
            hasRotted = true;
        }

        if(i-1 >= 0 && grid[i-1][j] == 1 && !queue.contains(Arrays.stream(new Integer[]{i-1, j}).toList())) {
            rotten += 1;
            queue.offer(Arrays.stream(new Integer[]{i-1,j}).toList());
            this.level[i-1][j] = level + 1;
            hasRotted = true;
        }

        if(hasRotted) count = level+1;
    }

    public static void main(String[] args){
        LC994 lc994 = new LC994();
        int[][] grid = {};
        grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        //grid = new int[][]{{2,1,1},{0,1,1},{1,0,1}};
        //grid = new int[][]{{0,2}};
        //grid = new int[][]{{2,1,1},{1,1,1},{0,1,2}};
        System.out.println(lc994.orangesRotting(grid));
    }
}
