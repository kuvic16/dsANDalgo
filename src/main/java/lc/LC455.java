package lc;

import java.util.Arrays;
import java.util.Collections;

public class LC455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int count = 0, nextj = 0;
        for(int i=0; i<g.length; i++){
            for(int j=nextj; j<s.length; j++) {
                if (g[i] <= s[j]) {
                    count++;
                    nextj = j+1;
                    break;
                }
            }
        }
        return count;
    }
}

class LC455Test {
    public static void main(String[] args){
        LC455 lc455 = new LC455();
//        int[] g = {1,2,3};
//        int[] s = {1, 1};
        int[] g = {1,2};
        int[] s = {1, 2, 3};
        int result = lc455.findContentChildren(g, s);
        System.out.println(result);
    }
}
