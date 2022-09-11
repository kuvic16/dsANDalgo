package leetcode.array101;

public class MaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter=-1, max=0, last=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 || last != nums[i]){
                if(counter > max) {
                    max = counter;
                }
                counter=1;
                if(nums[i] == 0) counter = 0;

            }else{
                counter += 1;
            }
            last = nums[i];

        }
        if(last != 0 && counter > max) max = counter;
        return max;
    }
}
