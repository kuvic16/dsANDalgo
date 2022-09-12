package codeforce.problemset.a;

import java.util.Scanner;

public class Task1729A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int f1 = a - 1;
            int f2 = b - c;
            if(f2 < 0) {
                f2 *= -1;
            }
            f2 += (c - 1);
            if(f1 < f2) System.out.println(1);
            else if(f1 == f2) System.out.println(3);
            else System.out.println(2);
        }
    }
}
