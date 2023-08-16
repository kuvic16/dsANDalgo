package leetcode.array_and_string;


public class LC345 {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        int lv = -1, rv = -1;
        while(i < j){
            char lc = s.charAt(i);
            if(lv == -1 && isVowel(lc)){
                lv = i;
            }

    	    char rc = s.charAt(j);
            if(rv == -1 && isVowel(rc)){
                rv = j;
            }

            if(lv != -1 && rv != -1){
                char lvc = s.charAt(lv);
                char rvc = s.charAt(rv);
                s = s.substring(0, lv) + rvc + s.substring(lv + 1);
                s = s.substring(0, rv) + lvc + s.substring(rv + 1);
                lv = -1;
                rv = -1;
            }

            if(lv == -1) i++;
            if(rv == -1) j--;
        }
        return s;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}

class LC345Test {
    public static void main(String[] args){
        LC345 lc345 = new LC345();
        //System.out.println(lc345.reverseVowels("hello"));
        System.out.println(lc345.reverseVowels("leetcode"));
    }
}
