package leetcode;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * 121
 */
public class ThreeSum {
    public List<List<Integer>> generate(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> triplet = null;
        int a, b, c = 0;
        for(int i=0; i<nums.length && i + 2 <nums.length; i++){
            a = nums[i];
            b = nums[i+1];
            for(int j = i+2; j<nums.length; j++){
                c = nums[j];
                System.out.println(a + "," + b + "," + c);
//                if(a + b + c == 0) {
//                    triplet = new ArrayList<>();
//                    triplet.add(a);
//                    triplet.add(b);
//                    triplet.add(c);
//                    result.add(triplet);
//                }
            }
        }
        return result;
    }
}

class ThreeSumTest {
    public static void main(String[] args) throws FileNotFoundException {
        ThreeSum threeSum = new ThreeSum();

        int []input = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum.generate(input);
        for(List<Integer> r : result) {
            System.out.print(r.get(0) + "," + r.get(1) + "," + r.get(2));
            System.out.println();
        }
    }
}
