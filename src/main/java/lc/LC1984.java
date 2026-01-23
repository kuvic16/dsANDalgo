package lc;

import java.util.Arrays;
import java.util.Map;

public class LC1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        // 9,4,1,7
        // 1,4,7,9 k=2
        int min = Integer.MAX_VALUE;
        for(int i=0; i+k-1<nums.length; i++){
            for(int j=0; j+k-1<nums.length; j++){
                min = Math.min(min, nums[j+k-1] - nums[j]);
            }
        }
        return min;
    }
}

class LC1984Test{
    public static void main(String[] args){
        LC1984 lc198 = new LC1984();
//        int[] nums = {9,4,1,7};
//        int k = 2;

        int[] nums = {90};
        int k = 1;

        int out = lc198.minimumDifference(nums, k);
        System.out.println(out);
    }
}
