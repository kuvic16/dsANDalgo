package Study.dynamic_programming;

/**
 * Create a subset from integer array
 * Input: [1,3,3,2]
 * Output: find subset with n number element
 */
public class _3_Subsequence_4 {
    int[] nums1;
    int[] nums2;
    int max = 0;
    public void subset(int index, String r, int sum, int min, int level){
        if(index >= nums1.length) return;
        r = r + " " + index;
        sum += nums1[index];
        if(min > nums2[index]) min = nums2[index];
        if(level == 3) {
            if (sum * min > max) max = sum * min;
        }

        //System.out.println(r + ">> sum: " + sum + ", min: " + min);
        System.out.println(r + ">> level: " + level);
        for(int i=index+1; i<nums1.length; i++) {
            subset(i, r, sum, min, level+1);
        }
    }

    public static void main(String[] args){
        _3_Subsequence_4 subsequence = new _3_Subsequence_4();
        int[] nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};
        int m = 3;
        subsequence.nums1 = nums1;
        subsequence.nums2 = nums2;
        for(int i=0; i<nums1.length; i++)
        subsequence.subset(i, "", 0, Integer.MAX_VALUE, 1);

        System.out.println(subsequence.max);
    }
}
