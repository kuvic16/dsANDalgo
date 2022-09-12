package codeforce.problemset.b;

import java.util.Scanner;

public class Task1729B {

    public static void main(String[] args){
        char[] letter = new char[]{'$', 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i<n; i++){
            int m = in.nextInt();
            String decode = "";
            String code = in.next();
            char[] cc = code.toCharArray();
            for(int k=cc.length-1; k >= 0; k--){
                if(cc[k] == '0'){
                    decode = letter[Integer.valueOf(String.valueOf(cc[k-2]) + String.valueOf(cc[k-1]))] + decode;
                    k -= 2;
                }else{
                    decode = letter[Integer.valueOf(String.valueOf(cc[k]))] + decode;
                }
            }
            System.out.println(decode);
        }
    }
}
