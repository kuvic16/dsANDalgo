package leetcode.array_and_string;

import java.util.ArrayList;
import java.util.List;

public class LC1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int i=0, j = candies.length-1, max = 0;
        while(i<=j){
            if(candies[i] > max) max = candies[i];
            if(candies[j] > max) max = candies[j];
            i++; j--;
        }

        for(i = 0; i<candies.length; i++){
            result.add((candies[i] + extraCandies) >= max);
        }
        return result;
    }
}

class LC1431Test {
    public static void main(String[] args){
        LC1431 lc1431 = new LC1431();
        List<Boolean> result = lc1431.kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        for(Boolean b : result) System.out.print(b + " ");
    }
}