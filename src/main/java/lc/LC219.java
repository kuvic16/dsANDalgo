package lc;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LC219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && i != map.get(nums[i])){
                if(Math.abs(map.get(nums[i]) - i) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

class LC219Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC219 lc219 = new LC219();
        //int[] nums = {1,2,3,1}; int k = 3;
        //int[] nums = {1,0,1,1}; int k = 1;
        int[] nums = {1,2,3,1,2,3}; int k = 2;
        boolean result = lc219.containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }
}