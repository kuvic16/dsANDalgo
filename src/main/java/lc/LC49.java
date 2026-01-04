package lc;

import java.io.FileNotFoundException;
import java.util.*;

public class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] chrs = strs[i].toCharArray();
            Arrays.sort(chrs);
            String srt = new String(chrs);
            System.out.println(srt);

            if(map.containsKey(srt)){
                map.get(srt).add(strs[i]);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                map.put(srt,ls);
            }
        }

        for(List<String> lsl : map.values()){
            result.add(lsl);
        }

        return result;
    }
}

class LC49Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC49 lc49 = new LC49();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = lc49.groupAnagrams(strs);
        for(List<String> r : result){
            for(String s : r){
                System.out.print(s + ", ");
            }
            System.out.println();
        }
    }
}

