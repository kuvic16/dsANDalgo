package codeforce.problemset.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task266B {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\Task266B.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        int t = in.nextInt();
        String s = in.next();
        char[] qs = s.toCharArray();
        for(int j=0; j<t; j++) {
            for (int i = 0; i < n; i++) {
                if (qs[i] == 'B' && i + 1 < n && qs[i + 1] == 'G') {
                    char tmp = qs[i];
                    qs[i] = qs[i + 1];
                    qs[i + 1] = tmp;
                    i += 1;
                }
            }
        }
        System.out.println(qs);
    }
}
