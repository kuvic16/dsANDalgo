package leetcode.stack;

import java.util.Iterator;
import java.util.Stack;

public class LC394 {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ']'){
                //stack.pop();
                StringBuilder subs = new StringBuilder();
                while(true){
                    char nc = stack.pop();
                    if(nc == '[') break;
                    subs.append(nc);
                }
                StringBuilder subk = new StringBuilder();
                while(!stack.empty()){
                    char nc = stack.pop();
                    if(nc >= '0' && nc <= '9') subk.append(nc);
                    else{
                        stack.push(nc);
                        break;
                    }
                }

                int k = Integer.parseInt(subk.reverse().toString());
                String nsubs = subs.toString();
                for(int j=0; j<k; j++){
                    for(int ii=nsubs.length()-1; ii>=0; ii--){
                        stack.push(nsubs.charAt(ii));
                    }
                }
            }else stack.push(c);
        }

        Iterator iterator = stack.iterator();
        StringBuilder fBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            fBuilder.append(iterator.next());
        }
        return fBuilder.toString();
    }
}

class LC394Test {
    public static void main(String[] args){
        LC394 lc394 = new LC394();
        //System.out.println(lc394.decodeString("3[a2[c]]"));
        //System.out.println(lc394.decodeString("3[a]2[bc]"));
        System.out.println(lc394.decodeString("2[abc]3[cd]ef"));
        //System.out.println(lc394.decodeString("100[leetcode]"));
    }
}