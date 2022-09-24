package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task116A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\a\\testdata\\Task116A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        int total = 0, max = 0;
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            total = total - a;
            total = total + b;
            if(total > max) max = total;
        }
        System.out.println(max);
    }
}
