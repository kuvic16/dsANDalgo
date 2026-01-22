package lc;

import java.util.HashMap;

public class LC1763 {
    public String longestNiceSubstring(String s) {
        String maxString = "";
        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> up = new HashMap<>();
            HashMap<Character, Integer> lo = new HashMap<>();
            for(int j=i; j<s.length(); j++){
                Character c = s.charAt(j);
                if(Character.isUpperCase(c)) up.put(c, 1);
                else lo.put(Character.toUpperCase(c), 1);

                if(up.keySet().equals(lo.keySet()) && j-i+1 > maxString.length()){
                    maxString = s.substring(i, j+1);
                }
            }
        }
        return maxString;
    }
}

class LC1763Test{
    public static void main(String[] args){
        LC1763 lc1763 = new LC1763();
        String s = "YazaAay";
//        String s = "aAay";
        String o = lc1763.longestNiceSubstring(s);
        System.out.println(o);
    }
}
