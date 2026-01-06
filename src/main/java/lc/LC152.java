package lc;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class LC152 {
    int dp[];
    public int maxProduct(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        for(int i=0; i < nums.length; i++){
            int product = traverse(nums, 0, i);
            //System.out.println(product);
        }
        return 0;
    }

    int traverse(int[] nums, int product, int index){
        //System.out.println(index);
        if(index >= nums.length) return product;
        //System.out.println(index);

       // if(dp[index] == -1){
            System.out.print(index + ", ");
            dp[index] = traverse(nums, product * nums[index], index + 1);
        System.out.println();
        //}

        return dp[index] * product;
    }
}

class LC152Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC152 lc152 = new LC152();

        int[] nums =  {2,3,-2,4};
        int result = lc152.maxProduct(nums);
        System.out.println(result);
    }
}