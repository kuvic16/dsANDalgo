package leetcode.dp_1d;

public class LC1137 {
    int[] disk = new int[1000];
    public int tribonacci(int n) {
        if(n <= 1) return n == 1 ? 1 : 0;

        if(disk[n] != 0) return disk[n];
        else{
            disk[n] = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
            return disk[n];
        }
    }

    public static void main(String[] args){
        LC1137 lc1137 = new LC1137();
        int n = 25;
        System.out.println(lc1137.tribonacci(n));
    }
}
