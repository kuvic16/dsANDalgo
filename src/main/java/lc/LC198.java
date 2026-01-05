package lc;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class LC198 {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int x =  traverse(nums, 0, 0);
        int y =  traverse(nums, 0, 1);
        return Math.max(x,y);
    }

    int traverse(int[] nums, int sum, int i){
        if(i >= nums.length) return sum;
        if(dp[i] < -1) return dp[i];
        return dp[i] = traverse(nums, sum + nums[i], i + 2);
    }
}

class LC198Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC198 lc198 = new LC198();

        //int[] nums =  {1,2,3,1};
        //int[] nums =  {2,7,9,3,1};
        int[] nums =  {1,2};
        int result = lc198.rob(nums);
        System.out.println(result);
    }
}