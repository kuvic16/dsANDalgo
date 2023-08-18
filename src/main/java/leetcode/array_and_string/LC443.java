package leetcode.array_and_string;

public class LC443 {
    public int compress(char[] chars) {
        char cc = Character.MIN_VALUE; int count = 0, i = 0;
        for(char c : chars){
            if(cc == 0){
                count = 1;
                chars[i++] = c;
            }else if(cc != c){
                if(count > 1){
                    String s = String.valueOf(count);
                    for(char lc : s.toCharArray()){
                        chars[i++] = lc;
                    }
                }
                chars[i++] = c;
                count = 1;                
            }else{
                count += 1;
            }
            cc = c;
        }

        if(count > 1){
            String s = String.valueOf(count);
            for(char lc : s.toCharArray()){
                chars[i++] = lc;
            }
        }

        for(char x : chars) System.out.print(x + " ");
        
        
        return i;
    }
}

class LC443Test {
    public static void main(String[] args){
        LC443 lc443 = new LC443();
        System.out.println(lc443.compress(new char[]{'a','a','b','b','c','c','c'}));
        //System.out.println(lc443.compress(new char[]{'a'}));
        //System.out.println(lc443.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
        //System.out.println(lc443.compress(new char[]{'a','a','a','b','b','a','a'}));
    }
}
