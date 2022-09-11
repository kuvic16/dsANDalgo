package leetcode.array101;

public class SquareSort {
    public int[] sortedSquares(int[] nums) {
        for(int i= 0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        return nums;
    }
}
