package leetcode.contest.Contest363;

import java.util.ArrayList;
import java.util.List;

public class LC100040 {
    public int countWays(List<Integer> nums) {
        int count = 0, n = nums.size(), sum = 0;
        for(int i=0; i<n; i++){
            if(nums.get(i) == 0) count += 1;
        }

        return count;
    }
}

class LC100040Test{
    public static void main(String[] args){
        LC100040 lc100040 = new LC100040();
        List<Integer> nums  = new ArrayList<>();
        nums.add(6);
        nums.add(0);
        nums.add(3);
        nums.add(3);
        nums.add(6);
        nums.add(7);
        nums.add(2);
        nums.add(7);
        System.out.println(lc100040.countWays(nums));
    }
}