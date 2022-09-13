package leetcode.array101;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                int nextJ = -1;
                for(int j=nums.length -1; j>i; j--){
                    if(nums[j] != val) {
                        nextJ = j;
                        break;
                    }
                }
                if(nextJ != -1) {
                    int tmp = nums[i];
                    nums[i] = nums[nextJ];
                    nums[nextJ] = tmp;
                }
            }
        }

        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val) break;
            count += 1;
        }
        return count;
    }
}

class RemoveElementTest{
    public static void main(String[] args){
        RemoveElement removeElement = new RemoveElement();

        //int[] nums = new int[]{3,2,2,3}; int val = 3;
        int[] nums = new int[]{0,1,2,2,3,0,4,2}; int val = 2;
        int result = removeElement.removeElement(nums, val);
        System.out.println(result);
    }
}
