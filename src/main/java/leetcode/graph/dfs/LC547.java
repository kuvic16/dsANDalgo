package leetcode.graph.dfs;

import java.util.List;
import java.util.Stack;

public class LC547 {
    Stack<Integer> towns = new Stack<>();
    int[][] adjList = new int[0][0];
    public int findCircleNum(int[][] isConnected) {
        int totalProvinces = 0;
        adjList = isConnected;
        for(int i=0; i<adjList.length; i++){
            boolean found = false;
            if(!towns.contains(i)){
                for(int j=0; j<adjList.length; j++){
                    if(adjList[i][j] == 1){
                        found = true;
                        if(i != j) traverse(j);
                    }
                }
                if(found) totalProvinces += 1;
            }
        }
        return totalProvinces;
    }

    public void traverse(int vertex){
        towns.push(vertex);
        for(int j=0; j<adjList.length; j++){
            if(adjList[vertex][j] == 1 && vertex != j && !towns.contains(j)){
                traverse(j);
            }
        }
    }
}


class LC547Test {
    public static void main(String[] args){
        LC547 lc547 = new LC547();

        //int[][] matrix = {{1,1,0},{1,1,0},{0,0,1}};
        int[][] matrix = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(lc547.findCircleNum(matrix));
    }
}