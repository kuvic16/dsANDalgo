package lc;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class LC198 {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        for(int i = nums.length; i>=0; i--) {
            traverse(nums, 0, i);
        }
        return Math.max(dp[0], dp[1]);
    }

    int traverse(int[] nums, int sum, int i){
        if(i >= nums.length) return sum;
        if(dp[i] == -1) {
            int x = traverse(nums, sum + nums[i], i + 2);
            int y = traverse(nums, sum + nums[i], i + 3);
            dp[i] = Math.max(x, y);
        }
        return sum + dp[i];
    }
}

class LC198Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC198 lc198 = new LC198();

        //int[] nums =  {1,2,3,1};
        //int[] nums =  {2,7,9,3,1};
        //int[] nums =  {1,2};
        //int[] nums =  {2,1,1,2};
        int[] nums =  {226,174,214,16,218,48,153,131,128,17,157,142,88,43,37,157,43,221,191,68,206,23,225,82,54,118,111,46,80,49,245,63,25,194,72,80,143,55,209,18,55,122,65,66,177,101,63,201,172,130,103,225,142,46,86,185,62,138,212,192,125,77,223,188,99,228,90,25,193,211,84,239,119,234,85,83,123,120,131,203,219,10,82,35,120,180,249,106,37,169,225,54,103,55,166,124};
        int result = lc198.rob(nums);
        System.out.println(result);
    }
}