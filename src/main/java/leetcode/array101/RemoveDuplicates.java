package leetcode.array101;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int j=0, prev = 0;
        for(int i=0; i<nums.length; i++){
            if(i == 0 || prev != nums[i]){
                nums[j++] = nums[i];
            }
            prev = nums[i];
        }
        return j;
    }
}

class RemoveDuplicatesTest{
    public static void main(String[] args){
        RemoveDuplicates rd = new RemoveDuplicates();

        //int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        //int[] nums = new int[]{-1,0,0,0,0,3,3};
        int[] nums = new int[]{1,1,2};
        int result = rd.removeDuplicates(nums);
        System.out.println(result);
    }
}