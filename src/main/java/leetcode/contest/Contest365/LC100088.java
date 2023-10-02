package leetcode.contest.Contest365;

public class LC100088 {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    long sum = 0;
                    if(nums[i] < 0 && nums[j] < 0 && nums[k] < 0) sum = 0;
                    else sum = (Long.valueOf(nums[i]) - Long.valueOf(nums[j])) * Long.valueOf(nums[k]);
                    System.out.println(i +"," + j + "," + k + ": " + sum);
                    if(sum > max) max = sum;
                }
            }
        }
        return max;
    }
}

class LC100088Test {
    public static void main(String[] args){
        LC100088 lc100088 = new LC100088();
        //System.out.println(lc100088.maximumTripletValue(new int[]{1,10,3,4,19}));
        System.out.println(lc100088.maximumTripletValue(new int[]{1000000,1,1000000}));
    }
}

