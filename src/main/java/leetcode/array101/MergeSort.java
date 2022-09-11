package leetcode.array101;

public class MergeSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=m, j=0; i<nums1.length && j<n; i++){
            nums1[i] = nums2[j++];
        }

        for(int i=0; i<nums1.length; i++){
            for(int j=i+1; j<nums1.length; j++){
                if(nums1[i] > nums1[j]){
                    int tmp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = tmp;
                }
            }
        }

        for(int ar : nums1){
            System.out.print(ar + " ");
        }
    }
}

class MergeSortTest{
    public static void main(String[] args){
        MergeSort ms = new MergeSort();
//        int[] nums1 = new int[] {1,2,3,0,0,0};
//        int[] nums2 = new int[] {2,5,6};
//        int m = 3, n = 3;
//        int[] nums1 = new int[] {2, 0};
//        int[] nums2 = new int[] {1};
//        int m = 1, n = 1;
//        int[] nums1 = new int[] {-1,0,0,3,3,3,0,0,0};
//        int[] nums2 = new int[] {1,2,2};
//        int m = 6, n = 3;

        int[] nums1 = new int[] {0};
        int[] nums2 = new int[] {1};
        int m = 0, n = 1;
        ms.merge(nums1, m, nums2, n);
    }
}


