package leetcode;

import java.io.FileNotFoundException;
import java.util.List;

public class TwoSum {
    public int[] find(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0, j = 1, k = nums.length-1;
        while(i < nums.length){
            if(j < nums.length && j == k){
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
                j++;
            }
            if(k >= 0 && j != k){
                if(nums[i] + nums[k] == target) {
                    result[0] = i;
                    result[1] = k;
                }
                k--;
            }

            if(j > k){
                i = i+1;
                j = i+1;
                k = nums.length-1;
            }
        }

        return result;
    }
}
class TwoSumTest {
    public static void main(String[] args) throws FileNotFoundException {
        TwoSum twoSum = new TwoSum();

        int target = 9;
        int []input = new int[]{2,7,11,15};
        int[] result = twoSum.find(input, target);
        System.out.println(result[0] + "," + result[1]);
    }
}