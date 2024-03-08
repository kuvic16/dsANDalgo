package leetcode.dp_1d;

public class LC790 {
    int[][] tiles = {};
    public int numTilings(int n) {
        tiles = new int[2][n];
        /**
         * Domino
         * 1. (i,j), (i, j+1)
         * 2. (i, j), (i+1, j)
         *
         * Tromino
         * 1. (i,j), (i, j+1), (i+1, j)
         * 2. (i,j), (i, j+1), (i+1, j)
         * 3. (i,j), (i+1, j), (i+1, j+1)
         * 4. (i,j), (i, j+1), (i+1, j)
         */
        return 0;
    }

    public int tilings(int col, ){

    }




    public static void main(String[] args){
        LC790 lc790 = new LC790();
        System.out.println(lc790.numTilings(1));
    }
}
