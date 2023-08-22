package leetcode.sliding_window;

import leetcode.two_pointer.LC1679;

public class LC643 {
    public double findMaxAverage(int[] nums, int k) {
        double max_avg = Double.NEGATIVE_INFINITY;
        double current_sum = 0;

        for(int i=0; i<nums.length; i++){
            current_sum += nums[i];
            if(i >= k -1){
                double avg = current_sum / k;
                if(avg > max_avg) max_avg = avg;
                current_sum -= nums[i-k+1];
            }
        }
        return max_avg;
    }

    
}

class LC643Test {
    public static void main(String[] args){
        LC643 lc643 = new LC643();
        System.out.println(lc643.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
        System.out.println(lc643.findMaxAverage(new int[]{5}, 1));
        System.out.println(lc643.findMaxAverage(new int[]{-1}, 1));
    }
}
