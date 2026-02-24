package lc;

public class LC978 {
    /*
    For i <= k < j:
arr[k] > arr[k + 1] when k is odd, and
arr[k] < arr[k + 1] when k is even.
Or, for i <= k < j:
arr[k] > arr[k + 1] when k is even, and
arr[k] < arr[k + 1] when k is odd.
9,4,2,10,7,8,8,1,9]
     */
    public int maxTurbulenceSize(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int k = arr[i], count = 1; Boolean gt = null;
            for(int j=i+1; j<arr.length; j++){
                if((gt == null || !gt) && k < arr[j]){
                    count++;
                    gt = true;
                }else if((gt == null || gt) && k > arr[j]){
                    count++;
                    gt = false;
                }else{
                    break;
                }
                max = Math.max(max, count);
                k = arr[j];
            }
            max = Math.max(max, count);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}

class LC978Test {
    public static void main(String[] args){
        LC978 lc978 = new LC978();
        //int[] arr = {9,4,2,10,7,8,8,1,9};
        //int[] arr = {4,8,12,16};
        int[] arr = {100};
        int result = lc978.maxTurbulenceSize(arr);
        System.out.println(result);
    }
}