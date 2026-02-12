package lc;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LC567 {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        HashMap<Character, Integer> maps = new LinkedHashMap<>();
        HashMap<Character, Integer> subs = new LinkedHashMap<>();
        for(int i=0; i<s1.length(); i++) {
            maps.put(s1.charAt(i), maps.getOrDefault(s1.charAt(i), 0) + 1);
            subs.put(s2.charAt(i), subs.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if(maps.equals(subs)) return true;

        for(int i=1; i+s1.length()-1<s2.length(); i++){
            subs = new LinkedHashMap<>();
            for(int j=i; j<i+s1.length(); j++){
                subs.put(s2.charAt(j), subs.getOrDefault(s2.charAt(j), 0) + 1);
            }
            if(maps.equals(subs)) return true;
        }
        return false;
    }
}

class LC567Test {
    public static void main(String[] args){
        LC567 lc567 = new LC567();
        //String s1 = "ab", s2 = "eidbaooo";
        //String s1 = "ab", s2 = "eidboaoo";
//        String s1 = "adc", s2 = "dcda";
        String s1 = "ab", s2 = "a";
        boolean result = lc567.checkInclusion(s1, s2);
        System.out.println(result);
    }
}
