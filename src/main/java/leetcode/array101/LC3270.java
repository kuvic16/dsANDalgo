package leetcode.array101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC3270 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();

        Arrays.sort(nums);

        int Lj=0, prev=0;
        for(int i=0; i<nums.length; i++){
            if(i == 0 || nums[i] != prev){
                nums[Lj++] = nums[i];
            }
            prev = nums[i];
        }

        int o = 1; prev = 0;
        for(int i=0; i<Lj; i++){
            if(nums[i] != o){
                for(int k=1; k<(nums[i] - prev); k++) missing.add(prev+k);
            }
            prev = nums[i];
            o = prev + 1;
        }

        if(nums.length != o-1){
            for(int k=1; k<=(nums.length - (o-1)); k++) missing.add((o-1)+k);
        }

        return missing;
    }
}

class LC3270Test {
    public static void main(String[] args){
        LC3270 lc3270 = new LC3270();
        //int[] nums = new int[] {4,3,2,7,8,2,3,1};
        //int[] nums = new int[] {1, 1};
        int[] nums = new int[] {2, 2};
        List<Integer> r = lc3270.findDisappearedNumbers(nums);
        for(Integer i : r) System.out.print(i + " ");
    }
}

