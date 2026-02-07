package lc;

import java.util.*;
import java.util.stream.Collectors;

public class LC3318 {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] result = new int[nums.length - k + 1];
        for(int i=0; i+k-1<nums.length; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j=i; j<i+k; j++){
                int cnt = map.getOrDefault(nums[j], 0) + 1;
                map.put(nums[j], cnt);
                System.out.print(nums[j] + " ");
            }
            System.out.println();
            PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                    (a, b) -> {
                            if (a.getValue().equals(b.getValue())) {
                                return b.getKey() - a.getKey();
                            }
                            return b.getValue() - a.getValue();
                        }
            );
            maxHeap.addAll(map.entrySet());
            int sum = 0, l = 0;
            while (!maxHeap.isEmpty() && l < x) {
                Map.Entry<Integer, Integer> sl = maxHeap.poll();
                if(sl.getValue() > 1) {
                    sum += (sl.getValue() * sl.getKey());
                }else {
                    sum += sl.getKey();
                }
                l++;
            }
            System.out.println(sum);
            result[i] = sum;
        }
        return result;
    }
}

class LC3318Test {
    public static void main(String[] args){
        LC3318 lc3318 = new LC3318();
        int[] nums = {1,1,2,2,3,4,2,3}; int k = 6, x = 2;
//       int[] nums = {3,8,7,8,7,5}; int k = 2, x = 2;
//        int[] nums = {2,7,10,9,5}; int k = 3, x = 2;
        int[] result = lc3318.findXSum(nums, k, x);
        for(int i : result) System.out.print(i + " ");
    }
}
