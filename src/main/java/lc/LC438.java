package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<p.length(); i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> ana = new HashMap<>();
        for(int j=0; j<p.length() && j< s.length(); j++){
            ana.put(s.charAt(j), ana.getOrDefault(s.charAt(j), 0) + 1);
            if(p.length() == j+1 && map.equals(ana)){
                output.add(0);
            }
        }

        for(int i=1; i+p.length()-1 < s.length(); i++){
            char prev = s.charAt(i-1);

            if(ana.containsKey(prev)) {
                if (ana.get(prev) == 1) ana.remove(prev);
                else ana.put(prev, ana.getOrDefault(prev, 0) - 1);
            }

            char next = s.charAt(i+p.length()-1);
            ana.put(next, ana.getOrDefault(next, 0) + 1);

            if(map.equals(ana)){
                output.add(i);
            }
        }

        return output;
    }
}

class LC438Test {
    public static void main(String[] args){
        LC438 lc438 = new LC438();
        //String s = "cbaebabacd", p = "abc";
         String s = "abab", p = "ab";
        List<Integer> output = lc438.findAnagrams(s, p);
        for(Integer in : output) System.out.print(in + " ");
        System.out.println();
    }
}
