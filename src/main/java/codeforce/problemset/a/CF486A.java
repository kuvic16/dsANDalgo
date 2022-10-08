package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF486A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF486A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        long n = in.nextLong();
        long x = n/2;
        long y = n/2;
        if(n%2 != 0){
            y += 1;
        }
        long sum = x * (x+1) - (y * y);
        System.out.println(sum);
    }
}
