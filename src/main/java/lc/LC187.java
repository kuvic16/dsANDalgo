package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> out = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        char[] seq = new char[2];
        int count = 0, i = 0, nexti = 0;
        while(i<s.length()) {
            if(seq[0] != '\u0000' && seq[0] != s.charAt(i) && seq[1] != '\u0000' && seq[1] != s.charAt(i)){
                seq[0] = s.charAt(i);
                seq[1] = '\u0000';
                count = 1;
            }else if(seq[0] == '\u0000'){
                seq[0] = s.charAt(i);
                count += 1;
                nexti = i;
            }else if(seq[0] == s.charAt(i)) {
                count += 1;
            } else if(seq[1] == '\u0000') {
                seq[1] = s.charAt(i);
                count += 1;
                nexti = i;
            } else if(seq[1] == s.charAt(i)){
                count += 1;
            }
            if(count == 10){
                String nseq = s.substring(i-9, i+1);
                seq[0] = '\u0000';
                seq[1] = '\u0000';
                count = 0;
                if(!map.containsKey(nseq)){
                    map.put(nseq, 1);
                    out.add(nseq);
                }else{
                    i = nexti;
                    continue;
                }
            }
            i++;
        }
        return out;
    }
}

class LC187Test {
    public static void main(String[] args){
        LC187 lc187 = new LC187();
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> out = lc187.findRepeatedDnaSequences(input);
        for(String o : out) System.out.println(o);
    }
}