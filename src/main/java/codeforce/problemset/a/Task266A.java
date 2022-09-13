package codeforce.problemset.a;

import java.util.Scanner;

public class Task266A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String stones = in.next();
        char[] ss = stones.toCharArray();
        int count = 0; char prev = '_';
        for(int i=0; i<n; i++){
            if(i != 0 && ss[i] == prev){
                count += 1;
            }
            prev = ss[i];
        }
        System.out.println(count);
    }
}
