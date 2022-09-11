package leetcode.array101;

public class DuplicateZero {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if(arr[i] == 0){
                int prev = arr[i], tmp = 0;
                for(int j = i; j<arr.length - 1; j++){
                    tmp = arr[j+1];
                    arr[j+1] = prev;
                    prev = tmp;
                }
                i += 1;
            }
            i++;
        }
        for(int ar : arr){
            System.out.println(ar);
        }
    }
}

class DuplicateZerorTest{
    public static void main(String[] args){
        DuplicateZero dz = new DuplicateZero();
        //int[] nums = new int[] {1,0,2,3,0,4,5,0};
        int[] nums = new int[] {1,2, 3};
        dz.duplicateZeros(nums);
    }
}
