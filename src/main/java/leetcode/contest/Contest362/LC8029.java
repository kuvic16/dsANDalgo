package leetcode.contest.Contest362;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC8029 {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashMap<Integer, Integer> points = new HashMap<>();
        for(List<Integer> num : nums){
            for(int i=num.get(0); i<=num.get(1); i++){
                points.put(i, 1);
            }
        }
        return points.size();
    }
}

class LC8029Test{
    public static void main(String[] args){
        LC8029 lc8029 = new LC8029();

        List<List<Integer>> nums = new ArrayList<>();
        List<Integer> sm = new ArrayList<>();
        // 1,2,3,4,5,6,7
        // sm.add(3);
        // sm.add(6);
        // nums.add(sm);

        // sm = new ArrayList<>();
        // sm.add(1);
        // sm.add(5);
        // nums.add(sm);

        // sm = new ArrayList<>();
        // sm.add(4);
        // sm.add(7);
        // nums.add(sm);

        // List<List<Integer>> nums = new ArrayList<>();
        // List<Integer> sm = new ArrayList<>();
        sm.add(1);
        sm.add(3);
        nums.add(sm);

        sm = new ArrayList<>();
        sm.add(5);
        sm.add(8);
        nums.add(sm);



        System.out.println(lc8029.numberOfPoints(nums));
    }
}