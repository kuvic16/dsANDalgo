package leetcode.array101;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class LC3157 {
    public void moveZeroes(int[] nums) {

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 && i+1 < nums.length){
                int next = -1, j=i+1;
                while(j+1 < nums.length && nums[j] == 0){
                    j += 1;
                }
                next = j;
                for(int k=i; k<nums.length; k++){
                    if(next < nums.length) {
                        nums[k] = nums[next++];
                    }else {
                        nums[k] = 0;
                    }
                }
            }
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public void moveZeroes1(int[] nums) {
        int n = nums.length;
        int numberOfZeroes = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0) numberOfZeroes += 1;
        }

        Queue<Integer> ans = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(nums[i] != 0) ans.offer(nums[i]);
        }

        for(int i=1; i<= numberOfZeroes; i++){
            ans.offer(0);
        }

        for(int i=0; i<n; i++){
            nums[i] = ans.poll();
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public void moveZeroes2(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }

        for(int i=j; i<nums.length; i++){
            nums[i] = 0;
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public void moveZeroes3(int[] nums) {
        for(int lnzfa=0, curr=0; curr < nums.length; curr++){
            if(nums[curr] != 0){
                int tmp = nums[curr];
                nums[curr] = nums[lnzfa];
                nums[lnzfa] = tmp;
                lnzfa += 1;
            }
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}

class LC3157Test {
    public static void main(String[] args){
        LC3157 lc3157 = new LC3157();
        //int[] nums = new int[]{0,1,0,3,12};
        //int[] nums = new int[]{0};
        int[] nums = new int[]{0, 0, 1};
        lc3157.moveZeroes3(nums);
    }
}
