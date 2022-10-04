package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF467A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF467A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        int total = 0;
        while(n > 0){
            int p = in.nextInt();
            int q = in.nextInt();
            total += q - p >= 2 ? 1 : 0;
            n--;
        }
        System.out.println(total);
    }
}
