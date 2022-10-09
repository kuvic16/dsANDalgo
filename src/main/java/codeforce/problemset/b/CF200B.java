package codeforce.problemset.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF200B {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF200B.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        double n = in.nextInt();
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += in.nextInt();
        }

        double result = (sum * 100)/(n*100);
        System.out.printf("%.6f", result);
    }
}
