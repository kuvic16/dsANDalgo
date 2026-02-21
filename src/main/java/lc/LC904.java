package lc;

public class LC904 {
    public int totalFruit(int[] fruits) {
        int max = Integer.MIN_VALUE, lastindex = -1, right = 1;
        int[] m = new int[2];
        m[0] = fruits[0]; m[1] = -1;
        int count = 1, prev = fruits[0];
        while (right < fruits.length){
            if(m[0] == fruits[right] || m[1] == fruits[right]) {
                if(prev != fruits[right]) {
                    lastindex = right;
                    prev = fruits[right];
                }
                count++; //0,1,6,6,4,4,6
            }
            else if(m[1] == -1){
                m[1] = fruits[right];
                count++;
                lastindex = right;
                prev = fruits[right];
            }else{
                max = Math.max(max, count);
                m[0] = fruits[lastindex];
                m[1] = fruits[right];
                count = right - lastindex + 1;
                lastindex = right;
                prev = fruits[right];
            }
            right++;
        }
        max = Math.max(max, count);
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}

class LC904Test {
    public static void main(String[] args){
        LC904 lc904 = new LC904();
//        int[] fruits = {1,2,1};
//        int[] fruits = {1,0,3,4,3};
        int[] fruits = {0,1,6,6,4,4,6};
//        int[] fruits = {0,1,2,2};
        //int[] fruits = {1,2,3,2,2};
        //int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
//        int[] fruits = {1,2,3,4};
        int result = lc904.totalFruit(fruits);
        System.out.println(result);
    }
}