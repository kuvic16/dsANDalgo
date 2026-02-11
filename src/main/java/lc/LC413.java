package lc;

public class LC413 {
    //1,2,3,8,9,10
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        for(int i=0; i+2<nums.length; i++){
            for(int j=i+1; j+1<nums.length; j++){
                if(nums[j-1] - nums[j] == nums[j] - nums[j+1]) count++;
                else break;
            }
        }
        return count;
    }
}

class LC413Test {
    public static void main(String[] args){
        LC413 lc413 = new LC413();
        int[] nums = {1,2,3,4};
//        int[] nums = {1};
//        int[] nums = {1,2,3,8,9,10};
        int result = lc413.numberOfArithmeticSlices(nums);
        System.out.println(result);
    }
}