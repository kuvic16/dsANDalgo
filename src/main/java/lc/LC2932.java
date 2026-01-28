package lc;

public class LC2932 {
    public int maximumStrongPairXor(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, (nums[i] ^ nums[i]));
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])){
                    max = Math.max(max, (nums[i] ^ nums[j]));
                }else break;
            }
        }
        return max;
    }
}

class LC2932Test {
    public static void main(String[] args){
        LC2932 lc2932 = new LC2932();
        int[] nums  = {1,2,3,4,5};
        int result = lc2932.maximumStrongPairXor(nums);
        System.out.println(result);
    }
}