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

    public int maxAreaX3(int[] height) {
        int left = 0, maxCapacity = 0; 
        for(int i=1; i<height.length; i++){
            int capacity =  (i - left) * (height[left] < height[i] ? height[left] : height[i]);
            if(capacity > maxCapacity) maxCapacity = capacity;
            if(height[i] > height[left]) left = i;
        }
        return maxCapacity;
    }

    public int maxArea(int[] height) {
        int left = 0, maxCapacity = 0; 
        for(int i=0; i<height.length; i++){
            if(left > 0 && height[i] < height[left]) continue;
            else left = i;
            
            int j=i+1, k=height.length-1;
            while(j <= k){
                int capacity =  (j - i) * (height[j] < height[i] ? height[j] : height[i]);
                if(capacity > maxCapacity) maxCapacity = capacity;

                capacity =  (k - i) * (height[k] < height[i] ? height[k] : height[i]);
                if(capacity > maxCapacity) maxCapacity = capacity;

                j++; k--;
            }
        }
        return maxCapacity;
    }
}

class LC11Test {
    public static void main(String[] args){
        LC11 lc11 = new LC11();
        //System.out.println(lc11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        //System.out.println(lc11.maxArea(new int[]{1,2,4,3}));
        System.out.println(lc11.maxArea(new int[]{2,3,4,5,18,17,6}));
        //System.out.println(lc11.maxArea(new int[]{1,1}));
        
    }
}
