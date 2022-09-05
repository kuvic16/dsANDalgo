package leetcode.beginners_guide;

public class RunningSum1Darray {

    public int[] runningSum(int[] nums) {
        int runningSum[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            runningSum[i] = nums[i];
            if(i > 0){
                runningSum[i] += runningSum[i-1] ;
            }
        }
        return runningSum;
    }

}

class RunningSum1DarrayTest{
    public static void main(String[] args){
        RunningSum1Darray r = new RunningSum1Darray();
    }
}
