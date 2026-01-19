package lc;

import java.util.Arrays;

public class LC594 {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        // for(int i=0; i<nums.length; i++) System.out.print(nums[i] + " ");
        // System.out.println();

        int left = 0, right = 0, count = 0, max_count = 0, max = Integer.MIN_VALUE, min = 0;
        //1 2 2 2 3 3 5 7 4
        while(left < nums.length && right < nums.length){
            if(left == right) {
                min = nums[left];
                count += 1;
                right += 1;
            }
            else if(Math.abs(nums[left] - nums[right]) <= 1) {
                count += 1;
                max = Math.max(max, nums[right]);
                right += 1;
            }
            else {
                if(max - min == 1) max_count = Math.max(max_count, count);
                count = 0;
                left += 1;
                right = left;
            }
        }
        if(max - min == 1) max_count = Math.max(max_count, count);
        if(max_count == 1) max_count = 0;
        return max_count;
    }
}

class LC594Test {
    public static void main(String[] args){
        LC594 lc594 = new LC594();
        int[] nums = {1,3,2,2,5,2,3,7};
        int result = lc594.findLHS(nums);
        System.out.println(result);
    }
}
