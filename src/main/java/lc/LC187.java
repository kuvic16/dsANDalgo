package lc;

import java.util.*;
import java.util.stream.Collectors;

public class LC187 {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> unq = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(s.length() - i >= 10) {
                String sub = s.substring(i, i + 10);
                if (map.containsKey(sub)) {
                    unq.put(sub, 1);
                }else{
                    map.put(sub, 1);
                }
            }
        }
        return new ArrayList<>(unq.keySet());
    }
}

class LC187Test {
    public static void main(String[] args){
        LC187 lc187 = new LC187();
//        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String input = "AAAAAAAAAAAAA";
        List<String> out = lc187.findRepeatedDnaSequences(input);
        for(String o : out) System.out.println(o);
    }
}