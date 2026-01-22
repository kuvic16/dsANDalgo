package lc;

public class LC1876 {
    public int countGoodSubstrings(String s) {
        //xyzzaz
        int left = 0, right = left + 2, count = 0;
        while(left < s.length() && left + 2 < s.length()){
            if(s.charAt(left) != s.charAt(left+1)
                    && s.charAt(left+1) != s.charAt(left+2)
                    && s.charAt(left) != s.charAt(left+2)
            ){
                count++;
            }
            left++;
        }
        return count;
    }
}

class LC1876Test {
    public static void main(String[] args){
        LC1876 lc1876 = new LC1876();
        String in = "xyzzaz";
        int out = lc1876.countGoodSubstrings(in);
        System.out.println(out);
    }
}
