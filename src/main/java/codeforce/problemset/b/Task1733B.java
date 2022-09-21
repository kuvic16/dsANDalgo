package codeforce.problemset.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1733B {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\a\\testdata\\Task1733B.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            if(x != 0 && y != 0){
                System.out.println("-1");
                t--;
                continue;
            }

            int wp = 0, tw = 0;
            int p1 = 1, p2 = 0;
            int[] c = new int[n-1];
            boolean nr = false;
            for(int i=2; i<=n; i++){
                p2 = i;
                if(x > 0){
                    wp = tw < x ? p1 : p2;
                }else if(y > 0){
                    wp = tw < y ? p2 : p1;
                }
                c[i-2] = wp;
                if(p1 != wp) tw = 0;
                tw += 1;
                p1 = wp;
            }

            int count = 0, prev = 0;
            for(int i=0; i<c.length; i++) {
                if(i != 0 && prev != c[i] && count != x && count != y){
                    nr = true;
                    break;
                }else if(i != 0 && prev != c[i]){
                    count = 0;
                }
                prev = c[i];
                count += 1;
            }
            if(count != x && count != y){
                nr = true;
            }

            if(nr) System.out.print("-1");
            else{
                for(int i=0; i<c.length; i++) System.out.print(c[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}
