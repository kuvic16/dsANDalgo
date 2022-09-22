package leetcode.array101;

public class LC3231 {
    public int thirdMax(int[] nums) {
        int count = 0, lastDistinctNumber = -1;
        for (int i = 0; i < nums.length; i++) {
            boolean distinct = true;
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]){
                    distinct = false;
                    break;
                }
            }
            if(distinct){
                lastDistinctNumber = nums[i];
                count += 1;
                if(count == 3) break;
            }
        }
        return lastDistinctNumber;
    }
}
class LC3231Test{
    public static void main(String[] args){
        LC3231 lc3231 = new LC3231();
        int[] nums = new int[]{1,2,2};
        int result = lc3231.thirdMax(nums);
        System.out.println(result);
    }
}
