package leetcode.heap_priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class LC215 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            queue.offer(nums[i]);
        }
        for(int i=0; i<nums.length-k; i++){
            queue.poll();
        }
        return queue.poll();
    }

    public static void main(String[] args){
        LC215 lc215 = new LC215();
        int[] nums = {};
        int k = 0;

        nums = new int[]{3,2,1,5,6,4};
        k = 2;

        //nums = new int[]{3,2,3,1,2,4,5,5,6};
        //k = 4;

        System.out.println(lc215.findKthLargest(nums, k));
    }
}
