package codeforce.problemset.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task236A {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        List<String> d = new ArrayList<>();
        char[] ws = word.toCharArray();
        for(int i=0; i<ws.length; i++){
            boolean f = false;
            for(String c : d){
                if(c.equalsIgnoreCase(String.valueOf(ws[i]))) {
                    f = true;
                    break;
                }
            }
            if(!f) d.add(String.valueOf(ws[i]));
        }
        //System.out.println(d.size());
        if(d.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
