package leetcode.two_pointer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LC1153 {

    // 1, 3, 5, 7, 8
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int n = numbers.length;
        int i = 0, j=n-1;
        while(i<j){
            if(numbers[i] + numbers[j] == target) break;
            else if(numbers[i] + numbers[j] > target) j--;
            else i++;
        }

        result[0] = i+1;
        result[1] = j+1;
        return result;
    }


}

class LC1153Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1153 lc1153 = new LC1153();
        int[] nums = {2,7,11,15}; int target = 9;
//        int[] nums = {2,3,4}; int target = 6;
//        int[] nums = {-1,0}; int target = -1;
//        int[] nums = {1,3, 5, 7, 8}; int target = 12;
        int[] result = lc1153.twoSum(nums, target);
        System.out.println();
        for(int r : result) System.out.print(r + " ");
    }
}
