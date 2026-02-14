package lc;

import java.util.*;

public class LC658 {
    // int[] arr = {1,2,3,4,5}; int k=4, x = 3;
    // |a - x| < |b - x|, or
    //|a - x| == |b - x| and a < b
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        if(arr.length == 1) {
            result.add(arr[0]);
            return result;
        }
        int target = getTarget(arr, x);
        System.out.println("target index: " + target);

        if(target == 0) {
            for(int i=0; i<k; i++) result.add(arr[i]);
        }else if(target == arr.length - 1){
            for(int i=target; i>=0 && result.size() < k; i--) result.add(arr[i]);
        }else{
            result.add(arr[target]);
            int left = target - 1, right = target + 1;
            while(left >= -1 && right <= arr.length && result.size() < k){
                if(left == -1) {
                    result.add(arr[right]);
                    right++;
                }else if(right == arr.length){
                    result.add(arr[left]);
                    left--;
                }else if ((Math.abs(arr[left] - x) < Math.abs(arr[right] - x)) || (Math.abs(arr[left] - x) == Math.abs(arr[right] - x) && arr[left] < arr[right])) {
                    result.add(arr[left]);
                    left--;
                }else{
                    result.add(arr[right]);
                    right++;
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    private static int getTarget(int[] arr, int x) {
        int low = 0, high = arr.length - 1, target = -1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                target = mid;
                break;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(target == -1) {
            target = mid;
            if(target > 0) {
                if ((Math.abs(arr[target - 1] - x) < Math.abs(arr[target] - x)) || (Math.abs(arr[target - 1] - x) == Math.abs(arr[target] - x) && arr[target - 1] < arr[target])) {
                    target = target - 1;
                }
            }

            if(target + 1 < arr.length) {
                if ((Math.abs(arr[target + 1] - x) < Math.abs(arr[target] - x)) || (Math.abs(arr[target + 1] - x) == Math.abs(arr[target] - x) && arr[target + 1] < arr[target])) {
                    target = target + 1;
                }
            }
        }
        return target;
    }
}

class LC658Test {
    public static void main(String[] args) {
        LC658 lc658 = new LC658();
        //int[] arr = {-9, -8, -5, 1,2,3,6,11}; int k=4, x = 5;
        int[] arr = {1,2,3,4,5}; int k=4, x = 3;
//        int[] arr = {1,1,2,3,4,5}; int k=4, x = -1;
        List<Integer> result = lc658.findClosestElements(arr, k, x);
        for(Integer r : result) System.out.print(r + " ");
    }
}


