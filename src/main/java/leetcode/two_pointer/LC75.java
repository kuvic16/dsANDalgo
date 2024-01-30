package leetcode.two_pointer;

public class LC75 {
    public void sortColors(int[] nums) {
        //2,0,2,1,2,0
        int right = 0, r1= -1;
        for(int i=0; i<nums.length; i++){

            if(nums[i] != 2){
                int tmp = nums[i];
                nums[i] = nums[right];
                nums[right] = tmp;

                if(r1 == -1 && nums[right] == 1) r1 = right;
                if(right > 0){
                    if(nums[right-1] != nums[right] && r1 != right){
                        tmp = nums[right];
                        nums[right] = nums[r1];
                        nums[r1] = tmp;
                        r1++;
                    }
                }
                right++;
            }

//            System.out.print(i + ":<2> ");
//            for(int n : nums) System.out.print(n + " ");
//            System.out.println(": 1=" + r1 + "; 0=" + right);
//            System.out.println();
        }
    }

    public void sortColors1(int[] nums) {
        int right = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 2){
                int tmp = nums[i];
                nums[i] = nums[right];
                nums[right] = tmp;
                right++;
            }
        }


        int r1 = 0;
        for(int i=0; i<right; i++){
            if(nums[i] != 1){
                int tmp = nums[i];
                nums[i] = nums[r1];
                nums[r1] = tmp;
                r1++;
            }
        }
    }

    public static void main(String[] args){
        LC75 lc75 = new LC75();
        int[] nums = {};
        nums = new int[]{2,0,2,1,1,0};
        //nums = new int[]{2,0,2,1,2,0};
        lc75.sortColors(nums);
        for(int i : nums) System.out.print(i + " ");
    }
}
