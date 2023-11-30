package Study.dynamic_programming;

public class _1_Normal_Fibonacci {
    public int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){
        _1_Normal_Fibonacci normal_fibonacci = new _1_Normal_Fibonacci();
        System.out.println(normal_fibonacci.fibonacci(9));
    }
}
