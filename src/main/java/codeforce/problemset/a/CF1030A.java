package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF1030A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF1030A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        String result = "EASY";
        while(n>0){
            int i = in.nextInt();
            if(result.equalsIgnoreCase("EASY")){
                result = (i == 1) ? "HARD" : "EASY";
            }
            n--;
        }
        System.out.println(result);
    }
}
