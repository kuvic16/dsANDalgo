package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CF271A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF271A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int y = in.nextInt() + 1;
        while(true){
            String x = String.valueOf(y);
            char[] cs = x.toCharArray();
            Arrays.sort(cs);
            int j=0;
            for(int i=0; i<cs.length; i++){
                if(i==0 || cs[i-1] != cs[i]){
                    cs[j++] = cs[i];
                }
            }
            if(j == cs.length) break;
            y++;
        }
        System.out.println(y);
    }
}
