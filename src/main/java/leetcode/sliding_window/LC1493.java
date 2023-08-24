package leetcode.sliding_window;

public class LC1493 {
    public int longestSubarrayX1(int[] nums) {
        int i = 0, j, k=1;
        for (j = 0; j < nums.length; ++j) {
            if (nums[j] == 0) k--;
            if (k < 0 && nums[i++] == 0) k++;
        }
        return j - i - 1;
    }

    public int longestSubarray(int[] nums) {
        int m = 1, max = 0, count = 0, zeroCount = 0, k = 1;
        for(int i=0; i<nums.length; i++){   
            count += nums[i];
            if(nums[i] == 1 && zeroCount <= k) {
                m += 1;                
                continue;
            }
            
            if(nums[i] == 0 && zeroCount < k) {
                m += 1;
                zeroCount += 1;                
                continue;
            }
            if(nums[i] == 0) zeroCount += 1;

            if(m > 0 && i >= m - 1){
                if(max < count) max = count;          
                count -= nums[i-m+1];
                if(nums[i-m+1] == 0) zeroCount -= 1;      
            }
        }
        if(max < count) max = count;
        max += k;
        if(max > nums.length) max = nums.length; 
        return max - 1;  
    }
}

class LC1493Test {
    public static void main(String[] args){
        LC1493 lc1493 = new LC1493();
        System.out.println(lc1493.longestSubarray(new int[]{1,1,0,1}));
        //System.out.println(lc1493.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        //System.out.println(lc1493.longestSubarray(new int[]{1,1,1}));
    }
}
