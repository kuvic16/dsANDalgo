package codeforce.problemset.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF1739B {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF1739B.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int t = in.nextInt();
        while (t > 0){
            int n = in.nextInt();
            int[] d = new int[n];
            int[] a = new int[n];
            boolean oneArray = true;
            for(int i=0; i<n; i++){
                d[i] = in.nextInt();
                if(i == 0){
                    a[i] = d[i];
                }else{
                    int x = Math.abs(d[i] + a[i-1]);
                    int y = Math.abs(d[i] - a[i-1]);
                    if(Math.abs(x - a[i-1]) == d[i] && Math.abs(y - a[i-1]) == d[i]) {
                        oneArray = false;
                        break;
                    }
                    a[i] = x;
                }
            }
            if(oneArray){
                for(int i=0; i<n; i++) System.out.print(a[i] + " ");
                System.out.println();
            }else{
                System.out.println(-1);
            }
            t--;
        }
    }
}
