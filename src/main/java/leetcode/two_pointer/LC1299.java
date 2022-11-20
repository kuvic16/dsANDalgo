package leetcode.two_pointer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LC1299 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = 9999999;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return (ans != 9999999) ? ans : 0;
    }
}

class LC1299Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1299 lc1299 = new LC1299();
//        int target = 7;
//        int[] nums = {2,3,1,2,4,3};
        int target = 213;
        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        int result = lc1299.minSubArrayLen(target, nums);
        System.out.println();
        System.out.println(result);
    }
}
