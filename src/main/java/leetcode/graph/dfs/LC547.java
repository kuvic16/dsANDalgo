package leetcode.graph.dfs;

public class LC547 {
    public int findCircleNum(int[][] isConnected) {
        return 0;
    }
}


class LC547Test {
    public static void main(String[] args){
        LC547 lc547 = new LC547();

        int[][] matrix = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(lc547.findCircleNum(matrix));
    }
}