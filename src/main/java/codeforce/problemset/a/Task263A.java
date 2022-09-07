package codeforce.problemset.a;

import java.util.Scanner;

public class Task263A {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int x =0, y=0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(in.nextInt()==1){
                    x = i; y=j;
                }
            }
        }
        //System.out.println(x);
        //System.out.println(y);
        int movex = (3 - x);
        if(movex < 0) movex *= -1;
        int movey = ( 3 - y);
        if(movey < 0) movey *= -1;
        int move = movex + movey;
        System.out.println(move);
    }
}
