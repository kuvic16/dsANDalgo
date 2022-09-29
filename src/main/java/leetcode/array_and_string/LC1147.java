package leetcode.array_and_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LC1147 {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if(n < 2) return -1;
        //Arrays.sort(nums);
        //nums[n-1] > nums[n-2]*2 ? 1 : 0;
        return -1;
    }
}

class LC1147Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1147 lc1147 = new LC1147();
        int[] nums = {3,6,1,0};
        int result = lc1147.dominantIndex(nums);
        System.out.println(result);
    }
}