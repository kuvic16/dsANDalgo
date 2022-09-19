package codeforce.problemset.a;

import java.util.Scanner;

public class Task1733A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] nums = new int[n];
            for(int j=0; j<n; j++){
                nums[j] = in.nextInt();
            }

            long max = 0; int count = 0;
            for(int j=0; j<n; j++){
                long sum = 0;
                int l = j;
                for(int ll=0; ll<k && j+k<=n; ll++){
                    sum += nums[l++];
                }
                if(max < sum) max = sum;
            }

            for(int j=0; j<n; j++){
                for(int l=j+1; l<n; l++){
                    if(j%k == l%k){
                        int tmp = nums[l];
                        nums[l] = nums[j];
                        nums[j] = tmp;
                        count += 1;
                    }
                }
//                long sum = 0;
//                int l = j;
//                for(int ll=0; ll<k && j+k<=n; ll++){
//                    sum += nums[l++];
//                }
//                if(max < sum) max = sum;
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
