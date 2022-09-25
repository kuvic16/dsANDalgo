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

            long min = -999;
            for(int i=0; i<n; i++){
                long count =0, totalpath = 0;
                for(int j=0; j<n && count < 3;  j++){
                    if(i > j){
                        totalpath += (a[i] - a[j]);
                        count++;
                    }else if( i < j){
                        totalpath += (a[j] - a[i]);
                        count++;
                    }else{
                        count++;
                    }
                }
                if(min == -999) min = totalpath;
                else if(min > totalpath) min = totalpath;
            }
            System.out.println(min);
            t = t-1;
        }
    }
}
