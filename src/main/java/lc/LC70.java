package lc;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class LC70 {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return traverse(n, 0);
    }

    int traverse(int n, int path){
        if(n == 0) return path + 1;
        if(n <= 0) return path;

        if(dp[n] > -1) return dp[n];
        return dp[n] = traverse(n - 1, path) + traverse(n - 2, path);
    }
}

class LC70Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC70 lc70 = new LC70();

        int input = 3;
        int output = lc70.climbStairs(input);
        System.out.println(output);
    }
}