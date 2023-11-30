package Study.dynamic_programming;

/**
 * Create a subset from given integer
 * Input: 3
 * Output: 0, (0,1), (0,1,2), (0,2), 1, (1,2), 2
 */
public class _3_Subsequence {
    int max;
    public void subset(int n, String r){
        if(n > max) return;
        r = r + " " + n;
        System.out.println(r);
        subset(n+1, r);
    }

    public static void main(String[] args){
        _3_Subsequence subsequence = new _3_Subsequence();
        subsequence.max = 2;
        for(int i=0; i<= subsequence.max; i++)
        subsequence.subset(i, "");
    }
}
