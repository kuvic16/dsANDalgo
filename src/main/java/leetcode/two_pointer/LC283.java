package leetcode.two_pointer;

public class LC283 {
    public void moveZeroes(int[] nums) {
        int nnums[] = nums;
        int j = 0;
        for(int i=0; i<nnums.length; i++){
            if(nnums[i] != 0) nums[j++] = nnums[i];
        }
        while(j < nnums.length){
            nums[j++] = 0;
        }
    }
}

class LC283Test {
    public static void main(String[] args){
        LC283 lc283 = new LC283();
        lc283.moveZeroes(new int[]{0,1,0,3,12});
    }
}