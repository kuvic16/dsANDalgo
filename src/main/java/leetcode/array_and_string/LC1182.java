package leetcode.array_and_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LC1182 {
    

    public void rotate(int[] nums, int k) {
        if(k == 0) return;
        int n = nums.length;
        if(n < k){
            k = k - ((k / n) * n);
        }
        if(k == 0) return;
        if(n == k) return;

        int[] nums1 = new int[n];

        int i = n - 1;
        for(int j=n-k-1; j>=0; j--){
            nums1[i--] = nums[j];
        }

        i = 0;
        for(int j=n-k; j<n; j++){
            nums1[i++] = nums[j];
        }

        for(int j=0; j<n; j++){
            System.out.println(nums1[j]);
        }
    }
}

class LC1182Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1182 lc1182 = new LC1182();
        // int[] nums = {1,2,3,4,5,6,7};
        // int k = 3;
        // int[] nums = {-1,-100,3,99};
        // int k = 2;
        // int[] nums = {1,2};
        // int k = 3;
        // int[] nums = {1,2,3};
        // int k = 4;
        int[] nums = {1,2,3,4,5,6};
        int k = 7;
        lc1182.rotate(nums, k);
    }
}

/**
 * 
 * 

1,2,3,4,5,6

6,1,2,3,4,5 -> 1
5,6,1,2,3,4 -> 2
4,5,6,1,2,3 -> 3
3,4,5,6,1,2 -> 4
2,3,4,5,6,1 -> 5


20/6
54944


















 */