package leetcode.graph.dfs;

import java.util.*;

public class LC1466 {
    List<List<Integer>> orAdjList = new ArrayList<>();
    List<List<Integer>> adjList = new ArrayList<>();
    Set<Integer> visited = new HashSet<>();
    int count = 0;
    public int minReorder(int n, int[][] connections) {
        for(int i=0; i<n; i++){
            orAdjList.add(new ArrayList<>());
            adjList.add(new ArrayList<>());
        }

        for (int[] paths : connections) {
            orAdjList.get(paths[0]).add(paths[1]);
            adjList.get(paths[0]).add(paths[1]);
            if (!adjList.get(paths[1]).contains(paths[0])) {
                adjList.get(paths[1]).add(paths[0]);
            }
        }
        traverse(0);
        return count;
    }

    public void traverse(int index){
        visited.add(index);
        for (Integer x : adjList.get(index)) {
            if (!visited.contains(x)) {
                List<Integer> adjs = orAdjList.get(x);
                if (adjs != null && !adjs.contains(index)) {
                    count += 1;
                }
                traverse(x);
            }
        }
    }
}

class LC1466Test{
    public static void main(String[] args){
        LC1466 lc1466 = new LC1466();
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        System.out.println(lc1466.minReorder(6, connections));

//        int[][] connections = {{1,0},{1,2},{3,2},{3,4}};
//        System.out.println(lc1466.minReorder(5, connections));

//        int[][] connections = {{1,0},{1,2},{2,3},{4,2}};
//        System.out.println(lc1466.minReorder(5, connections));

//        int[][] connections = {{1,2},{2,0}};
//        System.out.println(lc1466.minReorder(3, connections));


//        [[1,0],[1,2],[2,3],[4,2]]
    }
}
