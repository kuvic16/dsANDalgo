package leetcode.bit_manipulation;

public class LC338 {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(Integer i= 0; i<=n; i++){
            String bn = Integer.toBinaryString(i);
            result[i] = bn.replaceAll("0", "").length();
        }
        return result;
    }

    public static void main(String[] args){
        LC338 lc338 = new LC338();
        int n = 0;
        n = 2;
        n = 5;
        int[] result = lc338.countBits(n);
        for(int r : result){
            System.out.println(r + " ");
        }
    }
}
