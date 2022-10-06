package leetcode.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LC1162 {
    public String longestCommonPrefix(String[] strs) {
        int min = 0;
        for(int i=0; i<strs[0].length(); i++){
            int count= 1;
            for(int j=1; j<strs.length; j++){
                if(i < strs[j].length() && strs[0].charAt(i) == strs[j].charAt(i)){
                    count++;
                    continue;
                }
                break;
            }
            if(count == strs.length) min += 1;
            else break;
        }
        return strs[0].substring(0, min);
    }
}

class LC1162Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1162 lc1162 = new LC1162();
//        String[] strs = {"flower","flow","flight"};
        String[] strs = {"dog","racecar","car"};
        String result = lc1162.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
