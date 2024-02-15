package leetcode.dp_1d;

public class LC198 {

    int[] disk = new int[100];
    public int rob(int[] nums) {
        for(int i=0; i<disk.length; i++) disk[i] = -1;

        return 0;
    }



    public static void main(String[] args){
        LC198 lc198 = new LC198();
        int[] nums = {};

        nums = new int[]{1,2,3,1};
        nums = new int[]{2,7,9,3,1};

        System.out.println(lc198.rob(nums));
    }
}
