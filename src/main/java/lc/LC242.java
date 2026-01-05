package lc;



import java.io.FileNotFoundException;
import java.util.HashMap;

public class LC242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.length() == 0 && t.length() == 0) return true;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if(map.get(c) <= 0) map.remove(c);
        }
        return map.isEmpty();
    }
}

class LC242Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC242 lc242 = new LC242();

        String s = "anagram", t = "nagaram";
        //String s = "rat", t = "car";
        boolean output = lc242.isAnagram(s, t);
        System.out.println(output);
    }
}