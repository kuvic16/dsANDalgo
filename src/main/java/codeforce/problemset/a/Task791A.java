package codeforce.problemset.a;

import java.util.Scanner;

public class Task791A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int year = 0;
        while(a <= b){
            year += 1;
            a = a * 3;
            b = b * 2;
        }
        System.out.println(year);
    }
}
