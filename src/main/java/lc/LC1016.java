package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1016 {
    public boolean queryString(String s, int n) {
        int max_size = Integer.toBinaryString(n).length();
        List<Integer> ss = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String sb = s.substring(i, j+1);
                if(sb.length() <= max_size) {
                    int num = Integer.parseInt(sb, 2);
                    if(num > 0 && num <= n && !ss.contains(num)) ss.add(num);
                }
                else break;
            }
        }
        return ss.size() == n;
    }
}

class LC1016Test {
    public static void main(String[] args){
        LC1016 lc1016 = new LC1016();
        String s = "1"; int n = 1;
        //String s = "0110"; int n = 3;
        //String s = "011010101010111101010101011111111111111111111111111111111110000000000000011111101010101001010101010101010101010101111010101010111111111111111111111111111111111100000000000000111111010101010010101010101010101010100"; int n = 1000000000;
        //String s = "0110"; int n = 4;
        boolean result = lc1016.queryString(s, n);
        System.out.println(result);
    }
}