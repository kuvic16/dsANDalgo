package leetcode.sliding_window;

public class LC1004 {
    public int longestOnes(int[] nums, int k) {
        int m = k, max = 0, count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1 && count + k >= m) {
                count += nums[i];
                m += 1;                
                continue;
            }

            //if(m > 0 && i >= m - 1 && (m - count <= k)){                
            if(m > 0 && i >= m){
                if(max < count) max = count;          
                count -= nums[i-m];                
            }
        }
        if(max < count) max = count;
        return max;        
    }

    // public int longestOnes(int[] nums, int k) {
    //     int m = k, max = 0, count = 0;
    //     for(int i=0; i<nums.length; i++){
    //         count += nums[i];
    //         if(nums[i] == 1 && count >= m) {
    //             m += 1;
    //             continue;
    //         }
            
    //         if(m > 0 && i >= m - 1 && (m - count == 0)){
    //             if(max < (count)) max = count;
    //             count -= 1;
    //         }

    //         if(m > 0 && k > count) count += 1;
    //     }
    //     if(max < count) max = count;
    //     return max;        
    // }
}

class LC1004Test {
    public static void main(String[] args){
        LC1004 lc1004 = new LC1004();
        System.out.println(lc1004.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
        //System.out.println(lc1004.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        //System.out.println(lc1004.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0}, 3));
        //System.out.println(lc1004.longestOnes(new int[]{0,0,1,1,1,0,0}, 0));
        //System.out.println(lc1004.longestOnes(new int[]{0,0,0,1}, 4));
    }
}