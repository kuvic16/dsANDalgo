package leetcode.heap_priority_queue;

public class LC2542 {
    int[] nums1;
    int[] nums2;
    int k;
    long max = 0;
    public long maxScore(int[] nums1, int[] nums2, int k) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.k = k;
        for(int i=0; i<this.nums1.length; i++){
            subset(i, 0, Integer.MAX_VALUE, 1);
        }
        return this.max;
    }

    public void subset(int index, int sum, int min, int level){
        if(index >= this.nums1.length) return;

        sum += this.nums1[index];
        if(min > this.nums2[index]) min = this.nums2[index];
        if(level == this.k) {
            if (sum * min > max) max = sum * min;
            return;
        }

        for(int i=index+1; i<nums1.length; i++) {
            subset(i, sum, min, level+1);
        }
    }

    public static void main(String[] args){
        LC2542 lc2542 = new LC2542();
        int[] nums1 = {};
        int[] nums2 = {};
        int k = 0;

        nums1 = new int[]{1,3,3,2};
        nums2 = new int[]{2,1,3,4};
        k = 3;

        System.out.println(lc2542.maxScore(nums1, nums2,k));
    }
}
