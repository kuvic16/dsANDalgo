package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LC216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        populate(1, k, n, result, subset, 0);
        return result;
    }

    public void populate(int number, int k, int n, List<List<Integer>> result, List<Integer> subset, int sum) {

        for(int i=number; subset.size() <= k && i<= 9 && i < n; i++){
            subset.add(i);
            if(subset.size() == k) {
                int xsum = 0;
                //for (Integer xn : subset) System.out.print(xn);
                for (Integer xn : subset) xsum += xn;
                //System.out.println(": " + xsum);
                //System.out.println();
                if(xsum == n) result.add(new ArrayList<>(subset));
            }
            populate(i+1, k, n, result, subset, sum + i);
            subset.remove(subset.size()-1);
        }
    }

    public static void main(String[] args){
        LC216 lc216 = new LC216();
        int k=3, n=7;
        k=3; n=9;
        k=4; n=1;
        k=9; n=45;
        List<List<Integer>> results = lc216.combinationSum3(k,n);
        for(List<Integer> result : results){
            for(Integer num : result) System.out.print(num + " ");
            System.out.println();
        }
    }

}
