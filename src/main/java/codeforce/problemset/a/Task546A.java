package codeforce.problemset.a;

import java.util.Scanner;

public class Task546A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

        int cost = 0;
        for(int i=1; i<=w; i++){
            cost += i * k;
        }
        int lend = cost - n;
        if(lend < 0) lend = 0;
        System.out.println(lend);
    }
}
