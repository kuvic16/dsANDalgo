package leetcode;

import java.io.FileNotFoundException;

public class MinimumSizeSubarraySum {
    //2,3,1,2,4,3
    //2,5,6,8,12,15

    public int minSubArrayLen(int target, int[] nums) {
        int left=0, right = 0, minLength = 0, sum = 0;
        while (right<nums.length && left<nums.length && left <= right){
            sum += nums[right];
            if(sum >= target){
                int length = right - left + 1;
                if(minLength == 0) minLength = length;
                else if(length < minLength) minLength = length;
                sum = sum - nums[left] - nums[right];
                left = left + 1;
            }else if(right < nums.length){
                right = right + 1;
            }
            System.out.println("left: " + left + ", right: " + right + ", sum: " + sum + ", minLength: " + minLength);
        }
        return minLength;
    }
    public int XminSubArrayLen(int target, int[] nums) {
        int i=0;
        int minLength = 0; int[] sums = new int[nums.length];
        while (i<nums.length){
            int sum = 0; int length = 0;
            //if(i == 0) sums[i] = nums[i];
            //else sums[i] = nums[i] + sums[i-1];
            boolean matched = false;
            for (int j = i; j<nums.length; j++){
                sum += nums[j];
                length += 1;
                if(sum >= target){
                    if(minLength == 0 && length > 0) minLength = length;
                    else if(minLength > length) {
                        minLength = length;
                    }
                    //if(j > 0) i = j - 1;
                    break;
                }else if(length >= minLength){
                    break;
                }
            }
            //if(!matched)
            i++;
        }
        return minLength;
    }


}

class MinimumSizeSubarraySumTest {
    public static void main(String[] args) throws FileNotFoundException {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();

//        int target = 7;
//        int []nums = {2,3,1,2,4,3};
        int target = 11;
        int []nums = {1,1,1,1,1,1,1,1};
        int output = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        System.out.println(output);
    }
}