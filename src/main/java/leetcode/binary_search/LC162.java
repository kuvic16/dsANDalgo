package leetcode.binary_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC162 {
    public int findPeakElement(int[] nums) {
        int[][] nnums = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            nnums[i][0] = nums[i];
            nnums[i][1] = i;
        }
        Arrays.sort(nnums, Comparator.comparingInt(a -> a[0]));
        for (int[] row : nnums) {
            System.out.println(Arrays.toString(row));
        }
        return nnums[nums.length-1][1];
    }

    public static void main(String[] args){
        LC162 lc162 = new LC162();

        int[] nums = {};
        nums = new int[]{1,2,3,1};
        nums = new int[]{1,2,1,3,5,6,4};
        System.out.println(lc162.findPeakElement(nums));
    }
}
