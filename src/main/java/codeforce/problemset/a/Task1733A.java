package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1733A {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\a\\testdata\\Task1733A.txt");
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(file);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            long[] nums = new long[n];
            for(int j=0; j<n; j++){
                nums[j] = in.nextLong();
            }

            long max = 0;
            for(int j=0; j<n; j++){
                for(int l=j+1; l<n; l++){
                    if(j%k == l%k && nums[j] > nums[l]){
                        long tmp = nums[l];
                        nums[l] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }

            for(int j=0; j<n && j+k<=n; j++){
                long sum = 0;
                int l = j;
                for(int ll=0; ll<k;  ll++){
                    sum += nums[l++];
                }
                if(max < sum) max = sum;
            }

            System.out.println(max);
        }
    }
}
