package leetcode.array_and_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LC1147 {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if(n < 2) return -1;

        int max = 0, maxi= 0, smax = 0;
        for(int i=0; i<n; i++){
            if(i == 0) {
                max = nums[i];
                smax = nums[i];
            }
            else{
                if(max < nums[i]){
                    smax = max;
                    max = nums[i];
                    maxi= i;
                }else if(smax < nums[i]){
                    smax = nums[i];
                }
                if(max == smax) smax = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        return (max >= 2 * smax) ? maxi : -1;
    }
}

class LC1147Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1147 lc1147 = new LC1147();
        int[] nums = {3,6,1,0};
//        int[] nums = {1,2,3,4};
//        int[] nums = {1,0};
        int result = lc1147.dominantIndex(nums);
        System.out.println(result);
    }
}