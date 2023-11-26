package leetcode.graph.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC994 {
    int fresh = 0;
    int count = 0;
    int rotten = 0;
    //int[][] visited = {};
    int[][] grid = {};
    Queue<List<Integer>> queue = new LinkedList<>();
    public int orangesRotting(int[][] grid) {
        this.grid = grid;
        int x = -1, y = -1;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1) fresh += 1;
                if(grid[i][j] == 2){x = i; y = j;}
            }
        }
        if(fresh == 0) return 0;
        if(x == -1) return -1;
        //this.visited = new int[grid.length][grid[0].length];
        queue.offer(Arrays.stream(new Integer[]{x, y}).toList());
        while(!queue.isEmpty()){
            //count += 1;
            List<Integer> xy = queue.poll();
            int i = xy.get(0), j = xy.get(1);
            makeRotten(i, j);
            if(fresh == rotten) break;
        }
        return fresh == rotten ? count : -1;
    }

    public void makeRotten(int i, int j){
        grid[i][j] = 2;
        //visited[i][j] = 1;

        boolean hasRotted = false;
        if(j+1 < grid[i].length && grid[i][j+1] == 1 && !queue.contains(Arrays.stream(new Integer[]{i, j+1}).toList())) {
            rotten += 1;
            queue.offer(Arrays.stream(new Integer[]{i,j+1}).toList());
            hasRotted = true;
        }

        if(i+1 < grid.length && grid[i+1][j] == 1 && !queue.contains(Arrays.stream(new Integer[]{i+1, j}).toList())) {
            rotten += 1;
            queue.offer(Arrays.stream(new Integer[]{i+1,j}).toList());
            hasRotted = true;
        }

        if(j-1 >= 0 && grid[i][j-1] == 1 && !queue.contains(Arrays.stream(new Integer[]{i, j-1}).toList())) {
            rotten += 1;
            queue.offer(Arrays.stream(new Integer[]{i,j-1}).toList());
            hasRotted = true;
        }

        if(i-1 >= 0 && grid[i-1][j] == 1 && !queue.contains(Arrays.stream(new Integer[]{i-1, j}).toList())) {
            rotten += 1;
            queue.offer(Arrays.stream(new Integer[]{i-1,j}).toList());
            hasRotted = true;
        }

        if(hasRotted) count += 1;
    }

//    public void makeRotten(int i, int j){
//        grid[i][j] = 2;
//        //visited[i][j] = 1;
//
//        boolean hasRotted = false;
//        if(j+1 < grid[i].length && grid[i][j+1] == 1 && visited[i][j+1] == 0 && !queue.contains(Arrays.stream(new Integer[]{i, j+1}).toList())) {
//            rotten += 1;
//            queue.offer(Arrays.stream(new Integer[]{i,j+1}).toList());
//            hasRotted = true;
//        }
//
//        if(i+1 < grid.length && grid[i+1][j] == 1 && visited[i+1][j] == 0 && !queue.contains(Arrays.stream(new Integer[]{i+1, j}).toList())) {
//            rotten += 1;
//            queue.offer(Arrays.stream(new Integer[]{i+1,j}).toList());
//            hasRotted = true;
//        }
//
//
//        if(j-1 >= 0 && grid[i][j-1] == 1 && visited[i][j-1] == 0 && !queue.contains(Arrays.stream(new Integer[]{i, j-1}).toList())) {
//            rotten += 1;
//            queue.offer(Arrays.stream(new Integer[]{i,j-1}).toList());
//            hasRotted = true;
//        }
//        if(i-1 >= 0 && grid[i-1][j] == 1 && visited[i-1][j] == 0 && !queue.contains(Arrays.stream(new Integer[]{i-1, j}).toList())) {
//            rotten += 1;
//            queue.offer(Arrays.stream(new Integer[]{i-1,j}).toList());
//            hasRotted = true;
//        }
//
//        if(hasRotted) count += 1;
//    }

    public static void main(String[] args){
        LC994 lc994 = new LC994();
        int[][] grid = {};
        grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        grid = new int[][]{{2,1,1},{0,1,1},{1,0,1}};
        grid = new int[][]{{0,2}};
        grid = new int[][]{{2,1,1},{1,1,1},{0,1,2}};
        System.out.println(lc994.orangesRotting(grid));
    }
}
