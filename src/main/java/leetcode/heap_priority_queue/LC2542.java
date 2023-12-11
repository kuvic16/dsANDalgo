package leetcode.heap_priority_queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class LC2542 {
    int[] nums1;
    int[] nums2;
    int k;
    long max = 0;
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] nums = new int[nums1.length][2];
        for(int i=0; i<nums2.length; i++){
            nums[i][0] = nums2[i];
            nums[i][1] = nums1[i];
        }
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i][0] + "," + nums[i][1]);
        }

        return this.max;
    }



    public static void main(String[] args){
        LC2542 lc2542 = new LC2542();
        int[] nums1 = {};
        int[] nums2 = {};
        int k = 0;

        nums1 = new int[]{1,2,3,4};
        nums2 = new int[]{2,1,3,4};
        k = 3;

        //nums1 = new int[]{93,463,179,2488,619,2006,1561,137,53,1765,2304,1459,1768,450,1938,2054,466,331,670,1830,1550,1534,2164,1280,2277,2312,1509,867,2223,1482,2379,1032,359,1746,966,232,67,1203,2474,944,1740,1775,1799,1156,1982,1416,511,1167,1334,2344};
        //nums2 = new int[]{345,229,976,2086,567,726,1640,2451,1829,77,1631,306,2032,2497,551,2005,2009,1855,1685,729,2498,2204,588,474,693,30,2051,1126,1293,1378,1693,1995,2188,1284,1414,1618,2005,1005,1890,30,895,155,526,682,2454,278,999,1417,1682,995};
        //k = 42;

//        nums1 = new int[]{1,2,3,4};
//        nums2 = new int[]{11,22,33,44};
//        k = 3;

        System.out.println(lc2542.maxScore(nums1, nums2,k));
    }
}
