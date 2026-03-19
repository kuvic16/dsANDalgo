package lc;

import java.util.Arrays;

public class LC1040 {
    public int[] numMovesStonesII(int[] stones) {
        int[] result = new int[2];
        Arrays.sort(stones);
        for(int i=0; i<stones.length; i++)
        System.out.print(stones[i] + ", ");
        int min = stones[0], max = stones[stones.length-1];
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("diff: " + (max - min - 1));
        int movemin = Integer.MAX_VALUE, movemax = Integer.MIN_VALUE;
        for(int i=0; i<stones.length; i++){
            int diff = 0;
            for(int j=i+1; j<stones.length; j++){
                if(i != j-1)
                diff = stones[j] - stones[j-1] - 1;
            }
            System.out.println(diff);
        }

        return result;
    }
}

class LC1040Test {
    public static void main(String[] args){
        LC1040 lc1040 = new LC1040();
        int[] stones = {6,5,4,3,10};
        int[] result = lc1040.numMovesStonesII(stones);
        System.out.println(result[0] + ", " + result[1]);
    }
}
