package leetcode;

import java.io.FileNotFoundException;

/**
 * 121
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        String s = String.valueOf(x);
        int j = s.length() - 1;
        for(int i=0; i<s.length()/2; i++){
            System.out.println(s.charAt(i) + "==" + s.charAt(j));
            if(s.charAt(i)))
            j--;
        }

        return false;
    }
}

class PalindromeNumberTest {
    public static void main(String[] args) throws FileNotFoundException {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean result = palindromeNumber.isPalindrome(12210);
        System.out.println(result);
    }
}
