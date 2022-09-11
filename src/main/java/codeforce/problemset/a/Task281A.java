package codeforce.problemset.a;

import java.util.Scanner;

public class Task281A {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String r = word.substring(0,1).toUpperCase();
        r += word.substring(1);
        System.out.println(r);
    }
}
