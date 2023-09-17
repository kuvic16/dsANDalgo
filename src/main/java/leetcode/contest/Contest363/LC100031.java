package leetcode.contest.Contest363;

import java.util.ArrayList;
import java.util.List;

public class LC100031 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            String b = Integer.toBinaryString(i);
            if(b.replaceAll("0", "").length() == k) sum += nums.get(i);
        }
        return sum;
    }
}

class LC100031Test{
    public static void main(String[] args){
        LC100031 lc100031 = new LC100031();

        List<Integer> nums  = new ArrayList<>();
        int k = 0;


        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);
        k = 1;
        
        nums  = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        k = 2;

        System.out.println(lc100031.sumIndicesWithKSetBits(nums, k));
    }
}