package leetcode.array_and_string;

import java.io.FileNotFoundException;

public class LC1171 {
    public String gcdOfStrings(String str1, String str2) {
        String maxgcd = ""; boolean isGcd = false;
        String target = str1;
        String source = str2;
        if(str2.length() > str1.length()){
            target = str2;
            source = str1;            
        }


        for(int i=source.length(); i >= 0; i--){
            maxgcd = source.substring(0, i);
            if(source.replaceAll(maxgcd, "").length() == 0 && target.replaceAll(maxgcd, "").length() == 0){
                isGcd = true;
                break;
            } 
        }
        return isGcd == true ? maxgcd : "";
    }
}

class LC1171Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1171 lc1171 = new LC1171();
        // System.out.println(lc1171.gcdOfStrings("ABCDEF", "ABC"));
        // System.out.println(lc1171.gcdOfStrings("ABCABC", "ABC"));
        // System.out.println(lc1171.gcdOfStrings("ABABABAB", "ABAB"));
        System.out.println(lc1171.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
