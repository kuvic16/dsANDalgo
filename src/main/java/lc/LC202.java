package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC202 {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(n == 1) return true;
        if(n == 0) return false;
        //if(n < 10) return false;
        while (n > 0){
            int sum = 0;
            if(map.containsKey(n)){
                return false;
            }else{
                int temp = n;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += (int) Math.pow(digit, 2);
                    temp = temp / 10;
                }
                map.put(n, sum);
            }
            if(sum == 1) return true;
            n = sum;
            System.out.println(sum);
        }
        return false;
    }
}

class LC202Test {
    public static void main(String[] args) {
        LC202 lc202 = new LC202();
        //int n = 19;
        int n = 15;
        boolean result = lc202.isHappy(n);
        System.out.println(result);
    }
}
