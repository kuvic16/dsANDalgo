package leetcode.dp_2d;

public class LC62 {

    int _m = 0;
    int _n = 0;
    int sum = 0;
    int[][] disk = new int[100][1];
    public int uniquePaths(int m, int n) {
        _m = m; _n = n;
        nextMove(0, 0);
        return sum;
    }

    public int nextMove(int i, int j){
        if(_m-1 == i && _n-1 == j) {sum += 1; return 1;}
        if(_m <= i || _n <= j) return 0;

        int r = nextMove(i, j+1);
        int b = nextMove(i+1, j);
        return 0;
    }

    public static void main(String[] args){
        LC62 lc62 = new LC62();
        //System.out.println(lc62.uniquePaths(3, 2));
        //System.out.println(lc62.uniquePaths(3, 7));
        //System.out.println(lc62.uniquePaths(23, 12));
        System.out.println(lc62.uniquePaths(19, 13));
    }
}
