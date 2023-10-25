package leetcode.graph.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC1466 {
    List<List<Integer>> orAdjList = new ArrayList<>();
    List<List<Integer>> adjList = new ArrayList<>();
    Stack<Integer> visited = new Stack<>();
    int count = 0;
    public int minReorder(int n, int[][] connections) {
        for(int i=0; i<n; i++){
            orAdjList.add(new ArrayList<>());
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<connections.length; i++){
            int[] paths = connections[i];
            orAdjList.get(paths[0]).add(paths[1]);
            adjList.get(paths[0]).add(paths[1]);
            if(!adjList.get(paths[1]).contains(paths[0])){
                adjList.get(paths[1]).add(paths[0]);
            }
        }
        traverse(0);
        return count;
    }

    public void traverse(int index){
        if(!visited.contains(index)) {
            visited.push(index);
            for (Integer x : adjList.get(index)) {
                if (!visited.contains(x)) {
                    List<Integer> adjs = orAdjList.get(x);
                    if (adjs != null && !adjs.contains(index)) {
                        count += 1;
                        adjList.get(x).remove(adjList.get(x).indexOf(index));
                    }
                    traverse(x);
                }
            }
        }
    }

//    public Stack<Integer> visited = new Stack<>();
//    public int path = 0;
//    public int destination = 0;
//    int[][] adjList = {};
//    public int minReorder(int n, int[][] connections) {
//        adjList = connections;
//        traverse(0, adjList.length);
//        return path;
//    }
//
//    public void traverse(int index, int n){
//        if(index >= n) return;
//
//        if(!visited.contains(index)) {
//            int[] list = adjList[index];
//            if(list[0] == destination || list[1] == destination){
//                visited.push(index);
//                if(list[0] == destination) {
//                    path += 1;
//                    destination = list[1];
//                }else destination = list[0];
//
//                traverse(index+1, n);
//            }else{
//                if(visited.size() < adjList.length){
//                    destination = 0;
//                    traverse(0, n);
//                }
//            }
//        }
//        traverse(index+1, n);
//    }
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
