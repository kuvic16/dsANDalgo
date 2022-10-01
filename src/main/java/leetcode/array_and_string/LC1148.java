package leetcode.array_and_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LC1148 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        List<Integer> stack = new ArrayList<>();
        int reminder = 0;
        for(int i=n-1; i>=0; i--){
            int sum = digits[i] + reminder;
            if(i == n-1) {
                sum = sum + 1;
            }
            if(sum >= 10){
                reminder = sum / 10;
                sum = sum % 10;
            }else{
                reminder = 0;
            }
            stack.add(sum);
        }

        while (reminder > 0){
            int d = reminder;
            if(reminder >= 10){
                reminder = d / 10;
                d = d % 10;
            }else{
                reminder = 0;
            }
            stack.add(d);
        }

        int[] result = new int[stack.size()];
        int j = 0;
        for(int i=stack.size()-1; i>=0; i--){
            result[j++] = stack.get(i);
        }
        return result;
    }
}

class LC1148Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1148 lc1148 = new LC1148();
        //int[] nums = {1,2,3};
//        int[] nums = {9};
//        int[] nums = {4,3,2,1};
        int[] nums = {8,9,9,9};
        int[] result = lc1148.plusOne(nums);
        System.out.println();
        for(int r : result){
            System.out.print(r + " ");
        }
    }
}
