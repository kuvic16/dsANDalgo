package leetcode.dp_1d;

public class LC790 {
    int[][] tiles = {};
    public int numTilings(int n) {
        tiles = new int[2][n];
        /**
         * domino
         * -----------------
         * 1. (i,i), (i+1,i)
         * 2. (i,i), (i,i+1)
         *
         * trimoni
         * -----------------
         * 1. (i,i), (i,i+1), (i+1,i)
         * 2. (i,i), (i,i+1), (i+1,i+1)
         * 3.
         */
        return 0;
    }

    public static void main(String[] args){
        LC790 lc790 = new LC790();
        System.out.println(lc790.numTilings(1));
    }
}
