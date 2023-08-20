package leetcode.two_pointer;

public class LC11 {
    public int maxAreaX(int[] height) {
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

    public int maxAreaX2(int[] height) {
        int n = height.length;
        int max = 0, leftHieght = 0, rightHieght = height[n-1], j = n -1;
        for(int i=0; i<n; i++){
            leftHieght = height[i];
            int capacity =  (n - 1 - i) * (leftHieght < rightHieght ? leftHieght : rightHieght);
            if(capacity > max) max = capacity;

            int rHieght = height[j];
            capacity =  (j - 0) * (rHieght < height[0] ? rHieght : height[0]);
            if(capacity > max) max = capacity;
        }
        return max;
    }
}

class LC11Test {
    public static void main(String[] args){
        LC11 lc11 = new LC11();
        //System.out.println(lc11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        //System.out.println(lc11.maxArea(new int[]{1,2,4,3}));
        System.out.println(lc11.maxArea(new int[]{2,3,4,5,18,17,6}));
        
    }
}
