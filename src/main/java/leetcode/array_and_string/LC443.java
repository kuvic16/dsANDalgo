package leetcode.array_and_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LC443 {
    public int compress(char[] chars) {
        HashMap<String, Integer> m = new HashMap<>();
        for(char c : chars){
            Integer cnt = m.get(String.valueOf(c));
            m.put(String.valueOf(c), cnt != null ? cnt + 1 : Integer.valueOf(1));
        }

        int t = 0, i = 0;
        Iterator it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>)it.next();
            chars[i++] = pair.getKey().charAt(0);
            t += 1;
            if(pair.getValue() != 1) {
                String number = String.valueOf(pair.getValue());
                t += number.length();
                for(char cc : number.toCharArray()){
                    chars[i++] = cc;
                }                
            }            
            it.remove(); 
        }        
        return t;
    }
}

class LC443Test {
    public static void main(String[] args){
        LC443 lc443 = new LC443();
        //System.out.println(lc443.compress(new char[]{'a','a','b','b','c','c','c'}));
        //System.out.println(lc443.compress(new char[]{'a'}));
        //System.out.println(lc443.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
        System.out.println(lc443.compress(new char[]{'a','a','a','b','b','a','a'}));
    }
}
