package lc;

public class LC3411 {
    public int maxLength(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int gcdA = nums[i];
            int lcmA = nums[i];
            int prod = nums[i];;
            for(int j= i+1; j<nums.length; j++){
                int b = nums[j];
                int gcd = getGCD(gcdA, b);
                //System.out.println("a: " + a + ", b: " + b);
                //System.out.println("gcd: " + gcd);
                int lcm = getLCM(lcmA, b);
                prod *= nums[j];
                if(Math.abs(prod) == gcd * lcm){
                    int count = j - i + 1;
                    System.out.println(count);
                    max = Math.max(max, count);
                }
                gcdA = gcd;
                lcmA = lcm;
            }
            System.out.println("=====");
        }
        return max;
    }

    public int getGCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getLCM(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }
}

class LC3411Test {
    public static void main(String[] args){
        LC3411 lc3411 = new LC3411();
        int[] nums  = {1,2,1,2,1,1,1};
        int result = lc3411.maxLength(nums);
        System.out.println(result);
    }
}