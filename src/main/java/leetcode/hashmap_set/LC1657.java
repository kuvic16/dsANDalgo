package leetcode.hashmap_set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1657 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        char[] words1 = word1.toCharArray();
        char[] words2 = word2.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i=0; i<words1.length; i++){
            if(!map1.containsKey(words1[i])) map1.put(words1[i], 1);
            else map1.put(words1[i], map1.get(words1[i]) + 1);
            if(!map2.containsKey(words2[i])) map2.put(words2[i], 1);
            else map2.put(words2[i], map2.get(words2[i]) + 1);
        }

        int count1[] = new int[map1.size()], count2[] = new int[map2.size()], i = 0, j=0;
        for (Map.Entry<Character, Integer> e : map1.entrySet()){
            if(map2.get(e.getKey()) == null) return false;

            count1[i++] = e.getValue();
            count2[j++] = map2.get(e.getKey());
        }
        Arrays.sort(count1);
        Arrays.sort(count2);

        for(int k=0; k<count1.length; k++){
            if(count1[k] != count2[k]) return false;
        }
        
        return true;
    }
}

class LC1657Test {
    public static void main(String[] args){
        LC1657 lc1657 = new LC1657();
         System.out.println(lc1657.closeStrings("abc", "bca"));
         System.out.println(lc1657.closeStrings("cabbba", "abbccc"));
         System.out.println(lc1657.closeStrings("cabbba", "aabbss"));
         System.out.println(lc1657.closeStrings("abbzzca", "babzzcz"));
        System.out.println(lc1657.closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff"));

    }
}
