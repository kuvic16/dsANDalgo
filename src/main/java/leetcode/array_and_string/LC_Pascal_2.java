package leetcode.array_and_string;

import java.util.ArrayList;
import java.util.List;

public class LC_Pascal_2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) row.add(1);
                else row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            list.add(row);
        }
        return list.get(rowIndex);
    }
}

class LC_Pascal_2_Test{
    public static void main(String[] args){
        LC_Pascal_2 lcPascal2 = new LC_Pascal_2();
        List<Integer> result = lcPascal2.getRow(3);
        for(Integer r : result){
            System.out.print(r + " ");
        }
    }
}
