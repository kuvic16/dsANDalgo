package leetcode.two_pointer;

public class LC283 {
    public void moveZeroesX(int[] nums) {
        int nnums[] = nums;
        int j = 0;
        for(int i=0; i<nnums.length; i++){
            if(nnums[i] != 0) nums[j++] = nnums[i];
        }
        while(j < nnums.length){
            nums[j++] = 0;
        }
    }

    public void moveZeroesx(int[] nums) {
        int i = 0, j = nums.length-1; boolean moving = false;
        while(j >= 0){
            if(!moving){
                if(nums[j] == 0){
                    moving = true;
                    i = j;
                    continue;
                }
                j--;
            }else{
                if(i == nums.length - 1) {
                    moving = false;
                    j = j - 1;
                    continue;
                }
                if(i+1 < nums.length && nums[i] == 0 && nums[i+1] != 0){
                    int tmp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = tmp;
                }
                i++;
            }
        }

        for(int n : nums) System.out.print(n + " ");
    }

    public void moveZeroes(int[] nums) {
        int right = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[right++];
                nums[right-1] = temp;
            }
        }
        //for(int i=right; i<nums.length; i++) nums[i] = 0;

        for(int n : nums) System.out.print(n + " ");
    }
}

class LC283Test {
    public static void main(String[] args){
        LC283 lc283 = new LC283();
        lc283.moveZeroes(new int[]{0,1,0,3,12});
    }
}