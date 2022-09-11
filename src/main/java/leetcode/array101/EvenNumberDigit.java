package leetcode.array101;

public class EvenNumberDigit {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int i= 0; i<nums.length; i++){

            int curr = nums[i];

            int dc = 0;

            while(curr > 0){

                dc += 1;

                curr /=10;

            }

            if(dc % 2 == 0) count += 1;

        }

        return count;
    }
}
