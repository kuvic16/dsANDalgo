package leetcode.array_and_string;

public class LC605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        int len = flowerbed.length;
        for(int i=0; i<len; i++){

            if(flowerbed[i] == 1) continue;

            if(i == 0){
                if(i+1 <= len -1 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n = n -1;
                }
                if(len == 1){
                    flowerbed[i] = 1;
                    n = n -1;
                }
            }else if (i == len - 1){
                if(i-1 >= 0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    n = n - 1;
                }
            }else{
                if(i+1 <= len -1 && flowerbed[i+1] == 0 && i-1 >= 0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    n = n -1;
                }                
            }
            if(n == 0) return true;
        }
        return n == 0;
    }
}

class LC605Test {
    public static void main(String[] args){
        LC605 lc605 = new LC605();
        boolean result = lc605.canPlaceFlowers(new int[] {1,0,0,0,1}, 2);
        System.out.println(result);
    }
}
