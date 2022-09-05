package codeforce.problemset.a;

import java.util.Scanner;

public class Task50A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
//        int m = 3, n = 3;
        int x = 2;
        int y = 1;

        int result = ((m/x) * (n * y)) + (((m%x) * (n*y))/x);
        System.out.println(result);
    }
}
