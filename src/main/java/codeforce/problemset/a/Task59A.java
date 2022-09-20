package codeforce.problemset.a;

import java.util.Scanner;

public class Task59A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] cs = s.toCharArray();
        int uc = 0, lc = 0;
        for(int i=0; i<cs.length; i++){
            if(cs[i] >= 65 && cs[i] <= 90) uc += 1;
            if(cs[i] >= 97 && cs[i] <= 122) lc += 1;
        }
        if(uc > lc) s = s.toUpperCase();
        else s = s.toLowerCase();
        System.out.println(s);
    }
}
