package lc;

import java.util.Arrays;

public class LC821 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] dist = new int[s.length()];

        int prev = -n; // very far left
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            dist[i] = i - prev;
        }

        prev = 2 * n; // very far right
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            dist[i] = Math.min(dist[i], prev - i);
        }
        return dist;
    }
}

class LC821Test {
    public static void main(String[] args){
        LC821 lc821 = new LC821();
        String s = "loveleetcode"; char c = 'e';
        int[] dist = lc821.shortestToChar(s, c);
        for(int d : dist) System.out.print(d + " ");
    }
}
