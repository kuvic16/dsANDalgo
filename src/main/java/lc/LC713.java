package lc;

public class LC713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, prod = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < k) count++;
            prod = nums[i];
            for(int j=i+1; j<nums.length; j++){
                prod *= nums[j];
                if(prod < k) count++;
                else break;
            }
        }
        return count;
    }
}

class LC713Test{
    public static void main(String[] args){
        LC713 lc713 = new LC713();
        //int[] nums = {10,5,2,6}; int k = 100;
        int[] nums = {1,2,3}; int k = 0;
        int result = lc713.numSubarrayProductLessThanK(nums, k);
        System.out.println(result);
    }
}
