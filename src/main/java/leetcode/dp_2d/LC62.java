package leetcode.dp_2d;

public class LC62 {

    int _m = 0;
    int _n = 0;
    int sum = 0;
    int[][] disk = new int[100][100];
    public int uniquePaths(int m, int n) {
        _m = m; _n = n;
        nextMove(0, 0);
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(disk[i][j] + " ");
            }
            System.out.println();
        }
        return sum;
    }

    public int nextMove(int i, int j){
        if(_m-1 == i && _n-1 == j) {sum += 1; return 1;}
        if(_m <= i || _n <= j) return 0;

        if(disk[i][j] == 0) {
            int r = nextMove(i, j + 1);
            if (r == 1) {
                //System.out.println("i: " + i + ", j: " + j);
                disk[i][j + 1] += 1;
                //return 1;
            }
            int b = nextMove(i + 1, j);
            if (b == 1) {
                //System.out.println("i: " + i + ", j: " + j);
                disk[i + 1][j] += 1;
                //return 1;
            }
            return r+b;
        }
        return disk[i][j];
    }

    public static void main(String[] args){
        LC62 lc62 = new LC62();
        System.out.println(lc62.uniquePaths(3, 2));
        //System.out.println(lc62.uniquePaths(3, 7));
        //System.out.println(lc62.uniquePaths(23, 12));
        //System.out.println(lc62.uniquePaths(19, 13));
    }
}
