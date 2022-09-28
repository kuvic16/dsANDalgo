package leetcode.array_and_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LC1144 {
    public int pivotIndex1(int[] nums) {
        int n = nums.length;
        for(int j=0; j<n; j++){
            int left = 0, right = 0;
            for(int i=0; i<j; i++){
                left += nums[i];
            }
            for(int i=j+1; i<n; i++){
                right += nums[i];
            }
            if(left == right) return j;
        }
        return -1;
    }

    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }

}

class LC1144Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1144 lc1144 = new LC1144();
        int[] nums = {1,7,3,6,5,6};
//        int[] nums = {1,2,3};
//        int[] nums = {2,1,-1};
        int result = lc1144.pivotIndex(nums);
        System.out.println(result);
    }
}
