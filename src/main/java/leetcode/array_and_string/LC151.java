package leetcode.array_and_string;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class LC151 {
    public String reverseWords(String s) {
        if(s == null || s.trim().length() == 0) return "";
        String[] ss = s.split(" ");
        String result = "";
        for(int i=ss.length-1; i >= 0; i--){
            if(ss[i].trim().length() > 0) result += ss[i] + " ";
        }
        return result.trim();
    }

    public String reverseWords_1(String s) {
        if(s == null || s.trim().length() == 0) return "";
        
        Stack<String> q = new Stack<>();
        for(String l : s.split(" ")){
            if(l.trim().length() > 0) q.push(l.trim());
        }

        String result = "";
        while(!q.isEmpty()){
            result += q.pop() + " ";
        }
        return result.trim();
    }
}

class LC151Test {
    public static void main(String[] args){
        LC151 lc151 = new LC151();
        System.out.println(lc151.reverseWords("a good   example"));
    }
}
