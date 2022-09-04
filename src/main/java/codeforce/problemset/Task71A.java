package codeforce.problemset;

import java.util.Scanner;

public class Task71A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            String word = in.next();
            int length = word.length();

            if(length <= 10){
                System.out.println(word);
            }else{
                System.out.println(word.substring(0, 1) + (length - 2) + word.substring(length-1, length));
            }
        }
    }
}
