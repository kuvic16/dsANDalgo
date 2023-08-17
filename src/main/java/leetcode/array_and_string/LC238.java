package leetcode.array_and_string;



public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int leftProd = 1;
        for(int i=0; i<nums.length; i++){
            result[i] = leftProd;
            int j = i + 1, k = nums.length - 1;
            while(j <= k){
                if(j == k) result[i] *= nums[j];
                else result[i] *= (nums[j] * nums[k]);
                
                j++; k--;
            }
            leftProd *= nums[i];
        }        
        return result;
    }    
}

class LC238Test {
    public static void main(String[] args) {
        LC238 lc238 = new LC238();
        //int[] result = lc238.productExceptSelf(new int[]{1,2,3,4});
        int[] result = lc238.productExceptSelf(new int[]{-1,1,0,-3,3});
        for(int r : result){
            System.out.print(r + " ");
        }
    }
}