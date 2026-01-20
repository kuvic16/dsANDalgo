package lc;

import java.util.Arrays;

public class LC1652 {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if(k == 0){
            Arrays.fill(result, 0);
            return result;
        }
        int ksum = 0;
        if(k > 0) {
            for (int i = 1; i < 1 + k; i++) ksum += code[i];
            result[0] = ksum;
            for (int i = 1; i < code.length; i++) {
                if (i + k < code.length) ksum = ksum - code[i] + code[i + k];
                else ksum = ksum - code[i] + code[i + k - code.length];
                result[i] = ksum;
            }
        }else{
            for (int i = code.length-1; i > code.length - 1 + k; i--) ksum += code[i];
            result[0] = ksum;
            for (int i = 1; i < code.length; i++) {
                if (i-1+k+code.length < code.length) ksum = ksum + code[i-1] - code[i-1+k+code.length];
                else ksum = ksum - code[i] - code[code.length - i -1 -k];
                result[i] = ksum;
            }

            // [2,4,9,3], k = -2 1 -2 = -1 + 4 = 3 1-1-2+4 =2 2-1-2+4 = 3 3-1-2+4=4 4-1
            //
            // 1 - (-2) - 3 = 0
        }

        return result;
    }
}

class LC1652Test {
    public static void main(String[] args){
        LC1652 lc1652 = new LC1652();
//        int[] code = {5,7,1,4};
//        int k = 3;
        int[] code = {2,4,9,3};
        int k = -2;
        int[] result = lc1652.decrypt(code, k);
        for(int i : result) System.out.print(i + " ");
    }
}
