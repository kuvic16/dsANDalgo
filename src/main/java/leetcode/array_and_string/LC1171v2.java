package leetcode.array_and_string;

import java.io.FileNotFoundException;

public class LC1171v2 {

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }    
    }

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equalsIgnoreCase(str2 + str1)){
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
}

class LC1171v2Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1171v2 lc1171 = new LC1171v2();
        // System.out.println(lc1171.gcdOfStrings("ABCDEF", "ABC"));
        // System.out.println(lc1171.gcdOfStrings("ABCABC", "ABC"));
        // System.out.println(lc1171.gcdOfStrings("ABABABAB", "ABAB"));
        System.out.println(lc1171.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
