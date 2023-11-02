package leetcode.binary_search;

public class LC374 {
    int pick = 0;

    public int guessNumber(int n) {
        int i = 0, j = n-1;
        while((i+j/2) > 0){
            int m = (i+j)/2;
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