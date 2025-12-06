package leetcode;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public int[] find1(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0, j = 1, k = nums.length-1;
        while(i < nums.length-1){
            if(j < nums.length && nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                break;
            }
            if(k > i && j < k && j != k && nums[i] + nums[k] == target){
                result[0] = i;
                result[1] = k;
                break;
            }
            if(j > k){
                i = i+1;
                j = i+1;
                k = nums.length-1;
            }else{
                j++;
                k--;
            }
        }

        return result;
    }

    public int[] find(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null || nums.length < 2) {
            return result;
        }

        Map<Integer, Integer> map = new java.util.HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);    
        }

        return result;
    }
}
class TwoSumTest {
    public static void main(String[] args) throws FileNotFoundException {
        TwoSum twoSum = new TwoSum();

        int target = 6;
        //int []input = new int[]{2,7,11,15};
        int []input = new int[]{3,3};
        int[] result = twoSum.find(input, target);
        System.out.println(result[0] + "," + result[1]);
    }
}