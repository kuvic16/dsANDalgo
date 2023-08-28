package leetcode.hashmap_set;

import java.util.HashMap;
import java.util.Map;

public class LC1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> uniq = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(uniq.get(arr[i]) == null) uniq.put(arr[i], 1);
            else uniq.put(arr[i], uniq.get(arr[i])+1);
        }

        HashMap<Integer, Integer> uniqOc = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : uniq.entrySet()){
            if(uniqOc.get(e.getValue()) == null) uniqOc.put(e.getValue(), 1);
            else return false;
        }
        return true;
    }
}

class LC1207Test{
    public static void main(String[] args){
        LC1207 lc1207 = new LC1207();
        //System.out.println(lc1207.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        //System.out.println(lc1207.uniqueOccurrences(new int[]{1,2}));
        System.out.println(lc1207.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}