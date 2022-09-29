package codeforce.problemset.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CF1739A {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\dsANDalgo\\src\\main\\java\\codeforce\\problemset\\testdata\\CF1739A.txt");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(file);

        int t = in.nextInt();

        while(t > 0) {
            int n = in.nextInt();
            int m = in.nextInt();

            int x = 0, y = 0;
            boolean isolated = false;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    x = i;
                    y = j;

                    boolean canMove = (x + 1 <= n && y - 2 > 0) || (x + 1 <= n && y + 2 <= m);
                    canMove = canMove || (x + 2 <= n && y - 1 > 0) || (x + 2 <= n && y + 1 <= m);
                    canMove = canMove || (x - 1 > 0 && y - 2 > 0) || (x - 1 > 0 && y + 2 <= m);
                    canMove = canMove || (x - 2 > 0 && y - 1 > 0) || (x - 2 > 0 && y + 1 <= m);
                    if (!canMove) {
                        isolated = true;
                        break;
                    }
                }
                if (isolated) break;
            }
            System.out.println(x + " " + y);
            t--;
        }

    }
}
