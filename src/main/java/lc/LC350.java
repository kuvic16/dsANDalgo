package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LC350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            for(int j=0; j<nums1.length; j++){
                if(nums1[j] == nums2[i]){
                    res.add(nums2[i]);
                    nums1[j] = -1;
                    break;
                }
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

class LC350Test{
    public static void main(String[] args){
        LC350 lc350 = new LC350();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = lc350.intersect(nums1, nums2);
        for(int i : res) System.out.print(i + ", ");
    }
}