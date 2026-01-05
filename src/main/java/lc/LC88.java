package lc;

import java.io.FileNotFoundException;

public class LC88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m + n != nums1.length) return;
        if(n != nums2.length) return;
        for(int i=m, j=0; i<nums1.length && j<nums2.length; i++, j++){
            nums1[i] = nums2[j];
        }


        int left = 0, right = 1;

        for (int i=0; i<nums1.length; i++) {
            if(nums1[i] < nums2[0]) {
                left = i;
                right = m;
            }
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        while (left < nums1.length){
            if(right >= nums1.length) {
                left = left + 1;
                right = left + 1;
                continue;
            }
            if(nums1[left] > nums1[right]) {
                int tmp = nums1[left];
                nums1[left] = nums1[right];
                nums1[right] = tmp;
                //left++;
            }
            right++;
        }
        for (int i=0; i<nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}

class LC88Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC88 lc88 = new LC88();

//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3, n = 3;

        int[] nums1 = {1,2,4,5,6,0};
        int[] nums2 = {3};
        int m = 5, n = 1;
        lc88.merge(nums1, m, nums2, n);
        //System.out.println(output);
    }
}