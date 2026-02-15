package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class LC718 {
    public int findLength(int[] nums1, int[] nums2) {
        HashMap<List<Integer>, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<nums1.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=i; j<nums1.length; j++){
                list.add(nums1[j]);
                map.put(new ArrayList<>(list), 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums2.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=i; j<nums2.length; j++){
                list.add(nums2[j]);
                if(map.containsKey(new ArrayList<>(list))){
                    max = Math.max(max, list.size());
                }
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}

class LC718Test {
    public static void main(String[] args) {
        LC718 lc718 = new LC718();
        //int[] nums = {1,2,3,2,1}, nums2 = {3,2,1,4,7};
        int[] nums = {0,0,0,0,0}, nums2 = {0,0,0,0,0};
        int result = lc718.findLength(nums, nums2);
        System.out.println(result);
    }
}


