package leetcode.dp_1d;

public class LC198 {

    int[] disk = new int[100];
    public int rob(int[] nums) {
        for(int i=nums.length-1; i>=0; i--) {
            disk[i] = -1;
            traverse(nums, i, 0);
        }
        return Math.max(disk[0], disk[1]);
    }

    public int traverse(int[] nums, int index, int total_money){
        if(index <= 0) return total_money;
        if(disk[index] == -1){
            int m = traverse(nums, index + 2, total_money + nums[index]);
            int n = traverse(nums, index + 3, total_money + nums[index]);
            disk[index] = Math.max(m, n);
        }
        return disk[index] + total_money;
    }



    public static void main(String[] args){
        LC198 lc198 = new LC198();
        int[] nums = {};

        nums = new int[]{1,2,3,1};
        nums = new int[]{2,7,9,3,1};
        nums = new int[]{2,1,1,2};

        System.out.println(lc198.rob(nums));
    }
}
