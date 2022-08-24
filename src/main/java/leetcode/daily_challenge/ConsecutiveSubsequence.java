package leetcode.daily_challenge;

/**
 * Problem: https://leetcode.com/problems/split-array-into-consecutive-subsequences/
 */
public class ConsecutiveSubsequence {

    public boolean isPossible(int[] nums){
        if(nums.length < 3) return false;

        int t_count = 0, s_count=0, prev=-1;
        while(t_count < nums.length) {
            s_count=0; prev=-1;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == -1) continue;
                if (prev == -1 || nums[i] == prev + 1) {
                    prev = nums[i];
                    nums[i] = -1;
                    s_count++;
                    t_count++;
                }
            }
            if (s_count < 3) return false;
        }
        return true;
    }

    public boolean XisPossible(int[] nums){
        if(nums.length < 6) return false;
        int total_subsequence = nums.length/3;
        int max_element = 3 + (nums.length - (total_subsequence * 3));
        int[][] sub = new int[total_subsequence][max_element];

        int cj = 0, m_count=0;
        for (int ci =0; ci<total_subsequence; ci++){
            cj = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == -1) continue;
                if(cj == max_element) break;
                if(cj == 0){
                    sub[ci][cj] = nums[i];
                    nums[i] = -1;
                    cj++;
                    m_count++;
                }else if(nums[i] == sub[ci][cj-1] + 1){
                    sub[ci][cj] = nums[i];
                    nums[i] = -1;
                    cj++;
                    m_count++;
                }
            }
        }
        if(m_count != nums.length) return false;

        int count = 0;
        for(int i=0; i<total_subsequence; i++){
            count = 0;
            for(int j=0; j<sub[i].length; j++){
                if(sub[i][j] > 0) count = count + 1;
                if(count >= 3) break;
            }
            if(count < 3) return false;
        }


//        for(int i=0; i<total_subsequence; i++){
//            for(int j=0; j<sub[i].length; j++){
//                System.out.print(sub[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        return true;
    }
}

class ConsecutiveSubsequenceTest{
    public static void main(String[] args){
       //int[] nums = {1,2,3,4,5, 6, 7};
        //int[] nums = {1,2,3,5,5,6,7};
       // int[] nums = {1,2,3,4,6,7,8,9,10,11};
       //int[] nums = {1,2,3,3,4,4,5,5};
       //int[] nums = {1};
//        int[] nums = {1,2,3,4,4,5};
        int[] nums = {1,2,3,3,4,5};
        ConsecutiveSubsequence cs = new ConsecutiveSubsequence();
        System.out.println(cs.isPossible(nums));
    }
}
