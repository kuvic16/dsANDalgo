package leetcode.array101;

public class LC3575 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0, lk=0; i<nums.length; i++){
            if(nums[i] != val){
                int tmp = nums[i];
                nums[i] = nums[lk];
                nums[lk++] = tmp;
                count += 1;
            }
        }
        return count;
    }
}

class LC3575Test{
    public static void main(String[] args){
        LC3575 lc3575 = new LC3575();
        //int[] nums = new int[]{3,2,2,3}; int val=3;
        int[] nums = new int[]{0,1,2,2,3,0,4,2}; int val=2;
        int result = lc3575.removeElement(nums, val);
        System.out.println(result);
    }
}
