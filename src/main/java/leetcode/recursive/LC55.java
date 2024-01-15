package leetcode.recursive;

public class LC55 {

    int[] nums = {};
    int[] visited = {};
    boolean result = false;
    public boolean canJump(int[] nums) {
        this.nums = nums;
        this.visited = new int[nums.length];
        traverse(0);
        return result;
    }

    public void traverse(int index){
        visited[index] = 1;
        if(index >= nums.length) return;
        if(index == nums.length -1) {result = true; return;}
        if(nums[index] == 0) return;

        for(int i=1; i<=nums[index]; i++){
            if(index+i < nums.length) {
                if(visited[index+i] == 0) {
                    traverse(index + i);
                }
            }
        }
    }

    public static void main(String[] args){
        LC55 lc55 = new LC55();
        int[] nums = {};

       // nums = new int[]{2,3,1,1,4};
        //nums = new int[]{3,2,1,0,4};
        nums = new int[]{2,0};
//        nums = new int[]{8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5};

        System.out.println(lc55.canJump(nums));
    }
}
