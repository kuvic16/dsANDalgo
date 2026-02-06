package lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC395 {
    //ababacb
    //ababbc
    public int longestSubstring(String s, int k) {
        int[] charcount = new int[26];
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            charcount = new int[26];
            map = new HashMap<>();
            for(int j=i; j<chars.length; j++){
                int index = chars[j] - 'a';
                charcount[index]++;
                map.put(chars[j], 1);
                if (charcount[index] >= k) {
                    int count = 0;
                    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                        if (charcount[entry.getKey() - 'a'] < k) {
                            count = 0;
                            break;
                        }
                        count += charcount[entry.getKey() - 'a'];
                    }
                    if(count > 0) max = Math.max(max, count);
                }
            }
        }
        return max;
    }
}


class LC395Test {
    public static void main(String[] args){
        LC395 lc395 = new LC395();
        //String s = "aaabb"; int k = 3;
        String s = "bbaaacbd"; int k = 3;
        //String s = "aaabbb"; int k = 3;
        //String s = "ababbc"; int k = 2;
        //String s = "ababacb"; int k = 2;
        int result = lc395.longestSubstring(s, k);
        System.out.println(result);
    }
}