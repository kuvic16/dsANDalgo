package leetcode.hashmap_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LC2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
    
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();
        
        int i=0, j=0;
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length) map1.put(nums1[i++], 1);               
            if(j<nums2.length) map2.put(nums2[j++], 1);    
        }

        for (Map.Entry<Integer, Integer> e : map1.entrySet()){
            if(map2.get(e.getKey()) == null) r1.add(e.getKey());
        }
        for (Map.Entry<Integer, Integer> e : map2.entrySet()){
            if(map1.get(e.getKey()) == null) r2.add(e.getKey());
        }

        result.add(r1);
        result.add(r2);

        return result;
    }
}

class LC2215Test {
    public static void main(String[] args){
        LC2215 lc2215 = new LC2215();
        //List<List<Integer>> rs = lc2215.findDifference(new int[]{1,2,3}, new int[]{2,4,6});
        List<List<Integer>> rs = lc2215.findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2});
        for(List<Integer> r : rs){
            for(Integer n : r) System.out.print(n);
            System.out.println();
        }

    }
}