package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF41A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF41A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        String a = in.next();
        String b = in.next();
        String ub = "";

        for(int i=0; i<b.length(); i++){
            char ch = b.charAt(i);
            ub = ch + ub;
        }

        String r = a.equalsIgnoreCase(ub) ? "YES" : "NO";
        System.out.println(r);
    }
}
