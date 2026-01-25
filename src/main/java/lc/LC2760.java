package lc;

public class LC2760 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int longest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 != 0) continue;
            for(int j=i; j<nums.length; j++){
                if(nums[j] > threshold) break;
                if(j == i) longest = Math.max(longest, j-i+1);
                else if(nums[j-1] % 2 != nums[j] % 2){
                    longest = Math.max(longest, j-i+1);
                }else break;
            }
        }
        return longest == Integer.MIN_VALUE ? 0 : longest;
    }
}

class LC2760Test{
    public static void main(String[] args){
        LC2760 lc2760 = new LC2760();
//        int[] nums = {3,2,5,4};
//        int threshold = 5;
//        int[] nums = {1,2};
//        int threshold = 2;
//        int[] nums = {2,2};
//        int threshold = 18;

        int[] nums = {4,10,3};
        int threshold = 10;
        int result = lc2760.longestAlternatingSubarray(nums, threshold);
        System.out.println(result);
    }
}
