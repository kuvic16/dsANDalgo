package lc;

import java.util.LinkedHashMap;

public class LC1031 {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int secondArr[] = new int[nums.length - secondLen+1]; int idx= 0;
        for(int j=0; j<secondLen; j++){
            secondArr[idx] += nums[j];
        }

        for(int j=1; j-1+secondLen<nums.length; j++){
            secondArr[idx+1] = secondArr[idx] - nums[j-1] + nums[j-1+secondLen];
            idx++;
        }

        int max = 0, firstSum = 0;
        for(int j=0; j<firstLen; j++){
            firstSum += nums[j];
        }

        for(int i=0; i-1+firstLen<nums.length; i++){
            if(i != 0) firstSum = firstSum - nums[i-1] + nums[i-1+firstLen];
            int maxSecondSum = 0;
            for(int j=0; j-1+secondLen<i; j++) maxSecondSum = Math.max(maxSecondSum, secondArr[j]);
            for(int j=i+firstLen; j<secondArr.length; j++) maxSecondSum = Math.max(maxSecondSum, secondArr[j]);
            max = Math.max(max, firstSum + maxSecondSum);
        }
        return max;
    }
}

class LC1031Test {
    public static void main(String[] args){
        LC1031 lc1031 = new LC1031();
        //int[] nums = {0,6,5,2,2,5,1,9,4}; int firstLen = 1, secondLen = 2;
        //int[] nums = {3,8,1,3,2,1,8,9,0}; int firstLen = 3, secondLen = 2;
        //int[] nums = {2,1,5,6,0,9,5,0,3,8}; int firstLen = 4, secondLen = 3;
        int[] nums = {8,20,6,2,20,17,6,3,20,8,12}; int firstLen = 5, secondLen = 4;
        int result = lc1031.maxSumTwoNoOverlap(nums, firstLen, secondLen);
        System.out.println(result);
    }
}