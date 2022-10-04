package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF677A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF677A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        int h = in.nextInt();
        int w = 0;
        while(n > 0){
            int a = in.nextInt();
            w += a > h ? 2 : 1;
            n--;
        }
        System.out.println(w);
    }
}
