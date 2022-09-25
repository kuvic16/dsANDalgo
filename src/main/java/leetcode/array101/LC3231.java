package leetcode.array101;

public class LC3231 {
    public int thirdMax(int[] nums) {
        int lastDistinctNumber = 0;

        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] < nums[j]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }

        int j=0, prev = 0;
        for(int i=0; i<n; i++){
            if(i == 0 || prev != nums[i]){
                nums[j++] = nums[i];
            }
            prev = nums[i];
        }

        if(j < 3) lastDistinctNumber = nums[0];
        else lastDistinctNumber = nums[2];

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
