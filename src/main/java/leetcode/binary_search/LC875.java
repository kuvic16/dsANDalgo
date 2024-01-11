package leetcode.binary_search;

import java.util.Arrays;

public class LC875 {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        if(piles.length == h) return piles[piles.length-1];

        int max = piles[piles.length-1];
        int min = 0;
        int min_h = Integer.MAX_VALUE;

        while(max - min > 1){
            int mid = min + (max - min)/2;
            long th = getHour(piles, mid);

            System.out.println(min + "," + max + "; : mid: " + mid + "; th: " + th);

            if(th <= h && min_h > mid) min_h = mid;
            if(th <= h) max = mid;
            else min = mid;
        }
        if(min_h == Integer.MAX_VALUE) min_h = max;


        return  min_h;
    }

    public long getHour(int[] piles, int k){
        long h = 0;
        for (int pile : piles) {
            h += (int) Math.ceil((double) pile / k);
        }
        return h;
    }





    public static void main(String[] args){
        LC875 lc875 = new LC875();
        int[] piles = {};
        int h = 0;

        piles = new int[]{3,6,7,11};
        h = 8;

//        piles = new int[]{332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
//        h = 823855818;

        piles = new int[]{30,11,23,4,20};
        h = 5;

//        piles = new int[]{30,11,23,4,20};
//        h = 6;
//
//        piles = new int[]{312884470};
//        h = 312884469;
//
//        piles = new int[]{10};
//        h = 9;

//        piles = new int[]{1000000000,1000000000};
//        h = 3;
//
        piles = new int[]{805306368,805306368,805306368};
        h = 1000000000;

        System.out.println(lc875.minEatingSpeed(piles, h));
    }
}
