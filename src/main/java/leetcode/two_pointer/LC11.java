package leetcode.two_pointer;

public class LC11 {
    public int maxArea(int[] height) {
        int left=0, right = height.length - 1, max = 0, maxLeft = 0, maxRight = 0, minRow = 0;
        while(left < right){
            if(height[left] > height[maxLeft]) maxLeft = left;
            if(height[right] > height[maxRight]) maxRight = right;

            minRow = height[maxLeft];
            if(height[maxRight] < height[maxLeft]) minRow = height[maxRight];
            int capacity = minRow * (maxRight - maxLeft);
            if(capacity > max) max = capacity;
            left++; right--;
        }
        return max;
    }
}

class LC11Test {
    public static void main(String[] args){
        LC11 lc11 = new LC11();
        //System.out.println(lc11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(lc11.maxArea(new int[]{1,2,4,3}));
    }
}
