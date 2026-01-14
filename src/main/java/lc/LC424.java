package lc;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.io.FileNotFoundException;
import java.util.*;

public class LC424 {


    // AABABBA - 1
    // AABABAA
    // ABBB
    // AABABBABBB
    public int characterReplacement(String s, int k) {
        if(s.length() <= 1) return s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
            //map.put('S', 1);
        }

        int right = 0, left = 0, count = 0, max = 1, kc = 0;
        // AABABBABBB
        // AAAB
        // SDSSMESSTR
        // IMNJJTRMJEGMSOLSCCQICIHLQIOGBJAEHQOCRAJQMBIBATGLJDTBNCPIFRDLRIJHRABBJGQAOLIKRLHDRIGERENNMJSDSSMESSTR
        // AABA
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            char lc = entry.getKey();
            right = 0; left = -1; count = 0; kc = 0;
            Queue<Integer> leftQ = new ArrayDeque<>();
            while(right < s.length()){
                if(lc == s.charAt(right)){
                    count +=1;
                    right +=1;
                } else if(lc != s.charAt(right) && kc < k){
                    count +=1;
                    kc +=1;
                    //left = right;
                    if(!leftQ.contains(right)) leftQ.add(right);
                    right +=1;
                } else if(lc != s.charAt(right) && kc >= k){
                    //right = left + 1;
                    right = !leftQ.isEmpty() ? leftQ.poll() + 1 : right + 1;
                    max = Math.max(count, max);
                    kc = 0;
                    count = 0;
                }else{
                    right++;
                    max = Math.max(count, max);
                    kc = 0;
                    count = 0;
                }
            }
            max = Math.max(max, count);
        }
        return Math.max(max, count);
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

        String s = "ABAB"; int k = 2;
        //String s = "AABABBABBB"; int k = 1;
        //String s = "ABBB"; int k = 2;
        // String s = "ABBBABBAABBBBvvvvvvvvBBB"; int k = 2;
        //String s = "AAAB"; int k = 0;
        // String s = "AABA"; int k = 0;
        //String s = "IMNJJTRMJEGMSOLSCCQICIHLQIOGBJAEHQOCRAJQMBIBATGLJDTBNCPIFRDLRIJHRABBJGQAOLIKRLHDRIGERENNMJSDSSMESSTR"; int k = 2;
        //String s = "SDSSMESSTR"; int k = 2;
        int result = lc424.characterReplacement(s, k);
        System.out.println(result);
    }
}