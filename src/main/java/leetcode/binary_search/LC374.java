package leetcode.binary_search;

public class LC374 {
    int pick = 6;

    public int guessNumber(int n) {
        int i = 1, j = n;
        if(n <= 2){
            for(int k=1; k<=n; k++) {
                int g = guess(k);
                if (g == 0) return k;
            }
            return 0;
        }
        while(i <= j){
            int m = i + (j-i)/2;
            int g = guess(m);
            if(g == 0) return m;
            if(g == -1) j = m - 1;
            else i = m + 1;
        }
        return 0;
    }

    public int guess(int num){
        int r = -1;
        if(num < pick) r = 1;
        else if(num == pick) r = 0;
        
        return r;
    }
}

class LC374Test {
    public static void main(String[] args){
        LC374 lc374 = new LC374();
        System.out.println(lc374.guessNumber(10));
    }
}