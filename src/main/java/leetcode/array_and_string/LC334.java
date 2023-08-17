package leetcode.array_and_string;

public class LC334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= a) a = nums[i];
            else if(nums[i] <= b) b = nums[i];
            else return true;
        }
        return false;
    }
}

class LC334Test {
    public static void main(String[] args){
        LC334 lc334 = new LC334();
        System.out.println(lc334.increasingTriplet(new int[]{2,1,5,0,4,6}));
        System.out.println(lc334.increasingTriplet(new int[]{20,100,10,12,5,13}));
        System.out.println(lc334.increasingTriplet(new int[]{0,4,2,1,0,-1,-3}));
        System.out.println(lc334.increasingTriplet(new int[]{1,5,0,4,1,3}));
    }
}
