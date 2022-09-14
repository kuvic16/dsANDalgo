package leetcode.array101;

public class CheckDoubleExist {
    public boolean checkIfExist(int[] arr) {
        boolean result = false;
        for(int i=0; i<arr.length; i++){
            for(int j= i +1; j<arr.length; j++){
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i]) {
                    result = true;
                    break;
                }
            }
            if(result) break;
        }
        return result;
    }
}
