package leetcode.two_pointer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LC1183 {
    public void reverseString(char[] s) {
        int i=0, j = s.length-1;
        while(i < j){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}

class LC1183Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1183 lc1183 = new LC1183();
        char[] s = {'h','e','l','l','o'};
        lc1183.reverseString(s);
    }
}
