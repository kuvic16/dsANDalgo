package leetcode.contest.Contest362;

public class LC8049 {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx == fx && sy == fy && t > 0) t = t-2;
        if(sx == fx && sy == fy && t == 0) return true;
        return Math.abs(fx - sx) <= t && Math.abs(fy - sy) <= t && t > 0;
    }
}

class LC8049Test{
    public static void main(String[] args){
        LC8049 lc8049 = new LC8049();
        // System.out.println(lc8049.isReachableAtTime(2, 4, 7, 7, 6));
        // System.out.println(lc8049.isReachableAtTime(3, 1, 7, 3, 3));
        // System.out.println(lc8049.isReachableAtTime(1, 1, 2, 2, 1));
        // System.out.println(lc8049.isReachableAtTime(1, 1, 2, 2, 0));
        // System.out.println(lc8049.isReachableAtTime(1, 1, 1, 2, 0));
        System.out.println(lc8049.isReachableAtTime(1, 4, 1, 2, 1));
    }
}
/*
 * 2,4
 * 3,4
 * 4,4
 * 5,4
 * 6,5
 * 6,6
 * 7,7
 */