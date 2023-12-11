package Study.dynamic_programming;

import java.util.HashMap;

/**
 * Create a subset from given integer
 * Input: 2
 * Output: 0, (0,1), (0,1,2), (0,2), 1, (1,2), 2
 */
public class _3_Subsequence_1 {
    int max;
    int maxLevel;
    HashMap<Integer, String> memo = new HashMap<>();

    public void subset(int n, String r, int level){
        if(n > max) return;
        if(level > maxLevel) return;
        r = r + " " + n;
        if(level == maxLevel) {
            System.out.println("Level: " + level + "- " + r);
        }
        for(int i=n+1; i<max; i++) {
            if (level <= maxLevel) {
                subset(n+1, r, level + 1);
            }
        }
    }

    public static void main(String[] args){
        _3_Subsequence_1 subsequence = new _3_Subsequence_1();
        subsequence.max = 5;
        subsequence.maxLevel = 3;

        for(int i=0; i<subsequence.max; i++)
        subsequence.subset(i, "", 1);
    }
}
