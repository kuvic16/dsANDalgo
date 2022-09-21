package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;

public class Task110A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\a\\testdata\\Task110A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        long n = in.nextLong();
        String ns = String.valueOf(n);

        Pattern pattern = Pattern.compile("4|7");
        Matcher matcher = pattern.matcher(ns);
        long count = matcher.results().count();

        String cs = String.valueOf(count);
        matcher = pattern.matcher(cs);

        String result = "NO";
        if(cs.length() == matcher.results().count()){
            result = "YES";
        }

        System.out.println(result);
    }
}
