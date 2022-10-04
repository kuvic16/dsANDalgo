package leetcode.array2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LC1170 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev = null;
        List<Integer> r;
        for(int i=0; i<numRows; i++){
            r = new ArrayList<>();
            if(i > 1) prev = result.get(i-1);
            for(int j=0; j<=i; j++) {
                if (i == 0 || i==1 || j==0 || j==i) r.add(1);
                else{
                    r.add(prev.get(j-1) + prev.get(j));
                }
            }
            result.add(r);
        }
        return result;
    }
}

class LC1170Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC1170 lc1170 = new LC1170();
        List<List<Integer>> result = lc1170.generate(1);
        System.out.println();
        for(List<Integer> rs : result){
            for(Integer r : rs) System.out.print(r + " ");
            System.out.println();
        }
    }
}
