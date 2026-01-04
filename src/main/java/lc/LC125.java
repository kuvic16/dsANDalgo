package lc;

import java.io.FileNotFoundException;
import java.util.List;

public class LC125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0, j=s.length()-1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}

class LC125Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC125 lc125 = new LC125();

        String input = "A man, a plan, a canal: Panama";
        boolean result = lc125.isPalindrome(input);
        System.out.println(result);

    }
}
