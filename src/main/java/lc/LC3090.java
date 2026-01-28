package lc;

import java.util.HashMap;

public class LC3090 {
    public int maximumLengthSubstring(String s) {
        // bcbbbcba
        // aadaad
        int[] freq = new int[26]; int count = 0, max = Integer.MIN_VALUE, left = 0, right = 0;
        while(right < s.length()){
            int code = s.charAt(right) - 'a';
            freq[code]++;
            if(freq[code] == 3){
                freq = new int[26];
                max = Math.max(max, count);
                count = 0;
                left += 1;
                right = left;
            }else{
                count++;
                right++;
            }
        }
        return Math.max(max, count);
    }
}

class LC3090Test {
    public static void main(String[] args){
        LC3090 lc3090 = new LC3090();
        String s = "bcbbbcba";
        //String s = "aaaa";
        //String s = "aadaad";
        int out = lc3090.maximumLengthSubstring(s);
        System.out.println(out);
    }
}
