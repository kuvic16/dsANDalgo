package lc;

public class LC978 {
    /*
    For i <= k < j:
arr[k] > arr[k + 1] when k is odd, and
arr[k] < arr[k + 1] when k is even.
Or, for i <= k < j:
arr[k] > arr[k + 1] when k is even, and
arr[k] < arr[k + 1] when k is odd.
     */
    public int maxTurbulenceSize(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int k = arr[i], count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(k%2 == 0 && k < arr[j]) count++;
                else if(k > arr[j]) count++;

                k = arr[j];
                
            }
        }
        return 0;
    }
}

class LC978Test {
    public static void main(String[] args){
        LC978 lc978 = new LC978();
        int[] arr = {9,4,2,10,7,8,8,1,9};
        int result = lc978.maxTurbulenceSize(arr);
        System.out.println(result);
    }
}