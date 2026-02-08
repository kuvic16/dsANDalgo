package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC3364 {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.size(); i++){
            int sum = 0;
            for(int j=i; j<nums.size(); j++){
                sum += nums.get(j);
                if(l <= j-i+1 && j-i+1 <= r){
                    if(sum > 0) min = Math.min(min, sum);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

class LC3364Test {
    public static void main(String[] args){
        LC3364 lc3364 = new LC3364();
        List<Integer> nums = new ArrayList<>(Arrays.asList(new Integer[]{3, -2, 1, 4})); int l = 2, r = 3;
        //List<Integer> nums = new ArrayList<>(Arrays.asList(new Integer[]{-2, 2, -3, 1})); int l = 2, r = 3;

        int result = lc3364.minimumSumSubarray(nums, l, r);
        System.out.println(result);
    }
}
