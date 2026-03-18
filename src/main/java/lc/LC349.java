package lc;

import java.util.*;

public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(set1.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int result[] = new int[res.size()];
        int j=0;
        for (Integer i : res) {
            result[j++] = i;
        }
        return result;
    }
}

class LC349Test{
    public static void main(String[] args){
        LC349 lc349 = new LC349();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = lc349.intersection(nums1, nums2);
        for(int r : result) System.out.print(r + " ");
    }
}
