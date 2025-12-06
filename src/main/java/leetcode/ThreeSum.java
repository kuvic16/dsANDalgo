package leetcode;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 121
 */
public class ThreeSum {

    public List<List<Integer>> generate(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> triplet = null;
        HashMap<List<Integer>, Boolean> map = new HashMap<>();
        
        Map<Integer, Integer> map1 = new java.util.HashMap<>();
        for(int i=0; i<nums.length && i + 2 <nums.length; i++){
            map1 = new java.util.HashMap<>();
            for(int j = i+1; j<nums.length; j++){
                int diff = 0 - (nums[i] + nums[j]);
                if(map1.containsKey(diff)) {
                    triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(diff);

                    triplet.sort(Integer::compareTo);
                    if(!map.containsKey(triplet)) {
                        map.put(triplet, true); 
                        result.add(triplet);
                    }
                }
                map1.put(nums[j], j);
            }
            //System.out.println("-------------------");
            //break;
        }
        return result;
    }


    public List<List<Integer>> generate1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> triplet = null;
        HashMap<List<Integer>, Boolean> map = new HashMap<>();
        int a, b, c = 0;
        for(int i=0; i<nums.length && i + 2 <nums.length; i++){
            a = nums[i];
            for(int j = i+1; j<nums.length; j++){
                b = nums[j];
                for(int k = j+1; k<nums.length; k++){
                    c = nums[k];
                    //System.out.println(a + "," + b + "," + c);

                    if(a + b + c == 0) {
                        triplet = new ArrayList<>();
                        triplet.add(a);
                        triplet.add(b);
                        triplet.add(c);

                        triplet.sort(Integer::compareTo);
                        if(!map.containsKey(triplet)) {
                            map.put(triplet, true); 
                            result.add(triplet);
                        }
                    }
                }
            }
            //System.out.println("-------------------");
            //break;
        }
        return result;
    }
}

class ThreeSumTest {
    public static void main(String[] args) throws FileNotFoundException {
        ThreeSum threeSum = new ThreeSum();

        int []input = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum.generate(input);
        for(List<Integer> r : result) {
            System.out.print(r.get(0) + "," + r.get(1) + "," + r.get(2));
            System.out.println();
        }
    }
}
