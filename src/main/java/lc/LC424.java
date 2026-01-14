package lc;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class LC424 {


    // AABABBA - 1
    // AABABAA
    // ABBB
    public int characterReplacement(String s, int k) {
        if(s.length() <= 1) return s.length();

        int right = 0, left = 0, count = 0, max = 1, kc = 0;
        char lc = 'B';
        while(left < s.length() && right < s.length()){
            if(lc == s.charAt(right)){
                count++;
                right++;
            } else if(lc != s.charAt(right) && kc < k){
                count++;
                kc++;
                left = right;
                right++;
            } else if(lc != s.charAt(right) && kc >= k){
                left = right;
                right++;
                max = Math.max(count, max);
                kc = 0;
                count = 0;
            }
        }
        return Math.max(max, count);
//        return 0;
    }
    public int XcharacterReplacement(String s, int k) {
        if(s.length() <= 1) return s.length();

        int right = 1, left = 0, count =1, max = 1;
        while(left < s.length() && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                count++;
            }
            else if(s.charAt(left) != s.charAt(right)){
                left = right;
                max = Math.max(max, count);
                count = 1;
            }
            right += 1;
        }
        return Math.max(max, count);
//        return 0;
    }

}

class LC424Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC424 lc424 = new LC424();

        //String s = "ABAB"; int k = 2;
        //String s = "AABABBA"; int k = 1;
        String s = "ABBB"; int k = 2;
        //String s = "ABBBABBAABBBBvvvvvvvvBBB"; int k = 2;
        int result = lc424.characterReplacement(s, k);
        System.out.println(result);
    }
}