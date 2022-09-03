package codeforce;

import java.util.Scanner;

public class Task231A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            int p = in.nextInt();
            int v = in.nextInt();
            int t = in.nextInt();
            if(p+v+t >= 2) count++;
        }
        System.out.println(count);
    }
}
