package leetcode.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LC1160 {
    public String addBinary(String a, String b) {
        int i=a.length() - 1, j=b.length() - 1;
        StringBuilder result = new StringBuilder();
        char reminder = '0', a1 = '0', b1 = '0', sum = '0';
        while (i >= 0 || j >= 0){
            a1 = '0'; b1 = '0';
            if(i >= 0) {
                a1 = a.charAt(i);
                i--;
            }
            if(j >= 0){
                b1 = b.charAt(j);
                j--;
            }
            if(a1 == '1' && b1 == '1') {
                sum = '0';
                if(reminder == '1') sum = '1';
                reminder = '1';
            }else if(a1 == '0' && b1 == '0') {
                sum = '0';
                if(reminder == '1') {
                    sum = '1';
                    reminder = '0';
                }
            }else if((a1 == '1' && b1 == '0') || (a1 == '0' && b1 == '1')) {
                sum = '1';
                if(reminder == '1'){
                    sum = '0';
                    reminder = '1';
                }
            }
            result.append(sum);
        }
        if(reminder == '1') result.append("1");

        return result.reverse().toString();
    }
}

class LC1160Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1160 lc1160 = new LC1160();
//        String a = "11", b = "1";
        String a = "1010", b = "1011";
        String result = lc1160.addBinary(a, b);
        System.out.println(result);
    }
}
