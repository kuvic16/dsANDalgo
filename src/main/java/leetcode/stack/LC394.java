package leetcode.stack;

import java.util.Stack;

public class LC394 {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ']'){
                stack.pop();
                StringBuilder subs = new StringBuilder();
                while(true){
                    char nc = stack.pop();
                    if(nc == '[') break;
                    subs.append(nc);
                }
                int k = Integer.parseInt(stack.pop() + "");
            }else stack.push(c);
        }
        return "";
    }
}

class LC394Test {
    public static void main(String[] args){
        LC394 lc394 = new LC394();
        System.out.println(lc394.decodeString("3[a2[c]]"));
    }
}