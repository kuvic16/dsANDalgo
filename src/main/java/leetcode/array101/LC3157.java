package leetcode.array101;

public class LC3157 {
    public void moveZeroes(int[] nums) {

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 && i+1 < nums.length){
                int next = -1, j=i+1;
                while(j+1 < nums.length && nums[j] == 0){
                    j += 1;
                }
                next = j;
                for(int k=i; k<nums.length; k++){
                    if(next < nums.length) {
                        nums[k] = nums[next++];
                    }else {
                        nums[k] = 0;
                    }
                }
            }
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}

class LC3157Test {
    public static void main(String[] args){
        LC3157 lc3157 = new LC3157();
//        int[] nums = new int[]{0,1,0,3,12};
        //int[] nums = new int[]{0};
        int[] nums = new int[]{0, 0, 1};
        lc3157.moveZeroes(nums);
    }
}
