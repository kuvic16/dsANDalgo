package leetcode.random;

import java.util.HashMap;
import java.util.Stack;

public class LC3 {
    char[] letters = {};
    HashMap<Character, Integer> map = new HashMap<>();
    int max = 0;

    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        letters = s.toCharArray();
        traverse(0);
        return max;
    }

    public void traverse(int index){
        if(index >= letters.length) return;
        for(int i = index; i<letters.length; i++){
            if(map.containsKey(letters[i])){
                int count = map.size();
                if(max < count) max = count;
                int j = map.get(letters[i]).intValue() + 1;
                map = new HashMap<>();
                traverse(j); break;
            }else{
                map.put(letters[i], i);
            }
        }
        int count = map.size();
        if(max < count) max = count;
    }

    public static void main(String[] args){
        LC3 lc3 = new LC3();
//        System.out.println(lc3.lengthOfLongestSubstring("dvdf"));
//        System.out.println(lc3.lengthOfLongestSubstring("pwwkew"));
//        System.out.println(lc3.lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lc3.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lc3.lengthOfLongestSubstring("gaaqfeqlqky"));
    }
}


