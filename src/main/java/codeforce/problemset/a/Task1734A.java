package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1734A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\a\\testdata\\Task1734A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);

        int t = in.nextInt();
        while(t>0){
            int n = in.nextInt();
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = in.nextLong();
            }

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(a[i] > a[j]){
                        long tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }

            long min = -1;
            for(int i=0; i<n; i++){
                long minPath = -1;
                long path = 0;
                if(i-2 >= 0){
                    path = a[i] - a[i-2];
                    path += a[i] - a[i-1];
                    minPath = path;
                }

                if(i-1 >= 0 && i+1 < n){
                    path = a[i] - a[i-1];
                    path += a[i+1] - a[i];
                    if(minPath == -1 || path < minPath) minPath = path;
                }

                if(i+2 < n){
                    path = a[i+2] - a[i];
                    path += a[i+1] - a[i];
                    if(minPath == -1 || path < minPath) minPath = path;
                }

                if(min == -1 || minPath < min) min = minPath;
            }
            System.out.println(min);
            t = t-1;
        }
    }
}
