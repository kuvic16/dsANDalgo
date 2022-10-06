package leetcode.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LC1161 {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;

        int index = -1;
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                boolean found = true; int count = 0;
                for(int j=0; i+j < haystack.length() && j<needle.length(); j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        found = false;
                        break;
                    }
                    count++;
                }
                if(found && count == needle.length()){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public int strStr1(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;

        int j=0; int index = -1, k = -1;
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(j++)){
                if(k == -1) k = i;
                if(j == needle.length()){
                    index = i - (j - 1);
                    break;
                }
                continue;
            }
            j = 0;
            i = i - (j - 1) + 1;
        }
        return index;
    }
}

class LC1161Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1161 lc1161 = new LC1161();
//        String haystack = "sadbutsad", needle = "sad";
//        String haystack = "leetcode", needle = "leeto";
        String haystack = "mississippi", needle = "issip";
//          String haystack = "mississippi", needle = "issipi";
        int result = lc1161.strStr1(haystack, needle);
        System.out.println(result);
    }
}
