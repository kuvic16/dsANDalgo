package lc;

import java.util.*;

public class LC718 {
    public int findLength(int[] nums1, int[] nums2) {
        int max = Integer.MIN_VALUE;
        int[][] numi = new int[101][nums2.length];
        for (int[] row : numi) {
            Arrays.fill(row, -1);
        }

        for(int i=0; i<nums2.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(numi[nums2[i]][j] == -1) {
                    numi[nums2[i]][j] = i;
                    break;
                }
            }
        }

        for(int i=0; i<nums1.length; i++){
            int[] ixs = numi[nums1[i]];
            for(int l=0; l<ixs.length && ixs[l] != -1; l++){
                int count = 0; int k = i;
                for(int j = ixs[l]; j > -1 && j<nums2.length && k < nums1.length; j++){
                    if(nums1[k++] == nums2[j]) count++;
                    else break;
                }
                max = Math.max(max, count);
            }
            if(max == nums1.length) break;
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}

class LC718Test {
    public static void main(String[] args) {
        LC718 lc718 = new LC718();
        //int[] nums = {1,2,3,2,1}, nums2 = {3,2,1,4,7};
        //int[] nums = {1,0,0,0,1}, nums2 = {1,0,0,1,1};
        //int[] nums = {0,0,0,0,0}, nums2 = {0,0,0,0,0};
        int[] nums = {0,0,0,0,0,0,1,0,0,0}, nums2 = {0,0,0,0,0,0,0,1,0,0};
        int result = lc718.findLength(nums, nums2);
        System.out.println(result);
    }
}


