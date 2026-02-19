package lc;

import java.util.*;

public class LC718 {
    public int findLength(int[] nums1, int[] nums2) {
        int max = Integer.MIN_VALUE;
        int[] numi = new int[101];
        Arrays.fill(numi, -1);

        for(int i=0; i<nums2.length; i++){
            if(numi[nums2[i]] == -1) numi[nums2[i]] = i;
        }

        for(int i=0; i<nums1.length; i++){
            int count = 0; int k = i;
            for(int j = numi[nums1[i]]; j > -1 && j<nums2.length && k < nums1.length; j++){
                if(nums1[k++] == nums2[j]) count++;
                else break;
            }
            max = Math.max(max, count);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}

class LC718Test {
    public static void main(String[] args) {
        LC718 lc718 = new LC718();
        //int[] nums = {1,2,3,2,1}, nums2 = {3,2,1,4,7};
        //int[] nums = {0,0,0,0,0}, nums2 = {0,0,0,0,0};
        int[] nums = {0,0,0,0,0,0,1,0,0,0}, nums2 = {0,0,0,0,0,0,0,1,0,0};
        int result = lc718.findLength(nums, nums2);
        System.out.println(result);
    }
}


