package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF1735A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF1735A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int t = in.nextInt();
        while(t>0){
            int n = in.nextInt();
            int c = (n-1)/3;
            //System.out.println(c);
            //System.out.println(n%3);

            int l1 = c, l2=c, l3=c;
            if(l1+l2+l3+3 != n){
                int diff = l1+l2+l3+3 - n;
                //System.out.println(diff);
                while(l1 > 1 && diff > 0){
                    l1--;
                    diff--;
                }
                while(l2 > 1 && diff > 0){
                    l2--;
                    diff--;
                }
                while(l3 > 1 && diff > 0){
                    l3--;
                    diff--;
                }
            }
            System.out.println();
            System.out.print(l1 + " ");
            System.out.print(l2 + " ");
            System.out.println(l3 + " ");

            if(l1 > 1 && l1 == l2 && l2 == l3){
                l1 -= 1;
                l3 += 1;
            }
            if(l2 > 1 && l2 == l3){
                l2 -= 1;
                l3 += 1;
            }
            System.out.println();
            System.out.print(l1 + " ");
            System.out.print(l2 + " ");
            System.out.println(l3 + " ");

            int min = Math.abs(l1-l2);
            if(min > Math.abs(l2-l3)){
                min = Math.abs(l2-l3);
            }
            if(min > Math.abs(l3-l1)){
                min = Math.abs(l3-l1);
            }
            System.out.println(min);

            t--;
        }
    }
}
