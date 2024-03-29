package leetcode.array101;

public class LC3228 {
    public int heightChecker(int[] heights) {
        int count = 0;
        int n = heights.length;
        int[] tmpHeights = new int[n];
        for(int i=0; i<n; i++){
            tmpHeights[i] = heights[i];
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(tmpHeights[i] > tmpHeights[j]){
                    int tmp = tmpHeights[i];
                    tmpHeights[i] = tmpHeights[j];
                    tmpHeights[j] = tmp;
                }
            }
        }

        for(int i=0; i<heights.length; i++){
            if(heights[i] != tmpHeights[i]) count += 1;
        }
        return count;
    }
}

class LC3228Test{
    public static void main(String[] args){
        LC3228 lc3228 = new LC3228();
//        int[] h = new int[]{1,1,4,2,1,3};
//        int[] h = new int[]{5,1,2,3,4};
        int[] h = new int[]{1,2,3,4,5};
        int result = lc3228.heightChecker(h);
        System.out.println(result);
    }
}