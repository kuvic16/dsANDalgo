package leetcode.two_pointer;

public class LC392 {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for(char c : t.toCharArray()){
            if(j < s.length() && c == s.charAt(j)) j++;
        }
        return s.length() == j;
    }
}

class LC392Test {
    public static void main(String []args){
        LC392 lc392 = new LC392();
        //System.out.println(lc392.isSubsequence("abc", "ahbgdc"));
        System.out.println(lc392.isSubsequence("axc", "ahbgdc"));
    }
}