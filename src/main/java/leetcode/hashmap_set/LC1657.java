package leetcode.hashmap_set;

import java.util.Arrays;

public class LC1657 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        char[] words1 = word1.toCharArray();
        char[] words2 = word2.toCharArray();
        
        Arrays.sort(words1);
        word1 = new String(words1);
        System.out.println(word1);

        Arrays.sort(words2);
        word2 = new String(words2);
        System.out.println(word2);

        return word1.equalsIgnoreCase(word2);   
    }
}

class LC1657Test {
    public static void main(String[] args){
        LC1657 lc1657 = new LC1657();
        System.out.println(lc1657.closeStrings("abc", "bca"));
        System.out.println(lc1657.closeStrings("cabbba", "abbccc"));
    }
}
