package codeforce.problemset.a;

import java.util.Scanner;

public class Task282A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            String statement = in.next();
            if(statement.startsWith("++")){
                sum += 1;
            }else if(statement.startsWith("--")){
                sum -= 1;
            }else if(statement.endsWith("++")){
                sum++;
            }else if(statement.endsWith("--")){
                sum--;
            }
        }
        System.out.println(sum);
    }
}
