package lc;

public class LC3095 {

    ////32,1,25,11,2
    public int minimumSubarrayLength(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int xor = 0;
            for(int j=i; j<nums.length; j++){
                xor |= nums[j];
                if(xor >= k) min = Math.min(min, j-i+1);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }


    private void traverse(int[] nums, int k, int index){
        if(index == nums.length){
            System.out.println();
            return;
        }
        for(int i=index+1; i<nums.length; i++){
            System.out.print( nums[i] + " ");
            traverse(nums, k, index + 1);
        }
    }
}

class LC3095Test{
    public static void main(String[] args) {
        LC3095 lc3095 = new LC3095();
        //int[] nums = {1,2,3}; int k = 2;
        //int[] nums = {2,1,8}; int k = 10;
        int[] nums = {32,1,25,11,2}; int k = 59;
        int out = lc3095.minimumSubarrayLength(nums, k);
        System.out.println(out);
    }
}