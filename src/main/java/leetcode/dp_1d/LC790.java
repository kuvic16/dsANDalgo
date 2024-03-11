package leetcode.dp_1d;

public class LC790 {
    int sum = 0;
    int fillcount = 0;
    int total_pattern = 6;
    int t = 0;
     public int numTilings(int n) {
        t  = n;
        for(int i=2; i<=2; i++){
            tilings(0, i, new int[2][n]);
        }
        return sum;
    }

    public void tilings(int col, int pattern, int[][] tiles){
        if(fillcount == t * 2)  {
            sum += 1;
            return;
        }
        if(col >= t || pattern == total_pattern) return;

        if(pattern == 0 && tiles[0][col] == 0 && tiles[1][col] == 0){
            tiles[0][col] = 1;
            tiles[1][col] = 1;
            fillcount += 2;
            col++;
        }
        else if(pattern == 1 && col+1 < t){
            if(tiles[0][col] == 0 && tiles[0][col+1] == 0) {
                tiles[0][col] = 1;
                tiles[0][col+1] = 1;
                fillcount += 2;
            }
            if(tiles[1][col] == 0 && tiles[1][col+1] == 0) {
                tiles[1][col] = 1;
                tiles[1][col+1] = 1;
                fillcount += 2;
            }
            col+=2;
        }
        else if(pattern == 2 && col+1 < t){
            if(tiles[0][col] == 0 && tiles[0][col+1] == 0 && tiles[1][col] == 0) {
                tiles[0][col] = 1;
                tiles[0][col+1] = 1;
                tiles[1][col] = 1;
                fillcount += 3;
            }
            col++;
        }
        else if(pattern == 3 && col+1 < t){
            if(tiles[0][col] == 0 && tiles[1][col+1] == 0 && tiles[1][col] == 0) {
                tiles[0][col] = 1;
                tiles[1][col+1] = 1;
                tiles[1][col] = 1;
                fillcount += 3;
            }
            col++;
        }
        else if(pattern == 4 && col-1 >= 0){
            if(tiles[0][col] == 0 && tiles[1][col] == 0 && tiles[1][col-1] == 0) {
                tiles[0][col] = 1;
                tiles[1][col] = 1;
                tiles[1][col-1] = 1;
                fillcount += 3;
            }
            col++;
        }
        else if(pattern == 5 && col-1 >= 0){
            if(tiles[0][col] == 0 && tiles[1][col] == 0 && tiles[0][col-1] == 0) {
                tiles[0][col] = 1;
                tiles[1][col] = 1;
                tiles[0][col-1] = 1;
                fillcount += 3;
            }
            col++;
        }
        else{
            return;
        }

        for(int i=2; i<total_pattern; i++){
            tilings(col, i, tiles);
            if(col < t){
                System.out.println("column: " + col + ", pattern: " + i);
                if(tiles[0][col] == 1){tiles[0][col] = 0; fillcount -= 1;}
                if(tiles[1][col] == 1){tiles[1][col] = 0; fillcount -= 1;}
            }
        }
    }




    public static void main(String[] args){
        LC790 lc790 = new LC790();
//        System.out.println(lc790.numTilings(1));
        //System.out.println(lc790.numTilings(2));
        System.out.println(lc790.numTilings(3));
    }
}
