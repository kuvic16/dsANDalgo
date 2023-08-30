package leetcode.stack;

import java.util.Iterator;
import java.util.Stack;

public class LC2390 {
    public String removeStars(String s) {
        Stack<Character> ss = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*' && !ss.empty()) ss.pop();
            else ss.push(s.charAt(i));
        }

        Iterator iterator = ss.iterator();
        StringBuilder fBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            fBuilder.append(iterator.next());
        }
        return fBuilder.toString();
    }
}

class LC2390Test {
    public static void main(String[] args){
        LC2390 lc2390 = new LC2390();
        System.out.println(lc2390.removeStars("leet**cod*e"));
        System.out.println(lc2390.removeStars("erase*****"));
    }
}
