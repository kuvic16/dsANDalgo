package codeforce;

import java.util.Scanner;

public class Task158B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += in.nextInt();
        }
        int taxi = sum / 4;
        if(sum % 4 != 0){
            taxi += 1;
        }
        System.out.println(taxi);
    }
}
