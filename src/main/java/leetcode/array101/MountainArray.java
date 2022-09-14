package leetcode.array101;

public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;

        boolean result = true, peek = false;
        int prev = 0, upcount=0;

        for(int i=0; i<arr.length; i++){
            if(i!=0){
                if(!peek && arr[i] > prev) upcount += 1;
                if(!peek && upcount > 0 && arr[i] < prev) peek = true;
                if((!peek && arr[i] <= prev) || (peek && arr[i] >= prev)) {
                    result = false;
                    break;
                }
            }
            prev = arr[i];
        }
        if(!peek) result = false;

        return result;
    }
}

class MountainArrayTest{
    public static void main(String[] args){
        MountainArray ma  = new MountainArray();
        //int[] nums = new int[]{3,5,5};
//        int[] nums = new int[]{0,3,2,1};
        //int[] nums = new int[]{9,8,7,6,5,4,3,2,1,0};
        //int[] nums = new int[]{1,1,1,1,1,1,1,2,1};
        int[] nums = new int[]{2,1,2,3,5,7,9,10,12,14,15,16,18,14,13};
        boolean result = ma.validMountainArray(nums);
        System.out.println(result);
    }
}
