package leetcode.prefix_sum;

public class LC724 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) sum += nums[i];
        
        int leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            int rightSum = sum - (nums[i] + leftSum);
            if(rightSum == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;   
    }
}

class LC724Test {
    public static void main(String[] args){
        LC724 lc724 = new LC724();
        System.out.println(lc724.pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(lc724.pivotIndex(new int[]{1,2,3}));
        System.out.println(lc724.pivotIndex(new int[]{2,1,-1}));
    }
}