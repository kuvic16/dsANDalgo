package leetcode;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        // abcabcbb
        // abba
        // dvdf
        int left = 0, length = 0, maxLength = 0;
        for(int i=0; i<s.length(); i++){
            String sub = s.substring(left, i);
            char c = s.charAt(i);
            System.out.print("-Sub: " + sub + "-C: " + c);
            int find = sub.indexOf(c);
            if(find > -1){
                maxLength = Math.max(sub.length(), maxLength);
                System.out.print("-Length: " + maxLength);
                left = s.substring(0, i).lastIndexOf(c) + 1;
                length = s.substring(0, i+1).length() - left;
                System.out.print("-Left Index: " + left);
            }else{
                length++;
            }
            System.out.println();
        }
        return Math.max(length, maxLength);
    }
}
class LongestSubstringTest {
    public static void main(String[] args) throws FileNotFoundException {
        LongestSubstring longestSubstring = new LongestSubstring();

        String input = "abcabcbb";
       //String input = "bbbbb";
       // String input = "pwwkew";
        //String input = "abba";
        //String input = "dvdf";
        int output = longestSubstring.lengthOfLongestSubstring(input);
        System.out.println(output);
    }
}