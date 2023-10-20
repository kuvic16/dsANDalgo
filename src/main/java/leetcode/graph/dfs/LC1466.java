package leetcode.graph.dfs;

import java.util.Stack;

public class LC1466 {
    public Stack<Integer> visited = new Stack<>();
    public int path = 0;
    public int destination = 0;

    int[][] adjList = {};
    public int minReorder(int n, int[][] connections) {
        adjList = connections;
        traverse(0, adjList.length);
        return path;
    }

    public void traverse(int index, int n){
        if(index >= n) return;

        if(!visited.contains(index)) {
            int[] list = adjList[index];
            if(list[0] == destination || list[1] == destination){
                visited.push(index);
                if(list[0] == destination) {
                    path += 1;
                    destination = list[1];
                }else destination = list[0];

                traverse(index+1, n);
            }else{
                if(visited.size() < adjList.length){
                    destination = 0;
                    traverse(0, n);
                }
            }
        }
        traverse(index+1, n);
    }
}

class LC1466Test{
    public static void main(String[] args){
        LC1466 lc1466 = new LC1466();
//        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
//        System.out.println(lc1466.minReorder(6, connections));

//        int[][] connections = {{1,0},{1,2},{3,2},{3,4}};
//        System.out.println(lc1466.minReorder(6, connections));

        int[][] connections = {{1,0},{1,2},{2,3},{4,2}};
        System.out.println(lc1466.minReorder(6, connections));

//        [[1,0],[1,2],[2,3],[4,2]]
    }
}
