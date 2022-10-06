package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF344A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF344A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        String[] ss = new String[n];
        for(int i=0; i<n; i++){
            ss[i] = in.next();
        }

        int group = 1; String prev = ss[0];
        for(int i=1; i<n; i++){
            if(!ss[i].equalsIgnoreCase(prev)){
                group++;
                prev = ss[i];
            }
        }
        System.out.println(group);
    }
}
