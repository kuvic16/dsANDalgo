package leetcode.two_pointer;

public class LC1679 {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length, op = 0, ln = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > k) continue;
            for(int j=i+1; j<n; j++){
                if(nums[j] > k) continue;
                else if(nums[i] + nums[j] == k) {
                    op += 1;
                    int tmp = nums[ln];
                    nums[ln] = nums[j];
                    nums[j] = tmp;
                    i = ln;
                    break;
                }
                ln = j;
            }
        }
        return op;
    }
}

class LC1679Test {
    public static void main(String[] args){
        LC1679 lc1679 = new LC1679();
        System.out.println(lc1679.maxOperations(new int[]{1,2,3,4}, 5));
        //System.out.println(lc1679.maxOperations(new int[]{3,1,3,4,3}, 6));
        //System.out.println(lc1679.maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));
    }
}
