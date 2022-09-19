package leetcode.array101;

import java.util.LinkedList;
import java.util.Queue;

public class LC3260 {
    public int[] sortArrayByParity(int[] nums) {

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                queue.offer(nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 != 0){
                queue.offer(nums[i]);
            }
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = queue.poll();
        }


        return nums;
    }
}

class LC3260Test{
    public static void main(String[] args){
        LC3260 lc3260 = new LC3260();
        int[] nums = new int[]{3, 1, 2, 4};
        int[] result = lc3260.sortArrayByParity(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(result[i]);
        }
    }
}
