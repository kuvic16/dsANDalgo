package leetcode.two_pointer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LC1154 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, i=1;
        while(i<nums.length){
            sum += (nums[i-1] < nums[i]) ? nums[i-1] : nums[i];
            i+=2;
        }
        return sum;
    }
}

class LC1154Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1154 lc1154 = new LC1154();
//        int[] nums = {1,4,3,2};
        int[] nums = {6,2,6,5,1,2};
        int result = lc1154.arrayPairSum(nums);
        System.out.println(result);
    }
}

class Program{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        int i=0;
        for(;i<10;i++){
            list.add(i);
            if(i==6)
            {
                break;
            }
            System.out.print(list.get(i));
        }
    }
}