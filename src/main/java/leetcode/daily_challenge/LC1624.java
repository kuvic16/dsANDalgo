package leetcode.daily_challenge;

public class LC1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int i=0, j=s.length()-1, mi=-1, mj=-1;
        while (i<s.length()){
            if(i<j && s.charAt(i) == s.charAt(j)) {
                if(j-i>mj-mi) {mj = j; mi=i;}
                i++;
                j=0;
                continue;
            }
            if(i>j) {i++; j=0;}
            j--;
        }
        if(mi==-1) return -1;
        return mj - mi+1;
    }

    public static void main(String[] args){
        LC1624 lc1624 = new LC1624();
        String s = "";
        s = "aa";
        s = "ojdncpvyneq";
        //s = "abca";
        //s = "cbzxy";
        System.out.println(lc1624.maxLengthBetweenEqualCharacters(s));
    }
}
