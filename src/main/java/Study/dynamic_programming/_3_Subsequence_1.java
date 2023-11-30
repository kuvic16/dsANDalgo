package Study.dynamic_programming;

/**
 * Create a subset from given integer
 * Input: 2
 * Output: 0, (0,1), (0,1,2), (0,2), 1, (1,2), 2
 */
public class _3_Subsequence_1 {
    int max;
    public void subset(int n, String r){
        if(n > max) return;
        r = r + " " + n;
        System.out.println(r);
        for(int i=n+1; i<= max; i++)
            subset(i, r);
    }

    public static void main(String[] args){
        _3_Subsequence_1 subsequence = new _3_Subsequence_1();
        subsequence.max = 3;
        for(int i=0; i<= subsequence.max; i++)
        subsequence.subset(i, "");
    }
}
