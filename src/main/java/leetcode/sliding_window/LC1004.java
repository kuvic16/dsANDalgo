package leetcode.sliding_window;

public class LC1004 {
    public int longestOnes(int[] nums, int k) {
        int m = 1, max = 0, count = 0, zeroCount = 0;
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
        return max;        
    }

    public int longestOnes_best_solution(int[] A, int K) {
        int i = 0, j;
        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0) K--;
            if (K < 0 && A[i++] == 0) K++;
        }
        return j - i;
    }
}

class LC1004Test {
    public static void main(String[] args){
        LC1004 lc1004 = new LC1004();
        System.out.println(lc1004.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(lc1004.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        System.out.println(lc1004.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0}, 3));
        System.out.println(lc1004.longestOnes(new int[]{0,0,1,1,1,0,0}, 0));
        System.out.println(lc1004.longestOnes(new int[]{0,0,0,1}, 4));
        System.out.println(lc1004.longestOnes(new int[]{1,1,1}, 1));
    }
}