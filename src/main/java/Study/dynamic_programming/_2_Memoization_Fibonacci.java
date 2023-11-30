package Study.dynamic_programming;

public class _2_Memoization_Fibonacci {

    int max = 20;
    int empty_value = -1;
    int[] memo = new int[100];
    public int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(memo[n] != -1) return memo[n];
        memo[n] = fibonacci(n-1) + fibonacci(n-2);
        return memo[n];
    }

    public static void main(String[] args){

        _2_Memoization_Fibonacci normal_fibonacci = new _2_Memoization_Fibonacci();
        for(int i=0; i<= normal_fibonacci.max; i++){
            normal_fibonacci.memo[i] = normal_fibonacci.empty_value;
        }

        System.out.println(normal_fibonacci.fibonacci(9));
    }
}
