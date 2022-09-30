package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF734A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF734A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);

        int n = in.nextInt();
        String s = in.next();
        char[] cs = s.toCharArray();

        int acount = 0, dcount = 0;
        for(int i=0; i<n; i++){
            if(cs[i] == 'A') acount += 1;
            if(cs[i] == 'D') dcount += 1;
        }

        String result = "Friendship";
        if(acount > dcount) result = "Anton";
        if(acount < dcount) result = "Danik";
        System.out.println(result);

    }
}
