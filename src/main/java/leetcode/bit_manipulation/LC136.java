package leetcode.bit_manipulation;

public class LC136 {
    public int singleNumber(int[] nums) {
        int rem = 0;
        for(int i=0; i<nums.length; i++){
            rem ^= nums[i];
        }
        return rem;
    }

    public static void main(String[] args){
        LC136 lc136 = new LC136();
        int[] nums = {};

        nums = new int[]{2,2,1};
        nums = new int[]{4,1,2,1,2};
        int result = lc136.singleNumber(nums);
        System.out.println(result);
    }
}
