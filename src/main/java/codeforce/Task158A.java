package codeforce;

import java.util.Scanner;

public class Task158A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        int[] places = new int[n];
        for(int i=0; i<n; i++){
            places[i] = in.nextInt();
        }

        for(int i=0; i<n; i++){
            if(places[i] > 0 && places[i] >= places[k - 1]) count += 1;
        }
        System.out.println(count);
    }
}
