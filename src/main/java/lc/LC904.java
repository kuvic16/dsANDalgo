package lc;

public class LC904 {
    public int totalFruit(int[] fruits) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<fruits.length; i++){
            int[] m = new int[2];
            m[0] = fruits[i]; m[1] = -1;
            int count = 1;
            for(int j=i+1; j<fruits.length; j++){
                if(m[0] == fruits[j]) count++;
                else if(m[1] == -1){
                    m[1] = fruits[j];
                    count++;
                }else if(m[1] == fruits[j]) count++;
                else{
                    max = Math.max(max, count);
                    break;
                }
            }
            max = Math.max(max, count);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}

class LC904Test {
    public static void main(String[] args){
        LC904 lc904 = new LC904();
        //int[] fruits = {1,2,1};
//        int[] fruits = {0,1,2,2};
//        int[] fruits = {1,2,3,2,2};
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int result = lc904.totalFruit(fruits);
        System.out.println(result);
    }
}