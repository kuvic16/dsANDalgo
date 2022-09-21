package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task977A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\a\\testdata\\Task977A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        int k = in.nextInt();

        for(int i=0; i<k; i++){
            if(n % 10 == 0) n = n/10;
            else n = n - 1;
        }
        System.out.println(n);

    }
}
